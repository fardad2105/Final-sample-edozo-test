package com.dvdstore.controller;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {


    @GetMapping("/auth")
    public String auth(Authentication authentication)
    {
        return "In Memory authentication";
    }
}
