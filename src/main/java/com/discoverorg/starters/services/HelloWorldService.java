package com.discoverorg.starters.services;

import com.discoverorg.starters.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    private UserRepository userRepository;

    public HelloWorldService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUser() {
        return this.userRepository.findById(51300).getUsername();
    }
}
