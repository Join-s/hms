package com.luban.contoller;
/**
 * 
* @Description 描述: 公告action
* @author 作者: hellc 
* @date 时间: 2018年11月8日 上午11:54:26
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luban.po.TNotice;
import com.luban.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeAction {
	@Resource
	private NoticeService noticeService;

	/**
	 * 
	 * @Description 方法描述: 查询公告
	 */
	@RequestMapping("goNoticeList")
	public String queryAll( Integer pageNum,HttpSession session) {
		// 分页处理 (pageNum 当前页, pageSize 每页显示几条数据)
		if (pageNum == null) {
			pageNum = 1;
		}
		PageHelper.startPage(pageNum, 3);
		PageHelper.orderBy("createtime desc,istop desc");
		List<TNotice> tnoticeList = noticeService.selectAll();
		PageInfo<TNotice> pageInfo = new PageInfo<TNotice>(tnoticeList);
		session.setAttribute("nList", pageInfo.getList());
		session.setAttribute("pageInfo", pageInfo);

		return "mangage/notice/noticeList";
	}

	/**
	 * 
	 * @Description 方法描述: 根据id查询公告
	 */
	@RequestMapping("query")
	public @ResponseBody TNotice findById(@RequestBody Integer ids) {
		TNotice t = noticeService.findById(ids);
		return t;
	}

	/**
	 * 
	 * @Description 方法描述: 更新公告
	 */
	@RequestMapping("update")
	public void update(TNotice t, HttpServletResponse resp,HttpSession session) throws IOException {
		int i = noticeService.updateByPrimaryKeySelective(t);
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		PageInfo<TNotice> page=(PageInfo<TNotice>) session.getAttribute("pageInfo");
		int pageNum=page.getPageNum();
		
		if (i > 0) {
			out.println("<script>alert('修改成功');window.location.href='/rest/notice/goNoticeList?pageNum='"+pageNum+";</script>");
		} else {
			out.println("<script>alert('修改失败');window.location.href='/rest/notice/goNoticeList?pageNum='"+pageNum+";</script>");
		}
	}
	/**
	 * 
	* @Description 方法描述: 修改公告
	 */
	@RequestMapping("setTop")
	public String mSetTop(Integer ids,String top,HttpSession session) {
		TNotice t=new TNotice();
		t.setId(ids);
		t.setIstop(top);
		noticeService.updateByPrimaryKeySelective(t);
		
		PageInfo<TNotice> page=(PageInfo<TNotice>) session.getAttribute("pageInfo");
		int pageNum=page.getPageNum();
		
		return "redirect:/rest/notice/goNoticeList?pageNum="+pageNum;
		
	}
	/**
	 * 
	* @Description 方法描述: 删除公告
	 */
	@RequestMapping("delete")
	public String delete(Integer[] ids,HttpSession session) {
		
		if(ids!=null && ids.length>0) {
			for(int i=0;i<ids.length;i++) {
			noticeService.deleteByPrimaryKey(ids[i]);
			}
		}
		
		PageInfo<TNotice> page=(PageInfo<TNotice>) session.getAttribute("pageInfo");
		int pageNum=page.getPageNum();
		
		return "redirect:/rest/notice/goNoticeList?pageNum="+pageNum;
		
	}
	/**
	 * 
	* @Description 方法描述: 添加公告
	 */
	
	@RequestMapping("add")
	public String add(TNotice tNotice) {
		tNotice.setIstop("0");
		int i=noticeService.insert(tNotice);
		
		return "/mangage/notice/noticeadd";
	}
	
}
