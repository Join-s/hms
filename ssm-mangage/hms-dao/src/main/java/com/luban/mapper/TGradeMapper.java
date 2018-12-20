package com.luban.mapper;

import com.luban.po.TGrade;
import com.luban.po.TGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGradeMapper {
    int countByExample(TGradeExample example);

    int deleteByExample(TGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGrade record);

    int insertSelective(TGrade record);

    List<TGrade> selectByExample(TGradeExample example);

    TGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TGrade record, @Param("example") TGradeExample example);

    int updateByExample(@Param("record") TGrade record, @Param("example") TGradeExample example);

    int updateByPrimaryKeySelective(TGrade record);

    int updateByPrimaryKey(TGrade record);
}