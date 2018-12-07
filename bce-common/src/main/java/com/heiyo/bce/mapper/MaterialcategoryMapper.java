package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Materialcategory;
import com.heiyo.bce.model.MaterialcategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MaterialcategoryMapper {
    int countByExample(MaterialcategoryExample example);

    int deleteByExample(MaterialcategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Materialcategory record);

    int insertSelective(Materialcategory record);

    List<Materialcategory> selectByExample(MaterialcategoryExample example);

    Materialcategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Materialcategory record, @Param("example") MaterialcategoryExample example);

    int updateByExample(@Param("record") Materialcategory record, @Param("example") MaterialcategoryExample example);

    int updateByPrimaryKeySelective(Materialcategory record);

    int updateByPrimaryKey(Materialcategory record);
}