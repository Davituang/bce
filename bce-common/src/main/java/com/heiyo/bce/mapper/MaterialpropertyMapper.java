package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Materialproperty;
import com.heiyo.bce.model.MaterialpropertyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MaterialpropertyMapper {
    int countByExample(MaterialpropertyExample example);

    int deleteByExample(MaterialpropertyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Materialproperty record);

    int insertSelective(Materialproperty record);

    List<Materialproperty> selectByExample(MaterialpropertyExample example);

    Materialproperty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Materialproperty record, @Param("example") MaterialpropertyExample example);

    int updateByExample(@Param("record") Materialproperty record, @Param("example") MaterialpropertyExample example);

    int updateByPrimaryKeySelective(Materialproperty record);

    int updateByPrimaryKey(Materialproperty record);
}