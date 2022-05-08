package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.user;
import com.example.fastfoods.service.userManageService;
import com.example.fastfoods.service.userService;
import com.example.fastfoods.utils.RandomUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userManageController {
    //用户管理的显示所有用户(不包括管理员)
    @Autowired
    userManageService userManageService;
    @PostMapping(value="selectUserWhereUser")
    public List<user> user(){
        return userManageService.selectUserWhereUser();
    }

//删除用户
    @PostMapping(value="deleteUserById")
    public int deleteUserById(int id){
        return userManageService.deleteUserById(id);
    }
    //条件查询用户
    @PostMapping(value="selectUserWhereCondition")
    public  List<user> selectAdminWhereCondition(@Param("username")String username,@Param("gender")String gender){
        String username1;
        String gender1;
        if(username==""){
            username1=null;
        }else{
            username1=username;
        }
        if(gender==""){
            gender1=null;
        }else{
            gender1=gender;
        }
        return userManageService.selectUserWhereCondition(username1,gender1);
    }
    //按id查询用户
    @PostMapping(value="selectUserById")
    public List<user> selectUserById(int id){return userManageService.selectUserById(id);}
    //修改用户信息
    @PostMapping(value="updateUserById")
    public int updateUserById (user user){return userManageService.updateUserById(user);}
}
