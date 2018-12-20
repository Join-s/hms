package com.luban.contoller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luban.po.TDepartment;
import com.luban.po.TGrade;
import com.luban.po.TMajor;
import com.luban.po.TUser;
import com.luban.service.UserServcie;

/**
 * 
 * Title:UserAction describe:user控制层
 * 
 * @author 鲁班学院-无涯
 * @日期 2018-10-30 下午9:08:45
 */
@Controller
@RequestMapping("/user")
public class UserAction {

	// 注入业务层
	@Resource
	private UserServcie userServcie;

	/**
	 * @Description 方法描述: 用户登陆跳转
	 */
	@RequestMapping("/login")
	public String stuLogin(Model model, TUser user, HttpSession session) {

		TUser tuser = userServcie.login(user);

		if (tuser != null && "0".equals(user.getRemark1())) {// 学生登陆成功
			model.addAttribute("flag", true);
			session.setAttribute("user", tuser);
			return "forward:/rest/go";// 登陆到首页

		} else if (tuser != null && "1".equals(user.getRemark1())) {// 管理员登陆成功
			session.setAttribute("user", tuser);
			model.addAttribute("flag", true);
			return "mangage/index";// 登陆到后台首页
		} else {// 没有登录成功
			model.addAttribute("flag", false);
			return "redirect:/rest/goLogin";// 重新登陆
		}
	}

	/*
	 * 订单列表及详情显示
	 */
	@RequestMapping("/myOrderList")
	public String selectVo(HttpSession session) {
		int uid = (TUser) session.getAttribute("user") == null ? 0 : ((TUser) session.getAttribute("user")).getId();
		TUser u = userServcie.selectVo(uid);
		if (u != null)
			session.setAttribute("orderList", u.gettOrders());
		return "personal-enter";
	}

	/*
	 * 購物車
	 */
	@RequestMapping("/shoppingcat")
	public String selectShoppingCat(HttpSession session, Integer cid) {
		int uid = (TUser) session.getAttribute("user") == null ? 0 : ((TUser) session.getAttribute("user")).getId();
		TUser u = userServcie.selectVo(uid);
		if (u != null)
			session.setAttribute("shoppingList", u.gettOrders());
		return "shoppingcart";
	}

//	/**
//	 * 查询所有学院
//	 */
//	@RequestMapping("/queryDep")
//	public 
//	@ResponseBody
//	List<TDepartment> queryDep() {
//		return null;
//		
//	}
	/**
	 * 根据学院id查询专业
	 */
	@RequestMapping("/queryByDep")
	public @ResponseBody List<TMajor> queryByDep(@RequestBody Integer did) {

		List<TMajor> list = userServcie.queryByDep(did);

		return list;

	}

	/**
	 * 根据专业查询班级
	 */
	@RequestMapping("/queryByMag")
	public @ResponseBody List<TGrade> queryByMag(@RequestBody Integer mid) {
		List<TGrade> list = userServcie.queryByMag(mid);
		return list;

	}

	/**
	 * 注册学生用户
	 */
	@RequestMapping("register")
	public String register(TUser user) {
		int i = userServcie.insertUser(user);
		if (i > 0)
			return "redirect:/rest/goLogin";
		return "redirect:/rest/goRegister";
	}
	
	
 
	

}
