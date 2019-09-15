package com.project2cs.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author CrunchDroid
 */
@Controller
@SessionAttributes
public class PageController {

    @GetMapping("/admin")
    public String admin()
    {
        return "plain-page";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @GetMapping("/pricing-tables")
    public String pricingTables()
    {
        return "pricing-tables";
    }




    public static void main(String[] args) {
        SpringApplication.run(PageController.class,args);
    }

}
