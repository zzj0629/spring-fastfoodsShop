package com.example.fastfoods.dao;


import com.example.fastfoods.pojo.GoodsType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface cateGoryMapper {
    //添加分类
    @Insert("INSERT INTO f_goodstype (name,level,flag)" +
            "VALUES (#{name},1,1)")
    int addtype(GoodsType goodsType);

    //    查看商品分类
    @Select("select * from f_goodstype")
    List<GoodsType> selectAllGoodsType();

    //    删除商品分类
    @Delete("DELETE FROM f_goodstype WHERE id=#{id}")
    int deleteGoodsTypeById(int id);

    //    条件查询分类
    @Select("select * from f_goodstype where name like concat(#{name},'%')")
    List<GoodsType> selectGoodsType(String name);
}
