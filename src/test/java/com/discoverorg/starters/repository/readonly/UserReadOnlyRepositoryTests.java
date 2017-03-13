package com.discoverorg.starters.repository.readonly;

import com.discoverorg.starters.TestBase;
import com.discoverorg.starters.entity.UserEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class UserReadOnlyRepositoryTests extends TestBase {
    private UserReadOnlyRepository userReadOnlyRepository;

    @Autowired
    public void setUserReadOnlyRepository(UserReadOnlyRepository userReadOnlyRepository) {
        this.userReadOnlyRepository = userReadOnlyRepository;
    }

    @Test
    public void getUserById() {
        UserEntity userEntity = userReadOnlyRepository.findById(51300);
        assertThat(userEntity).isNotNull();
        assertThat(userEntity.getFirstName()).isEqualTo("Jonathan");
    }

}
