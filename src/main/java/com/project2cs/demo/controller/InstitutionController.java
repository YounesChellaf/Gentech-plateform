package com.project2cs.demo.controller;

import com.project2cs.demo.controller.storage.FileSystemStorageService;
import com.project2cs.demo.controller.storage.StorageProperties;
import com.project2cs.demo.model.Categorie;
import com.project2cs.demo.model.FileModel;
import com.project2cs.demo.model.Institution;
import com.project2cs.demo.repo.FilesRepository;
import com.project2cs.demo.repo.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class InstitutionController {

    String redirectUrl = "/admin/institution";
    @Autowired
    InstitutionRepository institutionRepository;
    @Autowired
    FilesRepository filesRepository;

    @GetMapping("/admin/institution")
    public String getInstitution(ModelMap model, HttpSession session){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
        model.addAttribute("institutions",institutionRepository.findAll());
        return "admin/institution";}
        return "login";
    }

    @PostMapping("/admin/add-institution")
    public String addInstitu(HttpSession session,@RequestParam MultipartFile image , @RequestParam String nom, @RequestParam String location, @RequestParam String region, @RequestParam String description) throws IOException {
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
        String fname = image.getOriginalFilename();
        FileModel filemode = new FileModel(fname);
        filesRepository.save(filemode);
        FileSystemStorageService fss= new FileSystemStorageService(new StorageProperties());
		fss.store(image, fname);
        institutionRepository.save(new Institution(nom,location,description,region,filemode));
        return "redirect:" + redirectUrl;}
        return "login";
    }

    @PostMapping("/admin/update-institution")
    public String UpdateInstitu(HttpSession session,@RequestParam long id,@RequestParam String name,@RequestParam String description,@RequestParam String region,@RequestParam String location){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
        Institution institution = institutionRepository.findById(id).get();
        institution.setName(name);
        institution.setDescription(description);
        institution.setLocation(location);
        institution.setRegion(region);
        institutionRepository.save(institution);
        return "redirect:" + redirectUrl;}
        return "login";
    }

    @PostMapping("/admin/remove-institution")
    public String delInstitution(HttpSession session,@RequestParam long id){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
        institutionRepository.deleteById(id);
        return "redirect:" + redirectUrl;}
        return "login";
    }
}

