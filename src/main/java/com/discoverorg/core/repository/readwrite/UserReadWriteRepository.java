package com.discoverorg.core.repository.readwrite;

import com.discoverorg.core.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserReadWriteRepository {

    private UserReadWriteMapper userReadWriteMapper;

    @Autowired
    public UserReadWriteRepository(UserReadWriteMapper userReadWriteMapper) {
        this.userReadWriteMapper = userReadWriteMapper;
    }

    public UserEntity findById(int id) {
        return userReadWriteMapper.selectById(id);
    }
}
