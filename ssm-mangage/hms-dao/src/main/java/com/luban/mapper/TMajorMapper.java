package com.luban.mapper;

import com.luban.po.TMajor;
import com.luban.po.TMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMajorMapper {
    int countByExample(TMajorExample example);

    int deleteByExample(TMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMajor record);

    int insertSelective(TMajor record);

    List<TMajor> selectByExample(TMajorExample example);

    TMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMajor record, @Param("example") TMajorExample example);

    int updateByExample(@Param("record") TMajor record, @Param("example") TMajorExample example);

    int updateByPrimaryKeySelective(TMajor record);

    int updateByPrimaryKey(TMajor record);
}