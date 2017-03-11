//package com.discoverorg.starters.repository.readonly;
//
//import com.discoverorg.starters.entity.UserEntity;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//
//@Mapper
//interface UserReadOnlyMapper {
//    @Select("SELECT * FROM dorg.user WHERE id = #{id}")
//    UserEntity selectById(@Param("id") int id);
//}
