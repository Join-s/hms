package com.luban.contoller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.luban.po.TDepartment;
import com.luban.po.TLargeclass;
import com.luban.po.TNotice;
import com.luban.service.NoticeService;
import com.luban.service.UserServcie;
import com.luban.service.LargeclassService;

/**
 * 
 * Title:GoAction
 * describe: 跳转页面
 * @version 1.0
 */
@Controller
public class GoAction {
	
	@Autowired
	private LargeclassService tLargeclassService;
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private UserServcie userServcie;
	/**
	* @Description 方法描述: 前台首页
	 */
	
	@RequestMapping("/go")
	public String goIndex(Model model,HttpSession session){
		//公告信息
		
		return "index";
	}
	/**
	* @Description 方法描述: 用户登陆界面
	 */
	@RequestMapping("/goLogin")
	public String goLogin(){
		return "login";
	}
	/**
	* @Description 方法描述: 管理员登陆界面
	 */
	@RequestMapping("/goLoginsys")
	public String goLoginsys(){
		return "loginsys";
	}
	/**
	* @Description 方法描述: 用户注册
	 */
	@RequestMapping("/goRegister")
	public String goRegister(HttpSession session){
		
		List<TDepartment> det=userServcie.queryDep();
		session.setAttribute("depList",det );
		return "register";
	}
	/**
	* @Description 方法描述: 注册结果
	 */
	@RequestMapping("/goRegisterResult")
	public String goRegisterResult(){
		return "register-result";
	}
	/**
	* @Description 方法描述: 前台元件主页
	 */
	@RequestMapping("/goC")
	public String goComponentList(HttpSession session){
		//元件列表
		TLargeclass tcLargeclass=new TLargeclass();
		List<TLargeclass> list =tLargeclassService.selectVo(tcLargeclass);
		session.setAttribute("llist",list);
		return "componentList";
	}
	/**
	* @Description 方法描述: 登出
	 */
	@RequestMapping("/goOut")
	public String goOut(HttpSession session){
		session.invalidate();
		return "redirect:/rest/go";
	}
	/**
	* @Description 方法描述: 后台首页
	 */
	@RequestMapping("/goM")
	public String goM(){
		return "mangage/index";
	}
	/**
	* @Description 方法描述: 后台公告列表
	 */
	@RequestMapping("/goNotList")
	public String goNotList(){
		return "mangage/notice/noticeList";
	}
	/**
	* @Description 方法描述: 后台添加公告
	 */
	@RequestMapping("/goNotAdd")
	public String goNotAdd(){
		return "mangage/notice/noticeadd";
	}
	/**
	* @Description 方法描述: 后台欢迎界面
	 */
	@RequestMapping("/goWel")
	public String goWel(){
		return "mangage/welcome";
	}
	/**
	* @Description 方法描述: 后台添加元件
	 */
	@RequestMapping("/goComAdd")
	public String goComAdd(){
		return "mangage/components/componentsAdd";
	}
	/**
	* @Description 方法描述: 后台元件库操作
	 */
	@RequestMapping("/goComH")
	public String goComH(){
		return "mangage/components/componentsHouse";
	}
	/**
	* @Description 方法描述: 后台学生订单审核操作
	 */
	@RequestMapping("/goOrdersList")
	public String goOrdersList(){
		
		
		
		return "mangage/components/ordersList";
	}
	
	
	
}
