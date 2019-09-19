package com.project2cs.demo.controller;

import com.project2cs.demo.model.Ressource;

import com.project2cs.demo.repo.RessourceRepository;
import com.project2cs.demo.repo.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ressource_manager")
public class RessourceController {
	
	@Autowired
	private RessourceRepository ressourceRep;
	private TypeRepository typeRepository;
	
	@GetMapping("showall")
	public List<Ressource> getRessources(){
		return ressourceRep.findAll();
	}
	
	@GetMapping("show/{id}")
	public Optional<Ressource> getRessourceByID(@PathVariable int id){
		return ressourceRep.findById(id);
	}
	
	@DeleteMapping("del/{id}")
	public List<Ressource> delRessource(@PathVariable int id){
		ressourceRep.deleteById(id);
		return ressourceRep.findAll();
	}
	
	@PostMapping("add")
	public List<Ressource> addRessource(@RequestBody Ressource ressource){
		ressourceRep.save(ressource);
		return ressourceRep.findAll();
	}
	
	@PutMapping("edit")
	public List<Ressource> editRessource(@RequestBody Ressource ressource){
		ressourceRep.save(ressource);
		return ressourceRep.findAll();
	} 
	
}
