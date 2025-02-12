package com.training.Session5_Security.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String sayHello(){
        return "Saying hello to all";
    }
}