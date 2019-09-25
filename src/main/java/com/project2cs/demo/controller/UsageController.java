package com.project2cs.demo.controller;


import com.project2cs.demo.model.Categorie;
import com.project2cs.demo.model.Ressource;
import com.project2cs.demo.model.Type;
import com.project2cs.demo.model.Usage;
import com.project2cs.demo.repo.RessourceRepository;
import com.project2cs.demo.repo.UsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsageController {

    @Autowired
    UsageRepository usageRepository;
    @Autowired
    RessourceRepository ressourceRepository;

    @PostMapping("/add-usage")
    public String addUsage(@RequestParam String description,@RequestParam int resource_id){
        Ressource ressource = ressourceRepository.findById(resource_id).get();
        usageRepository.save(new Usage(description,ressource));
        return "/landing/home" ;
    }

}
