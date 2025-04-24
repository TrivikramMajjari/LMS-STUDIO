package com.example.lms.service;

import com.example.lms.dto.SignupRequest;
import com.example.lms.entity.User;
import com.example.lms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public void signup(SignupRequest signupRequest) {
        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword()); // In real app, encrypt password
        userRepository.save(user);
    }
}
