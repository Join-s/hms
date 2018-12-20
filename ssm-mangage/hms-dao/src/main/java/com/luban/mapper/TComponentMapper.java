package com.luban.mapper;

import com.luban.po.TComponent;
import com.luban.po.TComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TComponentMapper {
    int countByExample(TComponentExample example);

    int deleteByExample(TComponentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TComponent record);

    int insertSelective(TComponent record);

    List<TComponent> selectByExample(TComponentExample example);
    
    List<TComponent> selectInfo(TComponent tComponent);
    
    TComponent selectByPrimaryKey(Integer id);
    TComponent  selectVoById(Integer id);

    int updateByExampleSelective(@Param("record") TComponent record, @Param("example") TComponentExample example);

    int updateByExample(@Param("record") TComponent record, @Param("example") TComponentExample example);

    int updateByPrimaryKeySelective(TComponent record);

    int updateByPrimaryKey(TComponent record);
}