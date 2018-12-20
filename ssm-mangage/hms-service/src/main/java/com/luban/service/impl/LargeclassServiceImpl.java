package com.luban.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luban.mapper.TLargeclassMapper;
import com.luban.po.TLargeclass;
import com.luban.service.LargeclassService;
@Service
@Transactional
public class LargeclassServiceImpl implements LargeclassService {

	@Autowired
	private TLargeclassMapper largeclassMapper;
	public List<TLargeclass> selectVo(TLargeclass largeclass) {
		return largeclassMapper.selectVo(largeclass);
	}
}
