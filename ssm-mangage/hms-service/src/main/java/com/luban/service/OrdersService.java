package com.luban.service;

import java.util.List;
import java.util.Map;

import com.luban.po.TOrderdetails;
import com.luban.po.TOrders;

public interface OrdersService {
	//根据uid
	List<TOrders> selectVoByUid( );
	//根据订单id查询
	TOrders selectVoByOid(Integer oid);
	 //删除Vo
    int deleteVoByid(Integer id);
    
    //添加订单
    int insertCart(TOrders tOrders,List<TOrderdetails> tOrderdetailsList) ;
}
