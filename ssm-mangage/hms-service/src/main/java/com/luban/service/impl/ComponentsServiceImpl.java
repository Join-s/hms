package com.luban.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luban.mapper.TComponentMapper;
import com.luban.po.TComponent;
import com.luban.po.TComponentExample;
import com.luban.po.TComponentExample.Criteria;
import com.luban.service.ComponentsService;

@Service
@Transactional
public class ComponentsServiceImpl implements ComponentsService {
	@Autowired
	private TComponentMapper tComponentMapper;

	/**
	 * @Description 方法描述: 查询所有
	 */
	public List<TComponent> selectAll(TComponent example) {
	
		return tComponentMapper.selectInfo(example);
	}

	/**
	 * @Description 方法描述: 根据id查询
	 */
	public TComponent findById(Integer id) {
		return tComponentMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Description 方法描述: 修改
	 */
	public int updateByPrimaryKeySelective(TComponent component) {
		return tComponentMapper.updateByPrimaryKeySelective(component);

	}

	/**
	 * @Description 方法描述: 根据id删除
	 */
	public int deleteByPrimaryKey(Integer id) {
		return tComponentMapper.deleteByPrimaryKey(id);

	}

	/**
	 * @Description 方法描述: 插入
	 */
	public int insert(TComponent record) {
		return tComponentMapper.insert(record);

	}

	public List<TComponent> selectByExample(List<Integer> ids) {
		TComponentExample example=new TComponentExample();
		Criteria c=example.createCriteria();
		c.andIdIn(ids);
		return  tComponentMapper.selectByExample(example);
	}

	public TComponent selectVoById(Integer id) {
		return tComponentMapper.selectVoById(id);
	}

	public int delete(Integer[] ids) {
		List<Integer> ds=Arrays.asList(ids);
		TComponentExample example=new TComponentExample();		
		Criteria c=example.createCriteria();
		c.andIdIn(ds);
		return tComponentMapper.deleteByExample(example);
	}

}
