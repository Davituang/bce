package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Userbusiness;
import com.heiyo.bce.model.UserbusinessExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserbusinessMapper {
    int countByExample(UserbusinessExample example);

    int deleteByExample(UserbusinessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Userbusiness record);

    int insertSelective(Userbusiness record);

    List<Userbusiness> selectByExample(UserbusinessExample example);

    Userbusiness selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Userbusiness record, @Param("example") UserbusinessExample example);

    int updateByExample(@Param("record") Userbusiness record, @Param("example") UserbusinessExample example);

    int updateByPrimaryKeySelective(Userbusiness record);

    int updateByPrimaryKey(Userbusiness record);
}