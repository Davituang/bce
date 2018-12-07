package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Depothead;
import com.heiyo.bce.model.DepotheadExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DepotheadMapper {
    int countByExample(DepotheadExample example);

    int deleteByExample(DepotheadExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Depothead record);

    int insertSelective(Depothead record);

    List<Depothead> selectByExample(DepotheadExample example);

    Depothead selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Depothead record, @Param("example") DepotheadExample example);

    int updateByExample(@Param("record") Depothead record, @Param("example") DepotheadExample example);

    int updateByPrimaryKeySelective(Depothead record);

    int updateByPrimaryKey(Depothead record);
}