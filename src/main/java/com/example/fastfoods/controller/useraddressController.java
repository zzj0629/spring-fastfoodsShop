package com.example.fastfoods.controller;

import com.example.fastfoods.pojo.useraddress;
import com.example.fastfoods.service.useraddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class useraddressController {
    @Autowired
    useraddressService useraddressService;
    //添加商品分类
    @PostMapping(value = "addAddress")
    public int addAddress(String name,String phone,String detail,int uid){
        useraddress useraddress = new useraddress();
        useraddress.setName(name);
        useraddress.setPhone(phone);
        useraddress.setDetail(detail);
        useraddress.setUid(uid);
        return useraddressService.addAddress(useraddress);
    }
    //查询地址
    @PostMapping(value = "lookAllByUid")
    public List<useraddress> lookAllByUid(int uid){return useraddressService.lookAllByUid(uid);}
    //修改地址
    @PostMapping(value = "updateById")
    public int updateById(useraddress useraddress){return useraddressService.updateById(useraddress);}
    //设置默认地址
    @PostMapping(value = "updateMoRen")
    public int updateMoRen(useraddress useraddress){return useraddressService.updateMoRen(useraddress);}
    //解除默认地址
    @PostMapping(value = "updateRemoveMoRen")
    public int updateRemoveMoRen(useraddress useraddress){return useraddressService.updateRemoveMoRen(useraddress);}
    //删除地址
    @PostMapping(value = "deleteById")
    public int deleteById(int id){return useraddressService.deleteById(id);}
}
