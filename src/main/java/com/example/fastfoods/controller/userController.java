package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.user;
import com.example.fastfoods.service.userService;
import com.example.fastfoods.utils.RandomUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class userController {
    @Autowired
    userService userService;
//    登录
    @PostMapping(value="login")
    public user user(@Param("username")String username,@Param("role") int role){
        return userService.selectUserByUsername(username,role);
    }
//    注册
    @PostMapping(value="account")
    public int account(String username,String password,String email,String gender){
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        String acode = RandomUtils.createActive();
        user user=new user();
        user.setRole(1);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setGender(gender);
        user.setActivatecode(acode);
        user.setCreatetime(sdf.format(date));
        return userService.account(user);
    }


}
