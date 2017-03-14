package com.discoverorg.core.repository.readwrite;

import com.discoverorg.core.entity.UserEntity;
import com.discoverorg.IntegrationTestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class UserReadWriteRepositoryTests extends IntegrationTestBase {
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
        assertThat(userEntity.getActiveTo()).isNotNull();

    }

}
