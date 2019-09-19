package com.project2cs.demo.controller;

import com.project2cs.demo.model.Categorie;

import com.project2cs.demo.repo.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories_manager")
public class CategorieController {

	@Autowired
	private CategorieRepository categorieRep;
	
	@GetMapping("/showall")
	public List<Categorie> getCategories(){
		return categorieRep.findAll();
	}
	
	@GetMapping("/show/{id}")
	public Optional<Categorie> getCategorieByID(@PathVariable int id){
		return categorieRep.findById(id);
	}
	
	@DeleteMapping("/del/{id}")
	public List<Categorie> delCategorie(@PathVariable int id){
		categorieRep.deleteById(id);
		return categorieRep.findAll();
	}
	
	@PostMapping("/add")
	public List<Categorie> addCategorie(@RequestBody Categorie categorie){
		categorieRep.save(categorie);
		return categorieRep.findAll();
	}
	
	@PutMapping("/edit")
	public List<Categorie> editCategorie(@RequestBody Categorie categorie){
		categorieRep.save(categorie);
		return categorieRep.findAll();
	} 
}
