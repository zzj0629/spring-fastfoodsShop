package com.example.fastfoods.service.impl;

import com.example.fastfoods.dao.useraddressMapper;
import com.example.fastfoods.pojo.useraddress;
import com.example.fastfoods.service.useraddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class useraddressServiceImpl implements useraddressService {
    @Autowired
    useraddressMapper useraddressMapper;
    //新增地址
    public int addAddress(useraddress useraddress){return useraddressMapper.addAddress(useraddress);}
    //查询地址
    public List<useraddress> lookAllByUid(int uid){return useraddressMapper.lookAllByUid(uid);}
    //修改地址
    public int updateById(useraddress useraddress){return useraddressMapper.updateById(useraddress);}
    //设置默认地址
    public int updateMoRen(useraddress useraddress){return useraddressMapper.updateMoRen(useraddress);}
    //解除默认地址
    public int updateRemoveMoRen(useraddress useraddress){return useraddressMapper.updateRemoveMoRen(useraddress);}
    //删除地址
    public int deleteById(int id){return useraddressMapper.deleteById(id);}
}
