package com.discoverorg.starters.repository;

import com.discoverorg.starters.TestBase;
import com.discoverorg.starters.entity.UserEntity;
import com.discoverorg.starters.repository.readonly.UserReadOnlyRepository;
import com.discoverorg.starters.repository.readwrite.UserReadWriteRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRepositoryTests extends TestBase {
    private UserReadOnlyRepository userReadOnlyRepository;
    private UserReadWriteRepository userReadWriteRepository;

    @Autowired
    public void setUserReadWriteRepository(UserReadWriteRepository userReadWriteRepository) {
        this.userReadWriteRepository = userReadWriteRepository;
    }

    @Autowired
    public void setUserReadOnlyRepository(UserReadOnlyRepository userReadOnlyRepository) {
        this.userReadOnlyRepository = userReadOnlyRepository;
    }

    @Test
    public void findUserById() {
        UserEntity userEntity = userReadOnlyRepository.findById(51300);
        assertThat(userEntity).isNotNull();
        assertThat(userEntity.getFirstName()).isEqualTo("Jonathan");
        assertThat(userEntity.getActiveTo()).isEqualTo("2018-06-01");
    }

    @Test
    public void loadUserById() {
        UserEntity userEntity = userReadWriteRepository.findById(51300);
        assertThat(userEntity).isNotNull();
        assertThat(userEntity.getFirstName()).isEqualTo("Jonathan2");

    }
}
