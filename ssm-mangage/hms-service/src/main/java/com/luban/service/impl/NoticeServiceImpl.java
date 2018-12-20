package com.luban.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luban.mapper.TNoticeMapper;
import com.luban.po.TNotice;
import com.luban.po.TNoticeExample;
import com.luban.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private TNoticeMapper tNoticeMapper;

	public List<TNotice> selectAll(){
		TNoticeExample example=new TNoticeExample();
		return tNoticeMapper.selectByExample(example);
	}

	public TNotice findById(Integer id) {
		return tNoticeMapper.selectByPrimaryKey(id);
	}
	
	public int updateByPrimaryKeySelective(TNotice tNotice) {
		return tNoticeMapper.updateByPrimaryKeySelective(tNotice);
	}

	public int deleteByPrimaryKey(Integer id) {
		return tNoticeMapper.deleteByPrimaryKey(id);
	}

	public int insert(TNotice record) {
		return tNoticeMapper.insert(record);
	}
}
