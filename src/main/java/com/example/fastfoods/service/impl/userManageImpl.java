package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.userManageMapper;
import com.example.fastfoods.pojo.user;
import com.example.fastfoods.service.userManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userManageImpl implements userManageService {
    //用户管理的显示所有用户(不包括管理员)
    @Autowired
    userManageMapper userManageMapper;
    //用户管理的显示所有用户(不包括管理员)
    public List<user> selectUserWhereUser() {
        return userManageMapper.selectUserWhereUser();
    }
    //删除用户
    public int deleteUserById(int id) {
        return userManageMapper.deleteUserById(id);
    }
    //条件查询用户
    public List<user> selectUserWhereCondition(String username, String gender) {
        return userManageMapper.selectUserWhereCondition(username,gender);
    }

    //按id查询用户
    public List<user> selectUserById(int id){return userManageMapper.selectUserById(id);}
    //修改用户信息
    public int updateUserById (user user){return userManageMapper.updateUserById(user);}

}
