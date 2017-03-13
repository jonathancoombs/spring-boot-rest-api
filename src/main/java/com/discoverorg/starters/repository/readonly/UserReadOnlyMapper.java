package com.discoverorg.starters.repository.readonly;

import com.discoverorg.starters.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface UserReadOnlyMapper {
//    @Select("SELECT * FROM user WHERE id = #{id}")
    UserEntity selectById(@Param("id") int id);
}
