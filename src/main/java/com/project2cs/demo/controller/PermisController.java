package com.project2cs.demo.controller;

import com.project2cs.demo.controller.storage.FileSystemStorageService;
import com.project2cs.demo.controller.storage.StorageProperties;
import com.project2cs.demo.model.FileModel;
import com.project2cs.demo.model.PermisRequest;
import com.project2cs.demo.model.Utilisateur;
import com.project2cs.demo.repo.FilesRepository;
import com.project2cs.demo.repo.PermisRepository;
import com.project2cs.demo.repo.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class PermisController {


    @Autowired
    PermisRepository repository;
    @Autowired
    FilesRepository filesRepository;
    @Autowired
    UtilisateurRepository utilisateurRepository;

    String redirectUrl = "/admin/request-permis";

    @GetMapping("/admin/request-permis")
    public String PermisShow(HttpSession session, ModelMap model){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("admin"))){
            model.addAttribute("requests",repository.findByState("draft"));
            return "admin/demand-requests";}
        return "login";
    }

    @PostMapping("/admin/validate-request")
    public String ValidateRequest(@RequestParam long request_id){
        PermisRequest request = repository.findById(request_id).get();
        request.setState("progress");
        repository.save(request);
        return "redirect:" + redirectUrl ;
    }

    @PostMapping("/admin/reject")
    public String RejectRequest(@RequestParam long request_id){
        PermisRequest request = repository.findById(request_id).get();
        request.setState("rejected");
        repository.save(request);
        return "redirect:" + redirectUrl ;
    }

    @PostMapping("/expert/validate-usage")
    public String ValidateUsage(HttpSession session,@RequestParam long request_id){
        PermisRequest request = repository.findById(request_id).get();
        Utilisateur user = request.getUser();
        user.putPermission();
        utilisateurRepository.save(user);
        request.setState("success");
        repository.save(request);
        session.setAttribute("traitement","accepted");
        return "redirect:" + "/expert/request-permis" ;
    }

    @PostMapping("/expert/reject")
    public String RejectUsage(@RequestParam long request_id){
        PermisRequest request = repository.findById(request_id).get();
        request.setState("rejected");
        repository.save(request);
        return "redirect:" + "/expert/request-permis" ;
    }
    @GetMapping("/expert/request-permis")
    public String PermisExpertShow(HttpSession session,ModelMap model){
        if (((boolean)session.getAttribute("logged_in")==true) && (session.getAttribute("role").equals("expert"))){
            model.addAttribute("requests",repository.findByState("progress"));
            return "admin/demand-request-validation";}
        return "login";
    }
    @RequestMapping(value = "/submit-demand",method = RequestMethod.POST)
    public String add(HttpSession session,
                      @RequestParam String lastName,
                      @RequestParam String firstName,
                      @RequestParam String resource,
                      @RequestParam String email,
                      @RequestParam String reason,
                      @RequestParam String description,
                      @RequestParam MultipartFile file) throws IOException {
        session.setAttribute("traitement","posted");
    	String fname = Math.random() + file.getOriginalFilename();
        FileModel filemode = new FileModel(fname);
        filesRepository.save(filemode);
        FileSystemStorageService fss= new FileSystemStorageService(new StorageProperties());
		fss.store(file, fname);

		Utilisateur user = (Utilisateur) session.getAttribute("user");

        repository.save(new PermisRequest(lastName,firstName,email,reason,description,"draft",filemode,resource,user));
        return "landing/resource-details";
    }

//    @RequestMapping(value = "/submit-demand",method = RequestMethod.POST)
//    public String add(HttpSession session,@RequestParam String lastName,
//                      @RequestParam String firstName,
//                      @RequestParam String email,
//                      @RequestParam String reason,
//                      @RequestParam String description){
//        Utilisateur user = (Utilisateur) session.getAttribute("user");
//        repository.save(new PermisRequest(lastName,firstName,email,reason,description,"draft",user,null,null));
//        return "landing/home";
//    }
}
