package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.userMapper;
import com.example.fastfoods.pojo.user;
import com.example.fastfoods.service.userService;
import com.example.fastfoods.utils.MD5Utils;
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
//        user.getPassword().equals(MD5Utils.md5(password));
        return userMapper.selectUserByUsername(username,role);
    }
    //注册
    public int account(user user) {
//        user.setPassword(MD5Utils.md5(user.getPassword()));
        return userMapper.account(user);
    }
}