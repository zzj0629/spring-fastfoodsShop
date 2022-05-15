package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.GoodsType;
import com.example.fastfoods.pojo.goods;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface commodityMapper {
    //查看所有商品
    @Select("select * from f_goods")
    List<goods> selectAllGoods();

    //查看商品分类
    @Select("select * from f_goodstype")
    List<GoodsType> selectGoodsType();

    //添加商品
    @Insert("INSERT INTO f_goods (name,price,pubdate,typeName,intro,picture,flag,star)" +
            "VALUES (#{name},#{price},#{pubdate},#{typeName},#{intro},#{picture},1,#{star})")
    int addGoods(goods goods);

    //删除商品
    @Delete("DELETE FROM f_goods WHERE id=#{id}")
    int deleteGoodsTypeById(int id);

    //修改商品
    @Update("UPDATE f_goods SET name=#{name},price=#{price},pubdate=#{pubdate},typeName=#{typeName}," +
            "intro=#{intro},picture=#{picture},star=#{star}  WHERE id = #{id}")
    int updateGoods(goods goods);

    //条件查询商品
    @Select("select * from f_goods where  name like concat('%',#{name},'%') and typeName like concat('%',#{typeName},'%') and pubdate like concat('%',#{pubdate},'%') ")
    List<goods> selectGoods(@Param("name") String name, @Param("typeName") String typeName, @Param("pubdate") String pubdate);
}
