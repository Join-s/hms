package com.luban.mapper;

import com.luban.po.TOrderdetails;
import com.luban.po.TOrderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderdetailsMapper {
    int countByExample(TOrderdetailsExample example);

    int deleteByExample(TOrderdetailsExample example);

    int deleteByPrimaryKey(Integer id);
    int insert(TOrderdetails record);

    int insertSelective(TOrderdetails record);

    List<TOrderdetails> selectByExample(TOrderdetailsExample example);
  //根据订单id查询
     List<TOrderdetails> selectVoByOid(Integer oid);
    TOrderdetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TOrderdetails record, @Param("example") TOrderdetailsExample example);

    int updateByExample(@Param("record") TOrderdetails record, @Param("example") TOrderdetailsExample example);

    int updateByPrimaryKeySelective(TOrderdetails record);

    int updateByPrimaryKey(TOrderdetails record);
}