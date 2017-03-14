package com.discoverorg.core.repository.readonly;

import com.discoverorg.core.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
interface UserReadOnlyMapper {
//    @Select("SELECT * FROM user WHERE id = #{id}")
    UserEntity selectById(@Param("id") long id);
}
