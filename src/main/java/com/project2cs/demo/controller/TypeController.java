package com.project2cs.demo.controller;

import com.project2cs.demo.model.Type;
import com.project2cs.demo.repo.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/types_manager")
public class TypeController {

	@Autowired
	private TypeRepository typeRep;
	
	@GetMapping("/showall")
	public List<Type> getTypes(){
		return typeRep.findAll();
	}
	
	@GetMapping("/show/{id}")
	public Optional<Type> getRessourceByID(@PathVariable int id){
		return typeRep.findById(id);
	}
	
	@DeleteMapping("/del/{id}")
	public List<Type> delType(@PathVariable int id){
		typeRep.deleteById(id);
		return typeRep.findAll();
	}
	
	@PostMapping("/add")
	public List<Type> addType(@RequestBody Type type){
		typeRep.save(type);
		return typeRep.findAll();
	}
	
	@PutMapping("/edit")
	public List<Type> editType(@RequestBody Type type){
		typeRep.save(type);
		return typeRep.findAll();
	} 
}
