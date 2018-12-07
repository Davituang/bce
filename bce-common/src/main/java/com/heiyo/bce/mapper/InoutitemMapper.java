package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Inoutitem;
import com.heiyo.bce.model.InoutitemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InoutitemMapper {
    int countByExample(InoutitemExample example);

    int deleteByExample(InoutitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Inoutitem record);

    int insertSelective(Inoutitem record);

    List<Inoutitem> selectByExample(InoutitemExample example);

    Inoutitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Inoutitem record, @Param("example") InoutitemExample example);

    int updateByExample(@Param("record") Inoutitem record, @Param("example") InoutitemExample example);

    int updateByPrimaryKeySelective(Inoutitem record);

    int updateByPrimaryKey(Inoutitem record);
}