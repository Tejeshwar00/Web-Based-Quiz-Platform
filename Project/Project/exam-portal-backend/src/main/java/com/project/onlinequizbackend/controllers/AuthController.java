package com.project.onlinequizbackend.controllers;

import com.project.onlinequizbackend.models.LoginRequest;
import com.project.onlinequizbackend.models.LoginResponse;
import com.project.onlinequizbackend.models.User;
import com.project.onlinequizbackend.services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthService authService;


    @PostMapping("/register")
    public User registerUser(@RequestBody User user) throws Exception {
        return authService.registerUserService(user);
    }

    @PostMapping("/login")
    public LoginResponse loginUser(@RequestBody LoginRequest loginRequest) throws Exception {
        return authService.loginUserService(loginRequest);
    }

}
