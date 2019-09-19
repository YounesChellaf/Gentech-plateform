package com.project2cs.demo.controller;

import com.project2cs.demo.model.Role;
import com.project2cs.demo.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class RoleController {

    String redirectUrl = "/admin/roles";

    @Autowired
    RoleRepository repository;

    @GetMapping("/admin/roles")
    public String roles(ModelMap model)
    {
        model.addAttribute("roles",repository.findAll());
        return "/admin/role";
    }

    @RequestMapping(value = "/admin/add-role",method = RequestMethod.POST)
    public String addRole(@RequestParam String designation){
        repository.save(new Role(designation));
        return "redirect:" + redirectUrl ;
    }

    @RequestMapping(value = "/admin/update-role",method = RequestMethod.POST)
    public String updateRole(@RequestParam String designation,@RequestParam long id){
        Role role = repository.findById(id).get();
        role.setRole(designation);
        repository.save(role);
        return "redirect:" + redirectUrl ;
    }

    @RequestMapping(value = "/admin/remove-role",method = RequestMethod.POST)
    public String deleteRole(@RequestParam long id){
        repository.deleteById(id);
        return "redirect:" + redirectUrl ;
    }
}
