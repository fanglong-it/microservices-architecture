package com.example.user_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return new User(id, "User " + id);
    }
    
    @GetMapping("/ping")
    public String ping() {
        return "User Service is up!";
    }
}
