package com.project2cs.demo.controller;



import com.project2cs.demo.model.Role;
import com.project2cs.demo.model.Utilisateur;
import com.project2cs.demo.repo.RoleRepository;
import com.project2cs.demo.repo.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UtilisateurController {

    String redirectUrl = "/admin/users";

    @Autowired
    UtilisateurRepository repository;
    @Autowired
    RoleRepository roleRepository;


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestParam String userName,
                      @RequestParam String email,
                      @RequestParam int role_id,
                      @RequestParam String password,
                      @RequestParam String confirm_password){

        Role role = roleRepository.findById((long) role_id).get();
        repository.save(new Utilisateur(userName,email,password,false,role));
        return "landing/home";

    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpSession session, @RequestParam String userName,
                        @RequestParam String password){


        Utilisateur user = repository.findByUserName(userName).get();
        if ( user.getPassword().equals(password)) {
            session.setAttribute("logged_in",true);
            session.setAttribute("user",user);
            session.setAttribute("role",user.getRole().getDesignation());
            return "landing/home" ;
        }
        else {
            return "login";
        }

    }

    @RequestMapping(value = "/admin/block-user",method = RequestMethod.POST)
    public String block(@RequestParam long id)
    {
        Utilisateur user = repository.findById(id).get();
        user.Block();
        repository.save(user);
        return "redirect:" + redirectUrl ;
    }

    @RequestMapping(value = "/admin/unblock-user",method = RequestMethod.POST)
    public String unblock(@RequestParam long id)
    {
        Utilisateur user = repository.findById(id).get();
        user.UnBlock();
        repository.save(user);
        return "redirect:" + redirectUrl ;
    }


    @GetMapping("/admin/users")
    public String users(ModelMap model)
    {
        model.addAttribute("users",repository.findAll());
        return "admin/users-list";
    }

    @GetMapping("logout")
    public String logout(HttpSession session)
    {
        session.setAttribute("logged_in",false);
        return "landing/home";
    }


}
