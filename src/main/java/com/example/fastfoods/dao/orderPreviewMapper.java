package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.pojo.order;
import com.example.fastfoods.pojo.useraddress;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface orderPreviewMapper {
    //查找用户的购物车
    @Select("select * from f_cart where uid=#{uid}")
    List<cart> selectUserCartById(int uid);
    //查看用户的购物车
    @Select("SELECT cd.num,cd.money,cd.gid,g.name,g.price FROM f_cartdetail cd LEFT JOIN f_goods g ON cd.gid=g.id  WHERE cd.cid=#{cid}")
    List<cartandgoods> seeAll(int cid);
    //获取用户地址
    @Select("select * from f_useraddress where uid = #{uid} order by flag desc")
    List<useraddress> seeAddressByUid(int uid);
    //单击生成订单 创建一个订单
    //新增 订单
    @Insert("insert into f_order(id,uid,uaid,money,createtime,flag) values(#{id},#{uid},#{uaid},#{money},now(),1)")
    int addOrder(order order);
    //新增 订单详情
    @Insert("insert into f_orderdetail(oid,gid,money,num) values(#{oid},#{gid},#{money},#{num})")
    int addOrderDetail(order order);
    //清空购物车 执行：cartController=>deleteAllByCid
    //删除订单
    @Delete("delete from f_order where id=#{id} ")
    int deleteOrderById(@Param("id") String id);
}
