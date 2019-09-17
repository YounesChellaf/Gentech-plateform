package com.project2cs.demo.controller;



import com.project2cs.demo.model.Utilisateur;
import com.project2cs.demo.repo.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UtilisateurController {

    @Autowired
    UtilisateurRepository repository;


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestParam String userName,
                      @RequestParam String email,
                      @RequestParam String password){

        repository.save(new Utilisateur(userName,email,password,false));
        return "landing/home";

    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam String userName,
                        @RequestParam String password){


        Utilisateur user = repository.findByUserName(userName);


        if ( user.getPassword() == password ) {
            return "landing/home" ;
        }
        else {
            return "login";
        }

    }

    @RequestMapping(value = "/admin/block-user",method = RequestMethod.POST)
    public String block(@RequestParam long id)
    {

        return "admin/users-list";
    }

    @RequestMapping(value = "/admin/unblock-user",method = RequestMethod.POST)
    public String unblock(@RequestParam long id)
    {

        return "admin/users-list";
    }


    @GetMapping("/admin/users")
    public String users(ModelMap model)
    {
        model.addAttribute("users",repository.findAll());
        return "admin/users-list";
    }


}
