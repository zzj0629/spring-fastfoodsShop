package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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
}
