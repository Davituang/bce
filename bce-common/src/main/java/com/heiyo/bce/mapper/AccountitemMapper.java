package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Accountitem;
import com.heiyo.bce.model.AccountitemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountitemMapper {
    int countByExample(AccountitemExample example);

    int deleteByExample(AccountitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Accountitem record);

    int insertSelective(Accountitem record);

    List<Accountitem> selectByExample(AccountitemExample example);

    Accountitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Accountitem record, @Param("example") AccountitemExample example);

    int updateByExample(@Param("record") Accountitem record, @Param("example") AccountitemExample example);

    int updateByPrimaryKeySelective(Accountitem record);

    int updateByPrimaryKey(Accountitem record);
}