package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.adminManageMapper;
import com.example.fastfoods.pojo.user;
import com.example.fastfoods.service.adminManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminManageServiceImpl implements adminManageService {
    @Autowired
    adminManageMapper adminManageMapper;
    //管理员管理的显示所有管理员(不包括用户)
    public List<user> selectAdminWhereAdmin() { return adminManageMapper.selectAdminWhereAdmin(); }
    //条件查询管理员
    public List<user> selectAdminWhereCondition(String username, String gender) {
        return adminManageMapper.selectAdminWhereCondition(username,gender);
    }

    public int updateAdminById(user user) {
        return adminManageMapper.updateAdminById(user);
    }

    public int addAdmin(user user) {
        return adminManageMapper.addAdmin(user);
    }

    @Override
    public int deleteAdminById(int id) {
        return adminManageMapper.deleteAdminById(id);
    }
}
