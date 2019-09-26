package com.project2cs.demo.controller;



import com.project2cs.demo.model.Utilisateur;
import com.project2cs.demo.repo.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class TestApi {

    String redirectUrl = "/admin/users";

    @Autowired
    UtilisateurRepository repository;


    @PostMapping(value = "/test-login")
    public String login(@RequestParam String userName,
                        @RequestParam String password){


        Utilisateur user = repository.findByUserName(userName).get();
       // return  user;
        //return user.getPassword();

        if ( user.getPassword().equals(password)) {
            return "connected" ;
        }
        else {
            return "not";
        }

    }

    @GetMapping(value = "access")
    public String test(HttpSession session)
    {
        return  (String) session.getAttribute("role");
//        if ((boolean)session.getAttribute("logged_in")==true && (String) session.getAttribute("role")=="admin"){
//            return "admin/plain-page";}
//        else
//            return "login";
    }


}
