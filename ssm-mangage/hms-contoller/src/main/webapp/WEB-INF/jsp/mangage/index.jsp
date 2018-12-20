<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<!--bootstrap框架文件-->
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/mangage/index.js" ></script>
	</head>
	<body>
	<c:if test="${user!=null }">
	
	
		<div class="container-fluid">
			<div class="row clearfix top_height">
				<div class="col-md-10 column">
					<h3>
				HardwareManagementSystem v2.0.0_1
					</h3>
				</div>
				<div class="col-md-2 column">
							<a href="${pageContext.request.contextPath }/rest/goOut" onclick="return confirm('确定退出？')">
								 <span> <h3>欢饮您！${user.name} ！</h3></span>
							</a>
							</div>
			</div>
			<div class="row clearfix top_height">
						<div class="col-md-12 column">
							<ul class="breadcrumb">
								<li>
									<a href="${pageContext.request.contextPath }/rest/goM">Home</a>
								</li>
								<li>
									<a id="yilei" target="iframe1" >公告管理</a>
								</li>
								<li id="yi-erlei" >
									<a href="#" id="erlei" target="iframe1" >查找公告</a>
								</li>
							</ul>
						</div>
					</div>
			<div class="row clearfix">
				<div class="col-md-2 column">
					
					<div class="row clearfix">
						<div class="col-md-12 column">
							<div class="panel-group" id="panel-540662">
								<div class="panel panel-default">
									<div class="panel-heading">
										<a class="panel-title" data-toggle="collapse" data-parent="#panel-540662" href="#panel-element-0001">公告管理</a>
									</div>
									<div id="panel-element-0001" class="panel-collapse in">
										<div class="panel-body">
											<ul class="list-group">
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/notice/goNoticeList" target="iframe1" class="erlei">公告列表</a>
												</li>
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/goNotAdd" target="iframe1" class="erlei">添加公告</a>
												</li>
											</ul>
										</div>
									</div>
								</div>
								
								<div class="panel panel-default">
									<div class="panel-heading">
										<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-540662" href="#panel-element-0003">学生订单管理</a>
									</div>
									<div id="panel-element-0003" class="panel-collapse collapse">
										<div class="panel-body">
											<ul class="list-group">
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/or/queryList" target="iframe1" class="erlei">订单列表</a>
												</li>
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/or/queryHouse" target="iframe1" class="erlei">订单库操作</a>
												</li>
											</ul>
										</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading">
										<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-540662" href="#panel-element-0004">学生信息管理</a>
									</div>
									<div id="panel-element-0004" class="panel-collapse collapse">
										<div class="panel-body">
											<ul class="list-group">
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/stu/queryList" target="iframe1" class="erlei">学生信息列表</a>
												</li>
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/stu/addStu" target="iframe1" class="erlei">添加学生信息</a>
												</li>
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/stu/queryHouse" target="iframe1" class="erlei">学生信息库操作</a>
												</li>
											</ul>
										</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading">
										<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-540662" href="#panel-element-0005">元件订单管理</a>
									</div>
									<div id="panel-element-0005" class="panel-collapse collapse">
										<div class="panel-body">
											<ul class="list-group">
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/comp/queryAll" target="iframe1" class="erlei">元件列表</a>
												</li>
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/goComAdd" target="iframe1" class="erlei">添加元件</a>
												</li>
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/goComH" target="iframe1" class="erlei">元件库操作</a>
												</li>
											</ul>
										</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading">
										<a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-540662" href="#panel-element-0002">报表管理</a>
									</div>
									<div id="panel-element-0002" class="panel-collapse collapse">
										<div class="panel-body">
											<ul class="list-group">
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/re/queryList" target="iframe1" class="erlei">报表列表</a>
												</li>
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/re/upload" target="iframe1" class="erlei">上传报表</a>
												</li>
												<li class="list-group-item">
													<a href="${pageContext.request.contextPath }/rest/re/queryHouse" target="iframe1" class="erlei">报表库操作</a>
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-10 column">
					<div class="row clearfix">
						<div class="col-md-12 column col-lg-12">
								<iframe id="iframe1" name="iframe1" scrolling="no" src="/rest/goWel" width="100%" frameborder="0px" framespacing="0px"></iframe>
						</div>
					</div>
				</div>
			</div>
		</div>
		</c:if>
		<c:if test="${user==null }">
		<a href="/rest/goLoginsys">place login</a>
		</c:if>
	</body>

</html>