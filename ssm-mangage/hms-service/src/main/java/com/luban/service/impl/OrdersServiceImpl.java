package com.luban.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luban.mapper.TOrderdetailsMapper;
import com.luban.mapper.TOrdersMapper;
import com.luban.po.TOrderdetails;
import com.luban.po.TOrderdetailsExample;
import com.luban.po.TOrderdetailsExample.Criteria;
import com.luban.po.TOrders;
import com.luban.service.OrdersService;

@Service
@Transactional
public class OrdersServiceImpl  implements OrdersService{
	//根据订单id查询
	@Autowired
	private TOrdersMapper tOrdersMapper;
	@Autowired
	private TOrderdetailsMapper tOrderdetailsMapper;
	
	public TOrders selectVoByOid(Integer oid) {
		return tOrdersMapper.selectVoByOid(oid);
	}
	 /**
	  * 删除Vo
	  * 0:删除失败 1：删除成功
	  */
    public int deleteVoByid(Integer id) {
    	TOrderdetailsExample example=new TOrderdetailsExample();
    	com.luban.po.TOrderdetailsExample.Criteria c=example.createCriteria();
    	c.andOidEqualTo(id);
    	int i=  tOrderdetailsMapper.deleteByExample(example);
    	
    	int j=tOrdersMapper.deleteByPrimaryKey(id);
    	
    	int result=0;
    	
    	if(i>0 && j>0) {
    		result=1;
    	}
    	
		return result;
    }
    
    //添加订单
    public  int insertCart(TOrders tOrders,List<TOrderdetails> tOrderdetailsList) {
    	try {
    		int oid=tOrdersMapper.insert(tOrders);
    		oid=tOrders.getId();
    		for(TOrderdetails tod:tOrderdetailsList) {
    			tod.setOid(oid);
    			tOrderdetailsMapper.insert(tod);
    		}
    	}catch (Exception e) {
    		return 0;
		}
		return 1;
    }
}	
	
