package com.example.fastfoods.service;

import com.example.fastfoods.pojo.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userService {
    //登录
    user selectUserByUsername(@Param("username")String username, @Param("role") int role);
    //注册
    int account(user user);
}
