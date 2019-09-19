package com.project2cs.demo.controller;

import com.project2cs.demo.model.Localisation;

import com.project2cs.demo.repo.LocalisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/localisation_manager")
public class LocalisationController {

	@Autowired
	private LocalisationRepository localRep;
	
	@GetMapping("/showall")
	public List<Localisation> getLocalisations(){
		return localRep.findAll();
	}
	
	@GetMapping("/showall/{ressource_id}")
	public List<Localisation> getLocalisationsOfRessource(@PathVariable int ressource_id){
		return localRep.findByRessourceId(ressource_id);
	}
	
	@GetMapping("/show/{id}")
	public Optional<Localisation> getLocalisationByID(@PathVariable int id){
		return localRep.findById(id);
	}
	
	@DeleteMapping("/del/{id}")
	public List<Localisation> delLocalisationById(@PathVariable int id){
		localRep.deleteById(id);
		return localRep.findAll();
	}
	
	@PostMapping("/add")
	public List<Localisation> addLocalisation(@RequestBody Localisation localisation){
		localRep.save(localisation);
		return localRep.findAll();
	}
	
	@PutMapping("/edit")
	public List<Localisation> editlocalisation(@RequestBody Localisation localisation){
		localRep.save(localisation);
		return localRep.findAll();
	} 
}
