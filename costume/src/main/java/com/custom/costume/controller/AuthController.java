package com.custom.costume.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custom.costume.User;
import com.custom.costume.UserRepository;

@RestController
@CrossOrigin(origins = "*") // Allow frontend to access this API
@RequestMapping("/api/auth")
public class AuthController {
     @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already exists.";
        }
        userRepository.save(user);
        return "User registered successfully!";
    }

    @PostMapping("/login")
    public String login(@RequestBody User loginUser) {
        Optional<User> user = userRepository.findByEmail(loginUser.getEmail());
        if (user.isPresent() && user.get().getPassword().equals(loginUser.getPassword())) {
            return "Login successful!";
        } else {
            return "Invalid credentials";
        }
    }
}

