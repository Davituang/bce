package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Assetname;
import com.heiyo.bce.model.AssetnameExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AssetnameMapper {
    int countByExample(AssetnameExample example);

    int deleteByExample(AssetnameExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Assetname record);

    int insertSelective(Assetname record);

    List<Assetname> selectByExampleWithBLOBs(AssetnameExample example);

    List<Assetname> selectByExample(AssetnameExample example);

    Assetname selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Assetname record, @Param("example") AssetnameExample example);

    int updateByExampleWithBLOBs(@Param("record") Assetname record, @Param("example") AssetnameExample example);

    int updateByExample(@Param("record") Assetname record, @Param("example") AssetnameExample example);

    int updateByPrimaryKeySelective(Assetname record);

    int updateByPrimaryKeyWithBLOBs(Assetname record);

    int updateByPrimaryKey(Assetname record);
}