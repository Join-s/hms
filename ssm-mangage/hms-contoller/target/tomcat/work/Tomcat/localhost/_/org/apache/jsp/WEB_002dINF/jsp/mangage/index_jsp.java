/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-13 10:13:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.mangage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("\t\t<!--bootstrap框架文件-->\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/bootstrap-3.3.7-dist/css/bootstrap.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/bootstrap-3.3.7-dist/js/bootstrap.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/mangage/index.js\" ></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/mangage/index.jsp(17,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user!=null }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\r\n");
        out.write("\t\r\n");
        out.write("\t\t<div class=\"container-fluid\">\r\n");
        out.write("\t\t\t<div class=\"row clearfix top_height\">\r\n");
        out.write("\t\t\t\t<div class=\"col-md-10 column\">\r\n");
        out.write("\t\t\t\t\t<h3>\r\n");
        out.write("\t\t\t\tHardwareManagementSystem v2.0.0_1\r\n");
        out.write("\t\t\t\t\t</h3>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"col-md-2 column\">\r\n");
        out.write("\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/goOut\" onclick=\"return confirm('确定退出？')\">\r\n");
        out.write("\t\t\t\t\t\t\t\t <span> <h3>欢饮您！");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write(" ！</h3></span>\r\n");
        out.write("\t\t\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t\t<div class=\"row clearfix top_height\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-12 column\">\r\n");
        out.write("\t\t\t\t\t\t\t<ul class=\"breadcrumb\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/goM\">Home</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a id=\"yilei\" target=\"iframe1\" >公告管理</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t<li id=\"yi-erlei\" >\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" id=\"erlei\" target=\"iframe1\" >查找公告</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t<div class=\"row clearfix\">\r\n");
        out.write("\t\t\t\t<div class=\"col-md-2 column\">\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<div class=\"row clearfix\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-12 column\">\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"panel-group\" id=\"panel-540662\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"panel-title\" data-toggle=\"collapse\" data-parent=\"#panel-540662\" href=\"#panel-element-0001\">公告管理</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div id=\"panel-element-0001\" class=\"panel-collapse in\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/notice/goNoticeList\" target=\"iframe1\" class=\"erlei\">公告列表</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/goNotAdd\" target=\"iframe1\" class=\"erlei\">添加公告</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"panel-title collapsed\" data-toggle=\"collapse\" data-parent=\"#panel-540662\" href=\"#panel-element-0003\">学生订单管理</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div id=\"panel-element-0003\" class=\"panel-collapse collapse\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/or/queryList\" target=\"iframe1\" class=\"erlei\">订单列表</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/or/queryHouse\" target=\"iframe1\" class=\"erlei\">订单库操作</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"panel-title collapsed\" data-toggle=\"collapse\" data-parent=\"#panel-540662\" href=\"#panel-element-0004\">学生信息管理</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div id=\"panel-element-0004\" class=\"panel-collapse collapse\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/stu/queryList\" target=\"iframe1\" class=\"erlei\">学生信息列表</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/stu/addStu\" target=\"iframe1\" class=\"erlei\">添加学生信息</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/stu/queryHouse\" target=\"iframe1\" class=\"erlei\">学生信息库操作</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"panel-title collapsed\" data-toggle=\"collapse\" data-parent=\"#panel-540662\" href=\"#panel-element-0005\">元件订单管理</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div id=\"panel-element-0005\" class=\"panel-collapse collapse\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/comp/queryAll\" target=\"iframe1\" class=\"erlei\">元件列表</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/goComAdd\" target=\"iframe1\" class=\"erlei\">添加元件</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/goComH\" target=\"iframe1\" class=\"erlei\">元件库操作</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"panel-title collapsed\" data-toggle=\"collapse\" data-parent=\"#panel-540662\" href=\"#panel-element-0002\">报表管理</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<div id=\"panel-element-0002\" class=\"panel-collapse collapse\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-group\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/re/queryList\" target=\"iframe1\" class=\"erlei\">报表列表</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/re/upload\" target=\"iframe1\" class=\"erlei\">上传报表</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/rest/re/queryHouse\" target=\"iframe1\" class=\"erlei\">报表库操作</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"col-md-10 column\">\r\n");
        out.write("\t\t\t\t\t<div class=\"row clearfix\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-12 column col-lg-12\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<iframe id=\"iframe1\" name=\"iframe1\" scrolling=\"no\" src=\"/rest/goWel\" width=\"100%\" frameborder=\"0px\" framespacing=\"0px\"></iframe>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/mangage/index.jsp(163,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user==null }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<a href=\"/rest/goLoginsys\">place login</a>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
