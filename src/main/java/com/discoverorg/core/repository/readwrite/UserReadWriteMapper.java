package com.discoverorg.core.repository.readwrite;

import com.discoverorg.core.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface UserReadWriteMapper {
//    @Select("SELECT * FROM prepub_dorg.user WHERE id = #{id}")
    UserEntity selectById(@Param("id") int id);
}
