package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.userMapper;
import com.example.fastfoods.pojo.user;
import com.example.fastfoods.service.userService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {
    @Autowired
    userMapper userMapper;
    //登录
    public user selectUserByUsername(@Param("username")String username, @Param("role") int role) {
        return userMapper.selectUserByUsername(username,role);
    }
//注册
    public int account(user user) {
        return userMapper.account(user);
    }
}
