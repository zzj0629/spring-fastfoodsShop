package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.cart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface cartMapper {
    //用户注册后后为用户创建一个购物车
    @Insert("insert into f_cart(uid,money) values(#{uid},0)")
    int addNewUserCard(cart cart);
    //查看用户的购物车

    //存储用户加入购物车的商品
//    @Insert("insert into f_cartdetail(cid,gid,num,money) values(#{cid},#{gid},#{num},#{money})")
//    int addCommodityDetails(cart cart);
    //修改商品数量
    //修改商品金额
    //按商品id删除商品
    //清空购物车
    //购物车商品结算 生成订单

}
