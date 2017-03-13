package com.discoverorg.starters.repository.readwrite;

import com.discoverorg.starters.TestBase;
import com.discoverorg.starters.entity.UserEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class UserReadWriteRepositoryTests extends TestBase{
    private UserReadWriteRepository userReadWriteRepository;

    @Autowired
    public void setUserReadWriteRepository(UserReadWriteRepository userReadWriteRepository) {
        this.userReadWriteRepository = userReadWriteRepository;
    }

    @Test
    public void getUserById() {
        UserEntity userEntity = userReadWriteRepository.findById(51300);
        assertThat(userEntity).isNotNull();
        assertThat(userEntity.getFirstName()).isEqualTo("Jonathan2");

    }

}
