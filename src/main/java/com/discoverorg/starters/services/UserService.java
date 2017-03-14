package com.discoverorg.starters.services;

import com.discoverorg.core.entity.UserEntity;
import com.discoverorg.core.repository.UserRepository;
import com.discoverorg.starters.resources.UserResource;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResource getUserById(long id) {
        UserEntity userEntity = this.userRepository.findById(id);
        UserResource userResource = new UserResource(userEntity);
        return userResource;
    }
}
