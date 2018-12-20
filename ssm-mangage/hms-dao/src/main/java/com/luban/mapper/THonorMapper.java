package com.luban.mapper;

import com.luban.po.THonor;
import com.luban.po.THonorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THonorMapper {
    int countByExample(THonorExample example);

    int deleteByExample(THonorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THonor record);

    int insertSelective(THonor record);

    List<THonor> selectByExample(THonorExample example);

    THonor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THonor record, @Param("example") THonorExample example);

    int updateByExample(@Param("record") THonor record, @Param("example") THonorExample example);

    int updateByPrimaryKeySelective(THonor record);

    int updateByPrimaryKey(THonor record);
}