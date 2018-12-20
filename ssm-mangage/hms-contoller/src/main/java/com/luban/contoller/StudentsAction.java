package com.luban.contoller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luban.po.TUser;
import com.luban.service.UserServcie;

@Controller
@RequestMapping("stu")
public class StudentsAction {

	@Autowired
	private UserServcie userServcie;

	/**
	 * @Description 描述:后台 列出学生信息
	 * @author 作者: hellc
	 * @date 时间: 2018年12月13日 下午5:47:37
	 */
	@RequestMapping("queryList")
	public String findList(HttpSession session, String name, String num, String banji, Integer pageNum) {

		if (pageNum == null || pageNum<0) {
			pageNum = 1;
		}
		PageHelper.startPage(pageNum, 10);// 页面大小
		if (name == null) {
			if (session.getAttribute("stuName") != null) {
				name = (String) session.getAttribute("stuName");

			}
			name = "";
		} else {

		}
		if (num == null || "".equals(num)) {
			if (session.getAttribute("stuNum") != null) {
				num = (String) session.getAttribute("stuNum");
				PageHelper.orderBy("jnumber");// 排序方式
			}

		} else {
			session.setAttribute("stuNum", num);
			PageHelper.orderBy("jnumber");
		}
		if (banji == null || "".equals(banji)) {
			if (session.getAttribute("stuBanji") != null) {
				banji = (String) session.getAttribute("stuBanji");
				PageHelper.orderBy("graid");
			}

		} else {
			session.setAttribute("stuBanji", banji);
			PageHelper.orderBy("graid");
		}
		TUser u = new TUser();
		u.setName(name);

		List<TUser> slist = userServcie.queryAllStu(u);

		PageInfo<TUser> pageInfo = new PageInfo<TUser>(slist);
		session.setAttribute("stuName", name);

		session.setAttribute("stuPageInfo", pageInfo);
		return "mangage/students/studentList";
	}

	@RequestMapping("queryHouse")
	public String findHouse() {

		return "mangage/students/studentHouse";
	}

	@RequestMapping("addStu")
	public String addStu(TUser u) {
		return "mangage/students/studentAdd";
	}
	
	@RequestMapping("find")
	public 
	@ResponseBody
	TUser findById( Integer id) {
		TUser u=userServcie.findUserById(id);
		return u;
	}
	@RequestMapping("deleteStu")
	public  String delete(Integer[] ids) {
//		Integer[] sd=new Integer[ids.length];
//		for(int i=0;i<ids.length;i++) {
//			sd[i]=Integer.parseInt(ids[i]);
//		}
		
		if(ids.length>0)
		userServcie.delete(ids);
		System.out.println("-----------");
		return "redirect:/rest/stu/queryList";
		
	}
	
	
	
	
	
	
}
