package com.mmartin.servicea.restservicea.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicea")
public class ServiceAController {
    @GetMapping("/sayhello")
    public String sayHello(){
        return "Holaaaaaa!!;
    }
}
