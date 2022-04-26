package com.example.fastfoods.service;

import com.example.fastfoods.pojo.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface adminManageService {
    //管理员管理的显示所有管理员(不包括用户)
    List<user> selectAdminWhereAdmin();
    //按条件查询管理员
    List<user> selectAdminWhereCondition(@Param("username")String username, @Param("gender")String gender);

//    修改管理员
int updateAdminById (user user);

//添加管理员
int addAdmin(user user);

//删除管理员
int deleteAdminById(int id);
}
