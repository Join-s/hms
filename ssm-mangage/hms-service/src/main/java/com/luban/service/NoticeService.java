package com.luban.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.luban.po.TNotice;
import com.luban.po.TNoticeExample;

public interface NoticeService {
	/**
	* @Description 方法描述: 查询所有
	 */
	List<TNotice> selectAll();
	/**
	* @Description 方法描述: 根据id查询
	 */
	TNotice findById(Integer id);
	/**
	* @Description 方法描述: 修改
	 */
	int updateByPrimaryKeySelective(TNotice tNotice);
	/**
	* @Description 方法描述: 根据id删除
	 */
	int deleteByPrimaryKey(Integer id);
	/**
	* @Description 方法描述: 插入
	 */
	int insert(TNotice record);
}
