package com.discoverorg.core.repository;

import com.discoverorg.core.entity.UserEntity;
import com.discoverorg.core.repository.readonly.UserReadOnlyRepository;
import com.discoverorg.core.repository.readwrite.UserReadWriteRepository;
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

    public UserEntity findById(long id) {
        return userReadOnlyRepository.findById(id);
    }

    public UserEntity loadById(int id) {
        return userReadWriteRepository.findById(id);
    }
}
