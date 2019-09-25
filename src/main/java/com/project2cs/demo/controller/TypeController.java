package com.project2cs.demo.controller;

import com.project2cs.demo.model.Categorie;
import com.project2cs.demo.model.Type;
import com.project2cs.demo.repo.CategorieRepository;
import com.project2cs.demo.repo.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class TypeController {

	String redirectUrl = "/admin/type";

	@Autowired
	private TypeRepository typeRep;
	@Autowired
	private CategorieRepository categorieRepository;
	
	@GetMapping("/admin/type")
	public String getTypes(ModelMap model){

		model.addAttribute("types",typeRep.findAll());
		model.addAttribute("categories",categorieRepository.findAll());
		return "admin/type";
	}
	@PostMapping("/admin/add-type")
	public String addType(@RequestParam String nomType,@RequestParam String description,@RequestParam String carracteristics,@RequestParam int categorie_id){

		Categorie categorie = categorieRepository.findById(categorie_id).get();
		typeRep.save(new Type(nomType,description,carracteristics,categorie));
		return "redirect:" + redirectUrl ;
	}

	@PostMapping("/admin/update-type")
	public String UpdateType(@RequestParam int id,@RequestParam String nomType,@RequestParam String description,@RequestParam String carracteristics,@RequestParam int categorie_id){
		Categorie categorie = categorieRepository.findById(categorie_id).get();
		Type type = typeRep.findById(id).get();
		type.setNomType(nomType);
		type.setCarracteristics(carracteristics);
		type.setDescription(description);
		type.setCategorie(categorie);

		return "redirect:" + redirectUrl;
	}

	@PostMapping("/admin/remove-type")
	public String delCategorie(@RequestParam int id){
		typeRep.deleteById(id);
		return "redirect:" + redirectUrl;
	}
	
//	@GetMapping("/show/{id}")
//	public Optional<Type> getRessourceByID(@PathVariable int id){
//		return typeRep.findById(id);
//	}
//
//	@DeleteMapping("/del/{id}")
//	public List<Type> delType(@PathVariable int id){
//		typeRep.deleteById(id);
//		return typeRep.findAll();
//	}
//
//
//	@PutMapping("/edit")
//	public List<Type> editType(@RequestBody Type type){
//		typeRep.save(type);
//		return typeRep.findAll();
//	}
}
