package com.discoverorg.core.repository.readonly;

import com.discoverorg.core.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserReadOnlyRepository {

    private UserReadOnlyMapper userReadOnlyMapper;

    public UserReadOnlyRepository(UserReadOnlyMapper userReadOnlyMapper) {
        this.userReadOnlyMapper = userReadOnlyMapper;
    }

    public UserEntity findById(long id) {
        return userReadOnlyMapper.selectById(id);
    }
}
