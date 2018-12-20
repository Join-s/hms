package com.luban.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("re")
public class ReportsAction {
	/** 
	* @Description 描述:  <pre> 
	* @author 作者: hellc <pre>
	* @date 时间: 2018年12月13日 下午5:47:16 <pre> 
	*/
	@RequestMapping("queryList")
	public String findList() {
		
		return "mangage/reports/reportsList";
	}
	@RequestMapping("queryHouse")
	public String findHouse() {
		
		return "mangage/reports/reportsHouse";
	}
	
	@RequestMapping("upload")
	public String addStu() {
		
		return "mangage/reports/reportsUpload";
	}
	
}
