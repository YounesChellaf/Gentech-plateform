package com.project2cs.demo.controller;

import com.project2cs.demo.model.Institution;
import com.project2cs.demo.model.Rh;
import com.project2cs.demo.model.Role;
import com.project2cs.demo.model.Type;
import com.project2cs.demo.repo.InstitutionRepository;
import com.project2cs.demo.repo.RhRepository;
import com.project2cs.demo.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class RhController {

    String redirectUrl = "/admin/rh";

    @Autowired
    RhRepository rhRepository;
    @Autowired
    InstitutionRepository institutionRepository;

    @GetMapping("/admin/rh")
    public String rh(ModelMap model)
    {
        model.addAttribute("rhs",rhRepository.findAll());
        model.addAttribute("institus",institutionRepository.findAll());
        return "/admin/rh";
    }

    @RequestMapping(value = "/admin/add-rh",method = RequestMethod.POST)
    public String addRole(@RequestParam String nom,@RequestParam String description,@RequestParam String contact,@RequestParam long institu_id){

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        Institution institution = institutionRepository.findById(institu_id).get();
        rhRepository.save(new Rh(nom,description,contact,formatter.format(date),institution));
        return "redirect:" + redirectUrl ;
    }

//    @RequestMapping(value = "/admin/update-role",method = RequestMethod.POST)
//    public String updateRole(@RequestParam String designation,@RequestParam long id){
//        Role role = repository.findById(id).get();
//        role.setRole(designation);
//        repository.save(role);
//        return "redirect:" + redirectUrl ;
//    }
//
//    @RequestMapping(value = "/admin/remove-role",method = RequestMethod.POST)
//    public String deleteRole(@RequestParam long id){
//        repository.deleteById(id);
//        return "redirect:" + redirectUrl ;
//    }
}