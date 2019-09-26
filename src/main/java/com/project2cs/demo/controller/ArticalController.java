package com.project2cs.demo.controller;

import com.project2cs.demo.controller.storage.FileSystemStorageService;
import com.project2cs.demo.controller.storage.StorageProperties;
import com.project2cs.demo.model.Article;
import com.project2cs.demo.model.FileModel;
import com.project2cs.demo.repo.ArticleRepository;
import com.project2cs.demo.repo.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


@Controller
public class ArticalController {

    String redirectUrl = "/admin/articles";

    @Autowired
    ArticleRepository repository;
    @Autowired
    FilesRepository filesRepository;

    @GetMapping("/admin/articles")
    public String roles(ModelMap model, HttpSession session)
    {
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
            model.addAttribute("articles",repository.findAll());
            return "/admin/articles";}
        else  return "login";
    }

    @RequestMapping(value = "/admin/add-article",method = RequestMethod.POST)
    public String addArticle(HttpSession session,@RequestParam MultipartFile image , @RequestParam String title, @RequestParam String content) throws IOException {
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
    	String fname = image.getOriginalFilename();
        FileModel filemode = new FileModel(fname);
        filesRepository.save(filemode);
        FileSystemStorageService fss= new FileSystemStorageService(new StorageProperties());
		fss.store(image, fname);
		
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        repository.save(new Article(title,content,formatter.format(date),filemode));
        return "redirect:" + redirectUrl ;}
        return "login";
    }

    @RequestMapping(value = "/admin/update-article",method = RequestMethod.POST)
    public String updateRole(HttpSession session,@RequestParam String title,@RequestParam String content, @RequestParam long id){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
        Article article = repository.findById(id).get();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        article.setTitle(title);
        article.setContent(content);
        article.setPublish_date(formatter.format(date));
        repository.save(article);
        return "redirect:" + redirectUrl ;}
        return "login";
    }

    @RequestMapping(value = "/admin/remove-article",method = RequestMethod.POST)
    public String deleteArticle(HttpSession session,@RequestParam long id){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
        repository.deleteById(id);
        return "redirect:" + redirectUrl ;}
        return "login";
    }
}

