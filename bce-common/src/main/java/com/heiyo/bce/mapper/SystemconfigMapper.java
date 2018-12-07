package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Systemconfig;
import com.heiyo.bce.model.SystemconfigExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SystemconfigMapper {
    int countByExample(SystemconfigExample example);

    int deleteByExample(SystemconfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Systemconfig record);

    int insertSelective(Systemconfig record);

    List<Systemconfig> selectByExample(SystemconfigExample example);

    Systemconfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Systemconfig record, @Param("example") SystemconfigExample example);

    int updateByExample(@Param("record") Systemconfig record, @Param("example") SystemconfigExample example);

    int updateByPrimaryKeySelective(Systemconfig record);

    int updateByPrimaryKey(Systemconfig record);
}