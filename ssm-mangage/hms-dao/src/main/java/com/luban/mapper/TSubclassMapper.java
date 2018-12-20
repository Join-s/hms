package com.luban.mapper;

import com.luban.po.TSubclass;
import com.luban.po.TSubclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSubclassMapper {
    int countByExample(TSubclassExample example);

    int deleteByExample(TSubclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSubclass record);

    int insertSelective(TSubclass record);

    List<TSubclass> selectByExample(TSubclassExample example);

    TSubclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSubclass record, @Param("example") TSubclassExample example);

    int updateByExample(@Param("record") TSubclass record, @Param("example") TSubclassExample example);

    int updateByPrimaryKeySelective(TSubclass record);

    int updateByPrimaryKey(TSubclass record);
}