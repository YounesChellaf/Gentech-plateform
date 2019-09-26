package com.project2cs.demo.controller;

import com.project2cs.demo.model.Categorie;

import com.project2cs.demo.repo.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller

public class CategorieController {

	String redirectUrl = "/admin/categories";

	@Autowired
	private CategorieRepository categorieRep;

	@GetMapping("/admin/categories")
	public String getCategories(HttpSession session,ModelMap model){
		if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
		model.addAttribute("categories",categorieRep.findAll());
		return "admin/categorie";}
		return "login";
	}

	@PostMapping("/admin/add-categorie")
	public String addCategorie(HttpSession session,@RequestParam String nomCategorie,@RequestParam String description,@RequestParam String carracteristics){
		if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
		categorieRep.save(new Categorie(nomCategorie,description,carracteristics));
		return "redirect:" + redirectUrl;}
		return "login";
	}


	@PostMapping("/admin/update-categorie")
	public String UpdateCategorie(HttpSession session,@RequestParam int id,@RequestParam String nomCategorie,@RequestParam String description,@RequestParam String carracteristics){
		if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
		Categorie categorie = categorieRep.findById(id).get();
		categorie.setNomCategorie(nomCategorie);
		categorie.setDescription(description);
		categorie.setCarracteristics(carracteristics);
		categorieRep.save(categorie);
		return "redirect:" + redirectUrl;}
		return "login";
	}

	@PostMapping("/admin/remove-categorie")
	public String delCategorie(HttpSession session, @RequestParam int id){
		if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
		categorieRep.deleteById(id);
		return "redirect:" + redirectUrl;}
		return "login";
	}
}
