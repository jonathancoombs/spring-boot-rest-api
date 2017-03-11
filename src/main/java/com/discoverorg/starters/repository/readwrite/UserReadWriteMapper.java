package com.discoverorg.starters.repository.readwrite;

import com.discoverorg.starters.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
interface UserReadWriteMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    UserEntity selectById(@Param("id") int id);
}
