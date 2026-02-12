package com.alita.dev.secureapi.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
@GetMapping("/auth")
    public String test(Authentication authentication) {

        if (authentication == null) {
            return "Não autenticado";
        }
    
        return "Autenticado como: " +
            authentication.getName() +
            " | Roles: " +
            authentication.getAuthorities();
    
    }


@GetMapping("/teste")
    public String t(){
        return "Oi";
    }
}
