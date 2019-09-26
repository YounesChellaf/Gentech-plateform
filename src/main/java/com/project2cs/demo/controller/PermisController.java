package com.project2cs.demo.controller;

import com.project2cs.demo.model.FileModel;
import com.project2cs.demo.model.PermisRequest;
import com.project2cs.demo.repo.FilesRepository;
import com.project2cs.demo.repo.PermisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class PermisController {


    @Autowired
    PermisRepository repository;
    @Autowired
    FilesRepository filesRepository;

    @GetMapping("/admin/request-permis")
    public String PermisShow(HttpSession session,ModelMap model){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
        model.addAttribute("requests",repository.findByState("draft"));
        return "admin/demand-requests";}
        return "login";
    }

    @GetMapping("/expert/request-permis")
    public String PermisExpertShow(HttpSession session,ModelMap model){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("expert"))){
        model.addAttribute("requests",repository.findByState("progress"));
        return "admin/demand-request-validation";}
        return "login";
    }
    @RequestMapping(value = "/submit-demand",method = RequestMethod.POST)
    public String add(@RequestParam String lastName,
                      @RequestParam String firstName,
                      @RequestParam String email,
                      @RequestParam String reason,
                      @RequestParam String description){
        repository.save(new PermisRequest(lastName,firstName,email,reason,description,"draft"));
        return "landing/home";
    }
}
