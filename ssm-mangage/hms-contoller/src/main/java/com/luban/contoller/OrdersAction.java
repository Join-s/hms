package com.luban.contoller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luban.po.TComponent;
import com.luban.po.TOrderdetails;
import com.luban.po.TOrders;
import com.luban.po.TUser;
import com.luban.service.ComponentsService;
import com.luban.service.OrdersService;
import com.luban.service.TOrderdetailsService;
/**
 * 
* @Description 描述: 订单控制
* @author 作者: hellc 
* @date 时间: 2018年12月13日 下午5:53:02
 */
@Controller
public class OrdersAction {
	@Autowired
	private OrdersService ordersService;
	@Autowired
	private TOrderdetailsService tOrderdetailsService;
	@Autowired
	private ComponentsService componentsService;

	/************** 前台业务 ******************/
	//前台订单
	@RequestMapping("/order/orders")
	public @ResponseBody TOrders selectVoByOid(Integer oid) {
		return ordersService.selectVoByOid(oid);
	}

	// 前台订单删除Vo
	@RequestMapping("/order/delete")
	public String deleteVoByid(Integer id) {
		ordersService.deleteVoByid(id);
		return "forward:/rest/user/myOrderList";

	}

	// 购物车功能
	@RequestMapping("/od/add")
	public @ResponseBody
	String addShoppingcat(HttpSession session, Integer id, Integer number) {
		// 购车车列表
		List<Integer> idsList = session.getAttribute("idsList") == null ? new ArrayList<Integer>()
				: (ArrayList<Integer>) session.getAttribute("idsList");
		// 购物车数量
		Map<Integer, Integer> idsMap = session.getAttribute("idsMap") == null ? new HashMap<Integer, Integer>()
				: (HashMap<Integer, Integer>) session.getAttribute("idsMap");

		if (idsList.contains(id)) {// 如果list包含了
			if (idsMap.containsKey(id)) {// map里有
				if (number == null)
					idsMap.put(id, idsMap.get(id) + 1);
				else
					idsMap.put(id, number);
			} else {// map没有
				if (number == null)
					idsMap.put(id, 1);
				else
					idsMap.put(id, number);
			}
		} else {// 如果list没有包含

			idsList.add(id);

			if (number == null)
				idsMap.put(id, 1);
			else
				idsMap.put(id, number);
		}

		List<TComponent> tComponentsList = componentsService.selectByExample(idsList);

		session.setAttribute("idsList", idsList);
		session.setAttribute("idsMap", idsMap);
		session.setAttribute("tComponentsList", tComponentsList);
//		return "redirect:/rest/goC";// 登陆到首页
		return "OK";
	}

	// 购物车功能
	@RequestMapping("/od/delete")
	public String delete(HttpSession session, Integer id) {
		// 购车车列表
		List<Integer> idsList = session.getAttribute("idsList") == null ? new ArrayList<Integer>()
				: (ArrayList<Integer>) session.getAttribute("idsList");
		// 购物车数量
		Map<Integer, Integer> idsMap = session.getAttribute("idsMap") == null ? new HashMap<Integer, Integer>()
				: (HashMap<Integer, Integer>) session.getAttribute("idsMap");

		if (idsList.contains(id)) {// 如果list包含了
			idsList.remove(id);
			if (idsMap.containsKey(id)) {// map里有
				idsMap.remove(id);
			}
		}
		List<TComponent> tComponentsList = null;
		if (idsList != null && idsList.size() > 0) {
			tComponentsList = componentsService.selectByExample(idsList);
		}
		session.setAttribute("idsList", idsList);
		session.setAttribute("idsMap", idsMap);
		session.setAttribute("tComponentsList", tComponentsList);

		return "shoppingcart";// 登陆到首页
	}

	// 购物车功能 提交订单
	@RequestMapping("/od/addCart")
	public String addcart(HttpSession session) {
		List<Integer> idsList = session.getAttribute("idsList") == null ? new ArrayList<Integer>()
				: (ArrayList<Integer>) session.getAttribute("idsList");
		// 购物车数量
		Map<Integer, Integer> idsMap = session.getAttribute("idsMap") == null ? new HashMap<Integer, Integer>()
				: (HashMap<Integer, Integer>) session.getAttribute("idsMap");

		if (idsList != null && idsList.size() > 0) {
			TOrders t = new TOrders();
			int uid = ((TUser) session.getAttribute("user")).getId();
			t.setUid(uid);

			List<TOrderdetails> toList = new ArrayList<TOrderdetails>();

			for (Integer id : idsList) {
				TOrderdetails to = new TOrderdetails();
				to.setCid(id);
				to.setNumber(idsMap.get(id));

				toList.add(to);
			}
			int result = ordersService.insertCart(t, toList);
			if (result > 0) {
				session.removeAttribute("idsList");
				session.removeAttribute("idsMap");
				session.removeAttribute("tComponentsList");
			}
		}
		return "shoppingcart";// 登陆到首页
	}

	// 购物车功能 清除购物车
	@RequestMapping("/od/deleteCart")
	public String deleteCart(HttpSession session) {
		session.removeAttribute("idsList");
		session.removeAttribute("idsMap");
		session.removeAttribute("tComponentsList");
		return "shoppingcart";// 登陆到首页
	}
	
	/****************** 后台业务********************/
	
	
	@RequestMapping("/or/queryList")
	public String findList() {
		
		return "mangage/orders/ordersList";
	}
	@RequestMapping("/or/queryHouse")
	public String findHouse() {
		
		return "mangage/orders/ordersHouse";
	}
}
