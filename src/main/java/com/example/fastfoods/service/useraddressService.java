package com.example.fastfoods.service;

import com.example.fastfoods.pojo.useraddress;

import java.util.List;

public interface useraddressService {
    //新增地址
    int addAddress(useraddress useraddress);
    //查询地址
    List<useraddress> lookAllByUid(int uid);
    //修改地址
    int updateById(useraddress useraddress);
    //设置默认地址
    int updateMoRen(useraddress useraddress);
    //解除默认地址
    int updateRemoveMoRen(useraddress useraddress);
    //删除地址
    int deleteById(int id);
}
