package com.project2cs.demo.controller;

import com.project2cs.demo.model.Article;
import com.project2cs.demo.model.Ressource;
import com.project2cs.demo.model.Rh;
import com.project2cs.demo.model.Role;
import com.project2cs.demo.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@SessionAttributes
public class PageController {

    @Autowired
    ArticleRepository Articlerepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    TypeRepository typeRepository;
    @Autowired
    RessourceRepository ressourceRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    InstitutionRepository institutionRepository;
    @Autowired
    UsageRepository usageRepository;
    @Autowired
    ReglementRepository reglementRepository;
    @Autowired
    RhRepository rhRepository;
    @Autowired
    ArticleRepository articleRepository;
    @GetMapping("/")
    public String home(ModelMap model)
    {
        model.addAttribute("types",typeRepository.findAll());
        model.addAttribute("articles",Articlerepository.findAll());
        model.addAttribute("institutions",institutionRepository.findAll());
        return "landing/home";
    }


    @PostMapping("/resource-details")
    public String resourceDetails(ModelMap model,@RequestParam  int id)
    {
        Ressource ressource = ressourceRepository.findById(id).get();
        //model.addAttribute("usage",usageRepository.findById((long) ressource.getId()));
        model.addAttribute("resource",ressource);
        return "landing/resource-details";
    }

    @PostMapping("/article-details")
    public String ArticleDetails(ModelMap model,@RequestParam  int article_id)
    {
        Article article = articleRepository.findById((long) article_id).get();
        model.addAttribute("article",article);
        return "landing/article-details";
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

    public String resources(ModelMap model)
    {
        model.addAttribute("resources",ressourceRepository.findAll());
        model.addAttribute("categories",categorieRepository.findAll());
        model.addAttribute("institutions",institutionRepository.findAll());
        return "landing/resources";
    }

    @GetMapping("/institutions")
    public String institution(ModelMap model)

    {
        model.addAttribute("institutions",institutionRepository.findAll());
        return "landing/institution";
    }

    @PostMapping("institution-rh-details")
    public String rh(ModelMap model,@RequestParam int institu_id)
    {
        List<Rh> rh = rhRepository.findByInstitutionId(institu_id);
        model.addAttribute("rhs",rh);
        return "landing/rh";
    }
    @GetMapping( value = "/admin")
    public String admin(HttpSession session)
    {
        //return  (String) session.getAttribute("role");
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
            return "admin/plain-page";}
        else
            return "login";
    }

//    @GetMapping("/admin/institution")
//    public String adminInstitution()
//    {
//        return "admin/admin-institution";
//    }

    @GetMapping("/login")
    public String login(ModelMap model)
    {
        model.addAttribute("roles",roleRepository.findAll());
        return "login";
    }
    @GetMapping("/register")
    public String register(ModelMap model)
    {
        model.addAttribute("roles",roleRepository.findAll());
        return "login#signup";
    }

    @GetMapping("lois-reglements")
    public String reglement(ModelMap model)
    {
        model.addAttribute("reglements",reglementRepository.findAll());
        return "landing/reglement";
    }




    public static void main(String[] args) {
        SpringApplication.run(PageController.class,args);
    }

}
