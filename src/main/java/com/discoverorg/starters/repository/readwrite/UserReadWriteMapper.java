package com.discoverorg.starters.repository.readwrite;

import com.discoverorg.starters.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface UserReadWriteMapper {
//    @Select("SELECT * FROM prepub_dorg.user WHERE id = #{id}")
    UserEntity selectById(@Param("id") int id);
}
