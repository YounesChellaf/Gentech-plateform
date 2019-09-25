package com.project2cs.demo.controller;

import com.project2cs.demo.model.FileModel;
import com.project2cs.demo.model.PermisRequest;
import com.project2cs.demo.model.Reglement;
import com.project2cs.demo.model.Type;
import com.project2cs.demo.repo.FilesRepository;
import com.project2cs.demo.repo.PermisRepository;
import com.project2cs.demo.repo.ReglementRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

@Controller
public class ReglementController {

    String redirectUrl = "/admin/reglement";

    @Autowired
    ReglementRepository repository;
    @Autowired
    FilesRepository filesRepository;

    @GetMapping("/admin/reglement")
    public String ReglementShow(ModelMap model){

        model.addAttribute("reglements",repository.findAll());
        return "admin/reglement";
    }
    @RequestMapping(value = "/admin/add-reglement",method = RequestMethod.POST)
    public String add(@RequestParam String designation,
                      @RequestParam String description,
                      @RequestParam String mot_cle,
                      @RequestParam MultipartFile file) throws IOException {

        FileModel filemode = new FileModel(file.getOriginalFilename(), file.getContentType(), file.getBytes());
        filesRepository.save(filemode);
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        repository.save(new Reglement(designation,description,mot_cle,formatter.format(date),filemode));
        return "redirect:" + redirectUrl ;
    }
}