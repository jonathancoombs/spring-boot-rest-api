//package com.discoverorg.starters.repository.readonly;
//
//import com.discoverorg.starters.entity.UserEntity;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserReadOnlyRepositoryTests {
//    private UserReadOnlyRepository userReadOnlyRepository;
//
//    @Autowired
//    public void setUserReadOnlyRepository(UserReadOnlyRepository userReadOnlyRepository) {
//        this.userReadOnlyRepository = userReadOnlyRepository;
//    }
//
//    @Test
//    public void getUserById() {
//        UserEntity userEntity = userReadOnlyRepository.findById(51300);
//        System.out.println(userEntity);
//    }
//
//}
