package com.project2cs.demo.controller;

import com.project2cs.demo.model.PermisRequest;
import com.project2cs.demo.model.Reglement;
import com.project2cs.demo.repo.PermisRepository;
import com.project2cs.demo.repo.ReglementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReglementController {

    String redirectUrl = "admin/loi-reglement";

    @Autowired
    ReglementRepository repository;

    @GetMapping("/admin/reglement")
    public String ReglementShow(ModelMap model){

        model.addAttribute("reglements",repository.findAll());
        return "admin/loi-reglement";
    }
//    @RequestMapping(value = "/submit-demand",method = RequestMethod.POST)
//    public String add(@RequestParam String designation,
//                      @RequestParam String description,
//                      @RequestParam String loi_file){
//        repository.save(new Reglement(designation,description,loi_file));
//        return "redirect:" + redirectUrl ;
//    }
}