package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Accounthead;
import com.heiyo.bce.model.AccountheadExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountheadMapper {
    int countByExample(AccountheadExample example);

    int deleteByExample(AccountheadExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Accounthead record);

    int insertSelective(Accounthead record);

    List<Accounthead> selectByExample(AccountheadExample example);

    Accounthead selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Accounthead record, @Param("example") AccountheadExample example);

    int updateByExample(@Param("record") Accounthead record, @Param("example") AccountheadExample example);

    int updateByPrimaryKeySelective(Accounthead record);

    int updateByPrimaryKey(Accounthead record);
}