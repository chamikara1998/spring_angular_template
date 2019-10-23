package com.chamikara.samarasekara.vrsbackend.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

    @RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
