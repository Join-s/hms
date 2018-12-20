package com.luban.service;

import java.util.List;


import com.luban.po.TDepartment;
import com.luban.po.TGrade;
import com.luban.po.TMajor;
import com.luban.po.TUser;

public interface UserServcie {
	//用户登陆
	public TUser login(TUser user);
	public TUser selectVo(Integer id) ;
	// 添加
	public int insertUser(TUser user);
//	//删除
//	public boolean deleteUser(int id);
/**
 * 根据用户ID来查询用户信息
 */
	public TUser findUserById(int id);
//	//修改
//	public int updateUserSet(User user);
//	//分页查询
//	public List<User> queryUserPage(User user,PageInfo info);
//	//获取总条数
//	public int queryUserCount(TUser user);
	
	/**
	 * 查询所有学院
	 */
	public List<TDepartment> queryDep() ;
	/**
	 * 根据学院id查询专业
	 */
	public List<TMajor> queryByDep(Integer did);
	/**
	 * 根据专业查询班级
	 */
	public List<TGrade> queryByMag(Integer mid);
	/**
	* @Description 方法描述: 查询所有学生基本信息
	 */
	public List<TUser> queryAllStu(TUser u);
	
	/**
	 * 
	* @Description 方法描述: 删除
	 */
	public int delete(Integer[] ids);
}
