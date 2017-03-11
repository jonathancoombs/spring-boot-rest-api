//package com.discoverorg.starters.repository.readonly;
//
//import com.discoverorg.starters.entity.UserEntity;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class UserReadOnlyRepository {
//
//    private UserReadOnlyMapper userReadOnlyMapper;
//
//    public UserReadOnlyRepository(UserReadOnlyMapper userReadOnlyMapper) {
//        this.userReadOnlyMapper = userReadOnlyMapper;
//    }
//
//    public UserEntity findById(int id) {
//        return userReadOnlyMapper.selectById(id);
//    }
//}
