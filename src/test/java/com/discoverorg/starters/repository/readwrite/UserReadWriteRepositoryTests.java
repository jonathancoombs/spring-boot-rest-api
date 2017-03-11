package com.discoverorg.starters.repository.readwrite;

import com.discoverorg.starters.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserReadWriteRepositoryTests {
    private UserReadWriteRepository userReadWriteRepository;

    @Autowired
    public void setUserReadWriteRepository(UserReadWriteRepository userReadWriteRepository) {
        this.userReadWriteRepository = userReadWriteRepository;
    }

    @Test
    public void getUserById() {
        UserEntity userEntity = userReadWriteRepository.findById(51300);
        assertThat(userEntity).isNotNull();
        assertThat(userEntity.getFirstName()).isEqualTo("Jonathan");

    }

}
