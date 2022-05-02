package com.example.fastfoods.dao;

import com.example.fastfoods.pojo.goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface displayInformationMapper {
    //显示热销商品
    @Select("select * from ( SELECT * FROM f_goods order by typeName )A group by A.typeName")
    List<goods> selectRxGoods();
    //按分类查询商品信息
    @Select("SELECT * FROM f_goods where typeName = #{typeName}")
    List<goods> selectAllByTypename(@Param("typeName") String typeName);
    //按商品名称查询商品
    @Select("select * from f_goods where name like concat('%',#{name},'%')")
    List<goods> selectGoodsByName(@Param("name") String name);
    //按商品id查询商品详细信息
    @Select("select * from f_goods where id = #{id}")
    List<goods> selectGoodsById(int id);
}
