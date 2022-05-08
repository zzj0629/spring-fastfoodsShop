package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.cart;
import com.example.fastfoods.pojo.cartandgoods;
import com.example.fastfoods.pojo.goods;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface cartMapper {
    //查找用户的购物车
    @Select("select * from f_cart where uid=#{uid}")
    List<cart> selectUserCart(int uid);
    //用户登录后为用户创建一个购物车
    @Insert("insert into f_cart(uid,money) values(#{uid},0)")
    int addNewUserCart(cart cart);
    //查询购物车中是否有同类商品
    @Select("select * from f_cartdetail where cid=#{cid}")
    List<cart> seegid(int cid);
    //如果购物车有该商品 则商品数量加1
    @Update("update f_cartdetail set num=num+1,money=#{money} where cid=#{cid} and gid=#{gid}")
    int updateAddOne(cart cart);
    //如果购物车无该商品 向购物车中加入该商品
    @Insert("insert into f_cartdetail(cid,gid,num,money) values(#{cid},#{gid},1,#{money})")
    int addCommodityInCart(cart cart);
    //查看用户的购物车
    @Select("SELECT cd.num,cd.money,cd.gid,g.name,g.price FROM f_cartdetail cd LEFT JOIN f_goods g ON cd.gid=g.id  WHERE cd.cid=#{cid}")
    List<cartandgoods> seeAllInCart(int cid);
    //查看购物车中的商品信息
    @Select("select name,price from f_goods where id = #{id}")
    List<goods> seeNameAndPriceByGid(int gid);
    //修改商品数量和小计
    @Update("update f_cartdetail set num=#{num},money=#{money} where cid=#{cid} and gid=#{gid}")
    int updateNumAndMoney(cart cart);
    //求商品总金额
    @Select("select sum(money) from f_cartdetail where cid=#{cid}")
    double zongJinE(int cid);
    //按商品id删除商品
    @Delete("delete from  f_cartdetail where cid=#{cid} and gid=#{gid}")
    int deleteSP(cartandgoods cartandgoods);
    //清空购物车
    @Delete("delete from  f_cartdetail where cid=#{cid} ")
    int deleteAllByCid(int cid);
    //购物车商品结算 生成订单

}
