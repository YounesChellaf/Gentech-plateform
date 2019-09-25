package com.project2cs.demo.controller;

import com.project2cs.demo.model.Categorie;

import com.project2cs.demo.repo.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller

public class CategorieController {

	String redirectUrl = "/admin/categories";

	@Autowired
	private CategorieRepository categorieRep;

	@GetMapping("/admin/categories")
	public String getCategories(ModelMap model){
		model.addAttribute("categories",categorieRep.findAll());
		return "admin/categorie";
	}

	@PostMapping("/admin/add-categorie")
	public String addCategorie(@RequestParam String nomCategorie,@RequestParam String description,@RequestParam String carracteristics){
		categorieRep.save(new Categorie(nomCategorie,description,carracteristics));
		return "redirect:" + redirectUrl;
	}


	@PostMapping("/admin/update-categorie")
	public String UpdateCategorie(@RequestParam int id,@RequestParam String nomCategorie,@RequestParam String description,@RequestParam String carracteristics){
		Categorie categorie = categorieRep.findById(id).get();
		categorie.setNomCategorie(nomCategorie);
		categorie.setDescription(description);
		categorie.setCarracteristics(carracteristics);
		categorieRep.save(categorie);
		return "redirect:" + redirectUrl;
	}

	@PostMapping("/admin/remove-categorie")
	public String delCategorie(@RequestParam int id){
		categorieRep.deleteById(id);
		return "redirect:" + redirectUrl;
	}
}
