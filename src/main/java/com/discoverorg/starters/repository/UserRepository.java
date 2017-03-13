package com.discoverorg.starters.repository;

import com.discoverorg.starters.entity.UserEntity;
import com.discoverorg.starters.repository.readonly.UserReadOnlyRepository;
import com.discoverorg.starters.repository.readwrite.UserReadWriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private UserReadOnlyRepository userReadOnlyRepository;
    private UserReadWriteRepository userReadWriteRepository;

    @Autowired
    public UserRepository(
            UserReadOnlyRepository userReadOnlyRepository,
            UserReadWriteRepository userReadWriteRepository
    ) {
        this.userReadOnlyRepository = userReadOnlyRepository;
        this.userReadWriteRepository = userReadWriteRepository;
    }

    public UserEntity findById(int id) {
        return userReadOnlyRepository.findById(id);
    }

    public UserEntity loadById(int id) {
        return userReadWriteRepository.findById(id);
    }
}
