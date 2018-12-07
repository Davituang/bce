package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Assetcategory;
import com.heiyo.bce.model.AssetcategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AssetcategoryMapper {
    int countByExample(AssetcategoryExample example);

    int deleteByExample(AssetcategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Assetcategory record);

    int insertSelective(Assetcategory record);

    List<Assetcategory> selectByExample(AssetcategoryExample example);

    Assetcategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Assetcategory record, @Param("example") AssetcategoryExample example);

    int updateByExample(@Param("record") Assetcategory record, @Param("example") AssetcategoryExample example);

    int updateByPrimaryKeySelective(Assetcategory record);

    int updateByPrimaryKey(Assetcategory record);
}