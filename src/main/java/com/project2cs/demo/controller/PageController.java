package com.project2cs.demo.controller;

import com.project2cs.demo.repo.ArticleRepository;
import com.project2cs.demo.repo.RoleRepository;
import com.project2cs.demo.repo.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;



@Controller
@SessionAttributes
public class PageController {

    @Autowired
    ArticleRepository Articlerepository;
    RoleRepository roleRepository;

    @GetMapping("/")
    public String home(ModelMap model)
    {
        model.addAttribute("articles",Articlerepository.findAll());
        return "landing/home";
    }

    @GetMapping("/resource-details")
    public String resourceDetails()
    {
        return "landing/resource-details";
    }

    @GetMapping("/resource-demand")
    public String demand()
    {
        return "landing/resource-demand";
    }


    @GetMapping("/help-demand")
    public String help()
    {
        return "landing/demand-help";
    }

    @GetMapping("/resources")
    public String resources()
    {
        return "landing/resources";
    }

    @GetMapping("/institutions")
    public String institution()
    {
        return "landing/institution";
    }


    @GetMapping("/admin")
    public String admin()
    {
        return "admin/plain-page";
    }

    @GetMapping("/admin/institution")
    public String adminInstitution()
    {
        return "admin/admin-institution";
    }

    @GetMapping("/connecter")
    public String login(ModelMap model)
    {
        model.addAttribute("roles",roleRepository.findAll());
        return "login";
    }

    @GetMapping("lois-reglements")
    public String reglement()
    {
        return "landing/reglement";
    }




    public static void main(String[] args) {
        SpringApplication.run(PageController.class,args);
    }

}
