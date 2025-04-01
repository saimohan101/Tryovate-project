package com.tryovate.controller;

import com.tryovate.dto.LoginDto;
import com.tryovate.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<LoginDto> login(@RequestBody User user) {
        if ("shivb11".equals(user.getUsername()) && "Shiv@2000".equals(user.getPassword())) {
            LoginDto response = new LoginDto("Login successful", true);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            LoginDto response = new LoginDto("Invalid username or password", false);
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }
    }
}
