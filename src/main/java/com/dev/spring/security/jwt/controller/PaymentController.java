package com.dev.spring.security.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to JWT demo app";
    }
}
