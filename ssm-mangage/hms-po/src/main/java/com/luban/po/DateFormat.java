package com.luban.po;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * 
 * Title:DateFormat describe:日期处理类
 * 
 * @author 鲁班学院-无涯
 * @日期 2018-10-23 下午8:37:42
 */
public class DateFormat implements WebBindingInitializer {
	// 1.日期格式化
	public void initBinder(WebDataBinder binder, WebRequest req) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, true));
	}

}
