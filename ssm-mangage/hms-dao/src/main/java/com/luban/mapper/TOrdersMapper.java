package com.luban.mapper;

import com.luban.po.TOrders;
import com.luban.po.TOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrdersMapper {
    int countByExample(TOrdersExample example);

    int deleteByExample(TOrdersExample example); 
    int deleteByPrimaryKey(Integer id);

    int insert(TOrders record);

    int insertSelective(TOrders record);
    //根据订单id查询
    TOrders selectVoByOid(Integer oid);
    List<TOrders> selectByExample(TOrdersExample example);

    TOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TOrders record, @Param("example") TOrdersExample example);

    int updateByExample(@Param("record") TOrders record, @Param("example") TOrdersExample example);

    int updateByPrimaryKeySelective(TOrders record);

    int updateByPrimaryKey(TOrders record);
}