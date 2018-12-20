package com.luban.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luban.mapper.TDepartmentMapper;
import com.luban.mapper.TGradeMapper;
import com.luban.mapper.TMajorMapper;
import com.luban.mapper.TUserMapper;
import com.luban.po.TDepartment;
import com.luban.po.TDepartmentExample;
import com.luban.po.TGrade;
import com.luban.po.TGradeExample;
import com.luban.po.TMajor;
import com.luban.po.TMajorExample;
import com.luban.po.TUser;
import com.luban.po.TUserExample;
import com.luban.service.UserServcie;

/**
 * 
 * Title:UserServcieImpl
 * describe:  业务层实现类
 * @author 鲁班学院-无涯
 * @日期 2018-10-30 下午9:05:11
 */
@Service
@Transactional
public class UserServcieImpl implements UserServcie {

	@Autowired
	private TUserMapper tUserMapper;
	@Autowired
	private TDepartmentMapper tDepartmentMapper;
	@Autowired
	private TMajorMapper tMajorMapper;
	@Autowired
	private TGradeMapper tGradeMapper;
	/**
	* @Description 方法描述: 登陆验证，失败返回0 ：成功返回1
	 */
	public TUser login(TUser user) {

		return tUserMapper.login(user);
	}
	/**
	* @Description 方法描述: 购物车封装类
	 */
	public TUser selectVo(Integer id) {
		return tUserMapper.selectVo(id);
	}
	/**
	 * 查询所有学院
	 */
	public List<TDepartment> queryDep() {
		TDepartmentExample example=new TDepartmentExample();
		return  tDepartmentMapper.selectByExample(example);
	}
	/**
	 * 根据学院id查询专业
	 */
	public List<TMajor> queryByDep(Integer did) {
		
		TMajorExample example =new TMajorExample();
		com.luban.po.TMajorExample.Criteria c=example.createCriteria();
		 c.andDepidEqualTo(did);
		return tMajorMapper.selectByExample(example);
	}
	/**
	 * 根据专业查询班级
	 */
	public List<TGrade> queryByMag(Integer mid) {
		TGradeExample example =new TGradeExample();
		com.luban.po.TGradeExample.Criteria c=example.createCriteria();
		 c.andMagidEqualTo(mid);
		return tGradeMapper.selectByExample(example);
	}
	/**
	 * 用户注册
	 */
	public int insertUser(TUser user) {
		return tUserMapper.insert(user);
	}
	/**
	 * 根据用户ID来查询用户信息
	 */
	public TUser findUserById(int id) {
		return tUserMapper.selectByPrimaryKey(id);
	}
	/**
	* @Description 方法描述: 查询所有学生基本信息
	 */
	public List<TUser> queryAllStu(TUser u) {
		TUserExample example=new TUserExample();
		com.luban.po.TUserExample.Criteria c=example.createCriteria();
		c.andNameLike("%"+u.getName()+"%");
		c.andRemark1EqualTo("0");//学生
		return tUserMapper.selectByExampleVo(example);
	}
	public int delete(Integer[] ids) {
		List<Integer> list=Arrays.asList(ids);
		TUserExample example=new TUserExample();
		com.luban.po.TUserExample.Criteria c=example.createCriteria();
		c.andIdIn(list);
		return tUserMapper.deleteByExample(example);
	}
	
	
	
}
