<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title></title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<!--bootstrap框架文件-->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/mangage/noticeList.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/css/noticeList.css" />
</head>

<body>
	<div class="container-fluid">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<h3>公告列表</h3>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<!--删除公告表单 -->
				<form action="${pageContext.request.contextPath }/rest/notice/delete" method="post" id="form1">
					<table class="table table-condensed table-striped">
						<!--表头-->
						<thead>
							<tr></tr>
							<tr>
								<th>状态</th>
								<th>公告标题</th>
								<th>公告内容</th>
								<th>公告链接</th>
								<th>公告创建时间</th>
								<th>是否显示</th>
								<th>操作</th>
							</tr>
						</thead>
						<!--/表头-->
						
						
						<tbody>
						
							<!--表数据项-->
							<c:forEach items="${nList }" var="li">
								<tr>
									<td><input type="checkbox" name="ids" value="${li.id }" />
									</td>
									<td>${li.title }</td>
									<td>${li.text }</td>
									<td>${li.link }</td>
									<td><fmt:formatDate value="${li.createtime }"
											pattern="yyyy-MM-dd hh:mm:ss" /></td>
									<th>
									<c:if test="${li.istop=='1' }" var="sds">
										显示
									</c:if>
									<c:if test="${!sds }">
											不显示
										</c:if>
									 </th>
									<td>
										<!-- 按钮触发模态框 --> <!--data-toggle="modal" data-target="#myModal"-->
										<a href="#" class="xq-btn" data-toggle="modal"
										data-target="#myModal">详情</a> <a href="#" data-toggle="modal"
										data-target="#myModal" class="xg-btn">修改</a> 
										<c:if test="${li.istop=='1' }" var="sds">
											<a href="/rest/notice/setTop?ids=${li.id }&top=0" class="alert-danger">取消置顶</a>
										</c:if>
										<c:if test="${!sds }">
											<a href="/rest/notice/setTop?ids=${li.id }&top=1" class="alert-info">置顶</a>
										</c:if>
									</td>
								</tr>
							</c:forEach>
							<!--/表数据项-->
							
						</tbody>
					</table>
				</form>
<!-- /删除公告表单 -->
				
				
				</div>
			</div>
			<!--列表工具-->
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="col-lg-2 col-md-4">
						<!--全选和删除按钮-->
						<ul class="pagination pagination-sm">
							<li><a class="btn btn-primary" onclick="checkId()">全选</a></li>
							<li><a class="btn btn-warning" onclick="return delteCheck()">删除</a>
							</li>
						</ul>
						<!--/.全选和删除按钮-->
					</div>

					<div class="col-lg-8 col-md-8">
						<!--分页-->
						<ul class="pagination pagination-sm fenye-ul">
							<li><a
								href="${pageContext.request.contextPath }/rest/notice/goNoticeList?pageNum=${pageInfo.prePage}">Prev</a></li>
							<c:forEach begin="1" var="info" end="${pageInfo.pages }" step="1">
								<c:if test="${pageInfo.pageNum==info }" var="flag">
									<li class="active"><a
										href="${pageContext.request.contextPath }/rest/notice/goNoticeList?pageNum=${info}">${info }</a></li>
								</c:if>
								<c:if test="${!flag }">
									<li><a
										href="${pageContext.request.contextPath }/rest/notice/goNoticeList?pageNum=${info}">${info }</a></li>
								</c:if>
							</c:forEach>
							<li><a
								href="${pageContext.request.contextPath }/rest/notice/goNoticeList?pageNum=${pageInfo.nextPage}">Next</a></li>
						</ul>
						<!--/.分页-->
					</div>
				</div>
			</div>
			<!-- /.列表工具-->
			
			
			
			<div  class="row clearfix">
			<div class="row">
					<!-- 公告模态框（Modal） -->
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">公告详情</h4>
								</div>
								<div class="modal-body">
									<!--修改显示公告信息表单-->
									<!--修改显示公告信息表单-->
										<form action="" method="post" id="xq-form" onsubmit="return checkinfo()">
											<table class="table table-condensed">
												<tr>
													<td>
														<b>公告标题:</b>
														<input type="text" value="" name="" id="ntitile" />
													</td>
												</tr>
												<tr>
													<td><b>公告内容:</b></td>
												</tr>
												<tr>
													<td>
														<textarea id="ntext" name="" cols="76%" rows="20"></textarea>
													</td>
												</tr>
												<tr>
													<td>
														<b>公告链接:</b>
													</td>
												</tr>
												<tr>
													<td>
														<input type="text" value="" name=""  />
													</td>
												</tr>
												<tr>
													<td><b>公告时间:</b>
														<input type="date" value="" name=""  />
													</td>
												</tr>
												<tr>
													<td><b>状态:</b>
														<input type="text" value="" name=""  />
														<input type="hidden" value="" name=""  />
													</td>
												</tr>
											</table>
										</form>
									<!-- /修改显示公告信息表单-->
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">关闭</button>
									<!--修改会自动影藏此按钮-->
									<button type="button" class="btn btn-primary"
										id="xq-form-sumbit" >提交更改</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.公告模态框（Modal） -->
					</div>
			
			</div>
		</div>
</body>

</html>