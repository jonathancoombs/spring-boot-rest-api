package com.discoverorg.core.repository.readonly;

import com.discoverorg.core.entity.UserEntity;
import com.discoverorg.IntegrationTestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class UserReadOnlyRepositoryTests extends IntegrationTestBase {
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
