package com.project2cs.demo.controller;

import com.project2cs.demo.model.Customer;
import com.project2cs.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.Arrays;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository repository;

    @RequestMapping("/save")
    public String process(){
        // save a single Customer
        repository.save(new Customer("Jack", "Smith"));

        // save a list of Customers

        return "Done";
    }
}
