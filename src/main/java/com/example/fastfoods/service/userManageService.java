package com.example.fastfoods.service;

import com.example.fastfoods.pojo.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userManageService {
    //用户管理的显示所有用户(不包括管理员)
    List<user> selectUserWhereUser();

//    删除用户
    int  deleteUserById(int id);
//条件查询用户
    List<user>  selectUserWhereCondition(@Param("username")String username,@Param("gender")String gender);
}
