package com.project2cs.demo.controller;

import com.project2cs.demo.model.Customer;
import com.project2cs.demo.repo.InstitutionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InstitutionController {

    InstitutionRepository repository;
}
