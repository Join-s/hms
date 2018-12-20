package com.luban.contoller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luban.po.TComponent;
import com.luban.po.TLargeclass;
import com.luban.service.ComponentsService;
import com.luban.service.LargeclassService;

@Controller
@RequestMapping("comp")
public class ComponentsAction {
	@Autowired
	private ComponentsService componentsService;

	@Autowired
	private LargeclassService tLargeclassService;
/**
* @Description 方法描述: 后台查看所有元件
 */
	@RequestMapping("queryAll")
	public String queryAll(Integer pageNum, HttpSession session, TComponent tComponent, String lei, String zonghe,
			String kucun) {
		if (pageNum == null) {
			pageNum = 1;
		}
		// 分页
		PageHelper.startPage(pageNum, 15);
		// 模糊查询
		TComponent t2 = tComponent;// 模糊查询
		if ((TComponent) session.getAttribute("tComponent") != null) {
			tComponent = (TComponent) session.getAttribute("tComponent");
		}
		if (t2.getName() != null) {
			tComponent.setName(t2.getName());
		}
		// 排序
		if ("1".equals(lei)) {
			PageHelper.orderBy("sid");
			session.setAttribute("lei", "1");
			session.removeAttribute("name");
			session.removeAttribute("kucun");
		} else if ("1".equals(zonghe)) {
			PageHelper.orderBy("name");
			session.setAttribute("zonghe", "1");
			session.removeAttribute("kucun");
			session.removeAttribute("lei");
		} else if ("1".equals(kucun)) {
			PageHelper.orderBy("store desc");
			session.setAttribute("kucun", "1");
			session.removeAttribute("name");
			session.removeAttribute("lei");
		} else {
			if (session.getAttribute("lei") != null && "1".equals((String) session.getAttribute("lei"))) {
				session.removeAttribute("name");
				session.removeAttribute("kucun");
				PageHelper.orderBy("sid");
			} else if (session.getAttribute("name") != null && "1".equals((String) session.getAttribute("name"))) {
				session.removeAttribute("kucun");
				session.removeAttribute("lei");
				PageHelper.orderBy("name");
			} else if (session.getAttribute("kucun") != null && "1".equals((String) session.getAttribute("kucun"))) {
				session.removeAttribute("name");
				session.removeAttribute("lei");
				PageHelper.orderBy("store desc");
			}else {
				session.removeAttribute("name");
				session.removeAttribute("lei");
				PageHelper.orderBy("store desc");
				
			}
		}
		session.setAttribute("tComponent", tComponent);
		tComponent.setSid(null);
		List<TComponent> clist = componentsService.selectAll(tComponent);
		PageInfo<TComponent> pageInfo = new PageInfo<TComponent>(clist);
		session.setAttribute("largepageInfo", pageInfo);
		return "mangage/components/componentsList";
	}
	/**
	* @Description 方法描述: 前台根据元件分类显示元件
	 */
	@RequestMapping("queryBySid")
	public String queryBySid( HttpSession session,Integer pageNum, TComponent tComponent, String price, String zonghe,
			String kucun) {
		
		//获取元件分类
		//元件列表
		TLargeclass tcLargeclass=new TLargeclass();
		List<TLargeclass> list =tLargeclassService.selectVo(tcLargeclass);
		session.setAttribute("llist",list);
		//获取分页
		if (pageNum == null) {
			pageNum = 1;
		}
		PageHelper.startPage(pageNum, 10);
		// 模糊查询
				TComponent t2 = tComponent;// 模糊查询
				if ((TComponent) session.getAttribute("tComponent") != null) {
					tComponent = (TComponent) session.getAttribute("tComponent");
				}else {
					tComponent.setSid(1);
				}
				if (t2.getName() != null) {
					tComponent.setName(t2.getName());
				}
				if(t2.getSid()!=null && t2.getSid()!=0) {
					tComponent.setSid(t2.getSid());
				}
		//获取排序条件
		if ("1".equals(price)) {
			PageHelper.orderBy("price");
			session.setAttribute("price", "1");
			session.removeAttribute("name");
			session.removeAttribute("kucun");
		} else if ("1".equals(zonghe)) {
			PageHelper.orderBy("name");
			session.setAttribute("zonghe", "1");
			session.removeAttribute("kucun");
			session.removeAttribute("lei");
		} else if ("1".equals(kucun)) {
			PageHelper.orderBy("store desc");
			session.setAttribute("kucun", "1");
			session.removeAttribute("name");
			session.removeAttribute("price");
		} else {
			if (session.getAttribute("price") != null && "1".equals((String) session.getAttribute("price"))) {
				session.removeAttribute("name");
				session.removeAttribute("kucun");
				PageHelper.orderBy("price");
			} else if (session.getAttribute("name") != null && "1".equals((String) session.getAttribute("name"))) {
				session.removeAttribute("kucun");
				session.removeAttribute("price");
				PageHelper.orderBy("name");
			} else if (session.getAttribute("kucun") != null && "1".equals((String) session.getAttribute("kucun"))) {
				session.removeAttribute("name");
				session.removeAttribute("price");
				PageHelper.orderBy("store desc");
			}
		}
		//查询元件，返回列表
		session.setAttribute("tComponent", tComponent);
		List<TComponent> clist = componentsService.selectAll(tComponent);
		PageInfo<TComponent> pageInfo = new PageInfo<TComponent>(clist);
		session.setAttribute("compPageInfo", pageInfo);
		return "componentList";
	}
	
	@RequestMapping("findById")
	public @ResponseBody
	TComponent selectVoById(@RequestBody Integer id) {
		TComponent t=componentsService.selectVoById(id);
		return t;
		
	}
	//根据id删除元件
	@RequestMapping("delete")
	public 
	String delete(Integer[] ids) {
		System.out.println(ids.length);
		for(Integer d:ids) {
			System.out.println(d);
		}
		
		int i=componentsService.delete(ids);
		
		return "redirect:/rest/comp/queryAll";
		
	}
	

}
