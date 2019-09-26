package com.project2cs.demo.controller;

import com.project2cs.demo.controller.storage.FileSystemStorageService;
import com.project2cs.demo.controller.storage.StorageProperties;
import com.project2cs.demo.model.FileModel;
import com.project2cs.demo.model.PermisRequest;
import com.project2cs.demo.repo.FilesRepository;
import com.project2cs.demo.repo.PermisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class PermisController {


    @Autowired
    PermisRepository repository;
    @Autowired
    FilesRepository filesRepository;

    @GetMapping("/admin/request-permis")
    public String PermisShow(ModelMap model){

        model.addAttribute("requests",repository.findAll());
        return "admin/demand-requests";
    }
    @RequestMapping(value = "/submit-demand",method = RequestMethod.POST)
    public String add(@RequestParam String lastName,
                      @RequestParam String firstName,
                      @RequestParam String email,
                      @RequestParam String raison,
                      @RequestParam String description,
                      @RequestParam MultipartFile file) throws IOException {
    	
    	String fname = Math.random() + file.getOriginalFilename();
        FileModel filemode = new FileModel(fname);
        filesRepository.save(filemode);
        FileSystemStorageService fss= new FileSystemStorageService(new StorageProperties());
		fss.store(file, fname);
		
        repository.save(new PermisRequest(lastName,firstName,email,raison,description,"draft",filemode));
        return "landing/home";
    }
}
