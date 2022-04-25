package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.user;
import com.example.fastfoods.service.adminManageService;
import com.example.fastfoods.service.userManageService;
import com.example.fastfoods.service.userService;
import com.example.fastfoods.utils.RandomUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class adminManageController {
    @Autowired
    adminManageService adminManageService;

    @PostMapping(value = "selectAdminWhereAdmin")
    public List<user> user() {
        return adminManageService.selectAdminWhereAdmin();
    }

    //条件查询用户
    @PostMapping(value = "selectAdminWhereCondition")
    public List<user> selectUserWhereCondition(@Param("username") String username, @Param("gender") String gender) {
        String username1;
        String gender1;
        if (username == "") {
            username1 = null;
        } else {
            username1 = username;
        }
        if (gender == "") {
            gender1 = null;
        } else {
            gender1 = gender;
        }
        return adminManageService.selectAdminWhereCondition(username1, gender1);
    }

    //    修改管理员
    @PostMapping(value = "updateAdminById")
    public int updateAdminById(int id, String username, String password, String email, String gender) {
        user user = new user();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setGender(gender);
        return adminManageService.updateAdminById(user);
    }

    //    注册
    @PostMapping(value="addAdmin")
    public int addAdmin(String username,String password,String email,String gender){
        SimpleDateFormat time = new SimpleDateFormat();
        time.applyPattern("yyyy-MM-dd HH:mm:ss");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        String acode = RandomUtils.createActive();
        user user=new user();
        user.setRole(1);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setGender(gender);
        user.setActivatecode(acode);
        user.setCreatetime(time.format(date));
        return adminManageService.addAdmin(user);
    }



}
