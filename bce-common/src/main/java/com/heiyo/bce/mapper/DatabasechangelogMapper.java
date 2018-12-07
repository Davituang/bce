package com.heiyo.bce.mapper;

import com.heiyo.bce.model.Databasechangelog;
import com.heiyo.bce.model.DatabasechangelogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DatabasechangelogMapper {
    int countByExample(DatabasechangelogExample example);

    int deleteByExample(DatabasechangelogExample example);

    int insert(Databasechangelog record);

    int insertSelective(Databasechangelog record);

    List<Databasechangelog> selectByExample(DatabasechangelogExample example);

    int updateByExampleSelective(@Param("record") Databasechangelog record, @Param("example") DatabasechangelogExample example);

    int updateByExample(@Param("record") Databasechangelog record, @Param("example") DatabasechangelogExample example);
}