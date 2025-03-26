package com.tryovate.controller;

import com.tryovate.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Simple login logic (for example purposes)
        if ("shivb11".equals(user.getUsername()) && "Shiv@2000".equals(user.getPassword())) {
            return "Login successful. Welcome " + user.getUsername() + "!";
        } else {
            return "Login failed. Invalid credentials!";
        }
    }
}
