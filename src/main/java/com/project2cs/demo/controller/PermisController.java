package com.project2cs.demo.controller;

import com.project2cs.demo.model.PermisRequest;
import com.project2cs.demo.repo.PermisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PermisController {


    @Autowired
    PermisRepository repository;

    @GetMapping("/admin/request-permis")
    public String PermisShow(ModelMap model){

        model.addAttribute("requests",repository.findAll());
        return "admin/demand-requests";
    }
    @RequestMapping(value = "/submit-demand",method = RequestMethod.POST)
    public String add(@RequestParam String lastName,
                      @RequestParam String firstName,
                      @RequestParam String email,
                      @RequestParam String socialReason,
                      @RequestParam String resource,
                      @RequestParam String description){
        repository.save(new PermisRequest(lastName,firstName,email,socialReason,resource,description,"draft"));
        return "landing/home";
    }
}
