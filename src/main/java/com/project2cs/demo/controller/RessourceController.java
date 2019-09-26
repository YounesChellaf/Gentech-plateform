package com.project2cs.demo.controller;

import com.project2cs.demo.controller.storage.FileSystemStorageService;
import com.project2cs.demo.controller.storage.StorageProperties;
import com.project2cs.demo.model.*;

import com.project2cs.demo.repo.FilesRepository;
import com.project2cs.demo.repo.InstitutionRepository;
import com.project2cs.demo.repo.RessourceRepository;
import com.project2cs.demo.repo.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class RessourceController {

	String redirectUrl = "/admin/resources";
	
	@Autowired
	private RessourceRepository ressourceRep;
	@Autowired
	private TypeRepository typeRepository;
	@Autowired
	FilesRepository filesRepository;
	@Autowired
	InstitutionRepository institutionRepository;
	
	@GetMapping("/admin/resources/{id}")
	public String getRessources(ModelMap model){
		model.addAttribute("resources",ressourceRep.findAll());
		return "admin/resources";
	}

	@PostMapping("/add-resource")
	public String addType(@RequestParam int institu_id,@RequestParam MultipartFile image, @RequestParam String nom, @RequestParam String description, @RequestParam String carracteristics, @RequestParam int type_id) throws IOException {

		Institution institution = institutionRepository.findById((long) institu_id).get();
		
		String fname = Math.random() + image.getOriginalFilename();
        FileModel filemode = new FileModel(fname);
        filesRepository.save(filemode);
        FileSystemStorageService fss= new FileSystemStorageService(new StorageProperties());
		fss.store(image, fname);
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(System.currentTimeMillis());
		Type type = typeRepository.findById(type_id).get();
		ressourceRep.save(new Ressource(nom,type,formatter.format(date),"disponible",description,carracteristics,filemode,institution));
		return "landing/home";
	}
	
//	@GetMapping("show/{id}")
//	public Optional<Ressource> getRessourceByID(@PathVariable int id){
//		return ressourceRep.findById(id);
//	}
//
//	@DeleteMapping("del/{id}")
//	public List<Ressource> delRessource(@PathVariable int id){
//		ressourceRep.deleteById(id);
//		return ressourceRep.findAll();
//	}
//
//	@PostMapping("add")
//	public List<Ressource> addRessource(@RequestBody Ressource ressource){
//		ressourceRep.save(ressource);
//		return ressourceRep.findAll();
//	}
//
//	@PutMapping("edit")
//	public List<Ressource> editRessource(@RequestBody Ressource ressource){
//		ressourceRep.save(ressource);
//		return ressourceRep.findAll();
//	}
	
}
