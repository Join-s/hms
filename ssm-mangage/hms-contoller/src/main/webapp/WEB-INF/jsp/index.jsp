<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>首页</title>
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/css/foot.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/css/index.css" />
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
		
			<script type="text/javascript" src = "${pageContext.request.contextPath }/resource/js/autoifrheight.js"/></script> 
	</head>

	<body>

		<!-- 导航栏 start -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			            <span class="icon-bar"></span>
			            <span class="icon-bar"></span>
			            <span class="icon-bar"></span>
          			</button>
					<a class="navbar-brand" href="#">硬件管理系统v2.0</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse nav-tabs">
					<ul class="nav navbar-nav ">
						<li class="">
							<a href="${pageContext.request.contextPath }/rest/goC" target="mainifram">首页</a>
						</li>
						<li>
							<a href="${pageContext.request.contextPath }/rest/user/shoppingcat" target="mainifram">购物车</a>
						</li>
						<li>
							<a href="${pageContext.request.contextPath }/rest/user/myOrderList" target="mainifram">个人中心</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">关于 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li>
									<a href="download.html" target="mainifram">下载</a>
								</li>

								<li>
									<a href="Feedback.html" target="mainifram">反馈</a>
								</li>
								<li>
									<a href="help.html" target="mainifram">帮助</a>
								</li>
								<li role="separator" class="divider"></li>
								<li class="dropdown-header">system</li>
								<li>
									<a href="systemdebugging.html" target="mainifram">system debugging</a>
								</li>
								<li>
									<a href="systemstate.html" target="mainifram">system state</a>
								</li>
							</ul>
						</li>
					</ul>
					<ul class="nav navbar-nav navbar-right ">
					<c:if test="${!flag || flag==null}">
						<li>
							<a href="${pageContext.request.contextPath }/rest/goLogin" target="_self">登陆</a>
						</li>
					</c:if>
						<c:if test="${flag }">
							<li>
							<a href="${pageContext.request.contextPath }/rest/goOut" onclick="return confirm('确定退出？')">
								<img class="img-circle" src="${pageContext.request.contextPath }/resource/img/${user.img==null?'bg.jpg':user.img }" height="20px" width="20px" /> 
								
								<span>${user.name} </span>
							</a>
						</li>
						</c:if>
						<!-- 登陆成功显示
						<li>
							<a href="#logininfo" onclick="return confirm('确定退出？')">
								<img class="img-circle" src="${pageContext.request.contextPath }/resource/img/test/11.jpg" height="20px" width="20px" /> <span>hellc</span>
							</a>
						</li>
						 -->
					</ul>
				</div>
			</div>
		</nav>
		<!-- 导航栏 end -->
		<div class="container-fluid">
			<!--公告内容 start-->
			<div class="jumbotron col-lg-offset-2 col-lg-8">
				<!--公告标题-->
				<h1>硬件实验室公告</h1>
				<!--公告内容-->
				 Step by step, we finishedthe process of PCB execution、component jointing、circuit testing、product fixing, then a digital cymometer comes true.  
			</div>
			<!--公告内容 start-->
			<div class="tab-content" id="">
				<!--shouye start -->
				<div class="tab-pane active" id="shouye">
					<!-- 主体 start -->
					<div class="row">
						<div class="col-lg-12">
							<iframe id="mainifram" name="mainifram" src='/rest/comp/queryBySid'   frameborder="0" scrolling="auto">
					</iframe>
						</div>
					</div>
				</div>
			</div>
			<!-- 主体 end -->
			<!-- 页面底部 start -->
			<div class="row" id="foot">
				<div class="col-lg-12" style="background-color: #269ABC;">
					<div class="col-lg-6 col-lg-offset-3">
						<!--友情链接 -->
						<ul>
							<li>
								<a href="#">学生教务系统</a>
							</li>
							<li>
								<a href="#">一卡通</a>
							</li>
							<li>
								<a href="#">当当网商城</a>
							</li>
							<li>
								<a href="#">四六级查询</a>
							</li>
						</ul>
						<div class="clear"></div>
					</div>
					<div class="col-lg-4 col-lg-offset-4">
						<p>&copy;阜阳师范学院硬件实验室 版权所有</p>
					</div>

				</div>
			</div>
			<!-- 页面底部 end -->
		</div>
		</div>
	</body>

</html>