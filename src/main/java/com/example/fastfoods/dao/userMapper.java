package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface userMapper {
    //登录
    @Select("SELECT * FROM f_user WHERE username = #{username} and password = #{password} and role=#{role}")
    user selectUserByUsername(@Param("username")String username, @Param("role") int role);

    //注册
    @Insert("INSERT INTO f_user (role,username,password,email,gender,flag,activatecode,createtime)" +
            "VALUES (1,#{username},#{password},#{email},#{gender},1,#{activatecode},#{createtime})")
    int account(user user);


}
