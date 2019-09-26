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
    public String roles(ModelMap model)
    {
        model.addAttribute("articles",repository.findAll());
        return "/admin/articles";
    }

    @RequestMapping(value = "/admin/add-article",method = RequestMethod.POST)
    public String addArticle(@RequestParam MultipartFile image , @RequestParam String title, @RequestParam String content) throws IOException {

    	String fname = Math.random() + image.getOriginalFilename();
        FileModel filemode = new FileModel(fname);
        filesRepository.save(filemode);
        FileSystemStorageService fss= new FileSystemStorageService(new StorageProperties());
		fss.store(image, fname);
		
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        repository.save(new Article(title,content,formatter.format(date),filemode));
        return "redirect:" + redirectUrl ;
    }

    @RequestMapping(value = "/admin/update-article",method = RequestMethod.POST)
    public String updateRole(@RequestParam String title,@RequestParam String content, @RequestParam long id){
        Article article = repository.findById(id).get();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        article.setTitle(title);
        article.setContent(content);
        article.setPublish_date(formatter.format(date));
        repository.save(article);
        return "redirect:" + redirectUrl ;
    }

    @RequestMapping(value = "/admin/remove-article",method = RequestMethod.POST)
    public String deleteArticle(@RequestParam long id){
        repository.deleteById(id);
        return "redirect:" + redirectUrl ;
    }
}
