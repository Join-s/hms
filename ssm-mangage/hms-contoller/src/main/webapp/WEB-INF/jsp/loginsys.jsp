<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>管理员登陆</title>
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/login.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/css/login.css" />
	</head>
	<body>
		<div class="container main">
			<div class="row ">
				<div class="col-lg-12">
				</div></div>
			<div class="row ">
				<div class="col-lg-4 col-lg-offset-4 f-table">
					<h1>管理员登陆</h1> 
					<form action="${pageContext.request.contextPath }/rest/user/login" method="post" onsubmit="return check()">
						<table class="table table-hover">
							<tbody>
								<tr>
									<td align="right"><b>账号：</b></td>
									<td>
										<input type="text"  name="jnumber" id="username"/>
									</td>
								</tr>
								<tr>
									<td align="right"><b>密码：</b></td>
									<td>
										<input type="password"  name="pwd"  id="pwd"/>
									</td>
								</tr>
								<tr>
									<td colspan="2">
									<input type="hidden"  name="remark1" value="1"/>
										<a href="${pageContext.request.contextPath }/rest/goLogin" >&gt;&gt;用户入口</a>
									</td>
								</tr>
								<tr>
									<td  align="right"><input type="submit" value="登陆"  class="btn btn-info"/></td>
									
									<td> |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button class="btn btn-info" onclick="alert('管理员不可注册！');">注册</button></td>
								</tr>
							</tbody>
						</table>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>