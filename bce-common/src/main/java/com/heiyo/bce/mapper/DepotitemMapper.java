package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Depotitem;
import com.heiyo.bce.model.DepotitemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DepotitemMapper {
    int countByExample(DepotitemExample example);

    int deleteByExample(DepotitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Depotitem record);

    int insertSelective(Depotitem record);

    List<Depotitem> selectByExample(DepotitemExample example);

    Depotitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Depotitem record, @Param("example") DepotitemExample example);

    int updateByExample(@Param("record") Depotitem record, @Param("example") DepotitemExample example);

    int updateByPrimaryKeySelective(Depotitem record);

    int updateByPrimaryKey(Depotitem record);
}