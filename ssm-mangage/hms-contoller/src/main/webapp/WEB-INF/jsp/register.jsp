<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<!DOCTYPE html>

<!--注册页面-->
<html>

	<head>
		<meta charset="UTF-8">
		<title>注册用户</title>
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/css/register.css" />
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/register.js" ></script>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<div class="container-fluid">
			<!-- 主体 start -->
			<div class="row">
				<div class="col-lg-4 col-lg-offset-4">
					<form action="/rest/user/register" method="post" onsubmit="return check()">
						<h1><b>用户注册</b></h1><br/><br/>
						<table class="table table-hover">
							<tbody>
								<tr>
									<td align="right">
										姓名：
									</td>
									<td><input type="text" value="" name="name" id="username" onblur="checkUsername()"/><span id="usernameSpan">*</span> </td>
								</tr>
								<tr>
									<td align="right">
										学号：
									</td>
									<td><input type="text" value="" name="jnumber" id="usernumber" onblur="checkUsernumber()"/><span id="usernumberSpan">*</span></td>
								</tr>
								<tr>
									<td align="right">
										密码：
									</td>
									<td><input type="password" value="" name="pwd" id="pwd" onblur="checkPwd()"/><span id="pwdSpan">*</span></td>
								</tr>
								<tr>
									<td align="right">
										确认密码：
									</td>
									<td><input type="password" value=""  id="repwd" onblur="checkRepwd()"/><span id="repwdSpan">*</span></td>
								</tr>
								<tr>
									<td align="right">
										性别：
									</td>
									<td><input type="radio" value="男" name="sex" checked="checked" />男
									<input type="radio" value="女" name="sex" />女</td>
								</tr>
								
								
								<tr>
									<td align="right">QQ：</td>
									<td><input type="text" name="qq" id="QQ" value=""/> <span id="QQSpan">*</span></td>
								</tr>
								<tr>
									<td align="right">邮箱：</td>
									<td><input type="email" name="remark2" id="email" value=""/> <span id="emailSpan">*</span></td>
								</tr>
								<tr>
									<td align="right">手机号：</td>
									<td><input type="text" name="tel" id="phone" value="" /> <span id="phoneSpan">*</span></td>
								</tr>
							 
								<tr>
									<td align="right">
										院系专业班级：
									</td>
									<td>
										<select   id="college" onchange="selectcollege()">
											<!--第一条不可删-->
											<option value="0">请选择学院</option>
											<c:forEach items="${depList }" var ="dep">
												<option value="${dep.id }">${dep.name }</option>
											</c:forEach>
										</select>
										<select   id="major" style="display: none;" onchange="selectmajor()">
											<option value="0">请选择专业</option>
											<option value="1">软件工程</option>
											<option value="2">信息管理</option>
											<option value="3">城乡规划与管理争执学</option>
										</select>
										<select name="graid" id="team" style="display: none;" onchange="selectteam()">
											<option value="0">请选择班级</option>
											<option value="1">1班</option>
											<option  value="2">2班</option>
											<option  value="3">3班</option>
											<option  value="4">4班</option>
											<option  value="5">5班</option>
											<option  value="6">6班</option>
											<option  value="7">7班</option>
											<option  value="8">8班</option>
											<option  value="9">9班</option>
											<option value="10">10班</option>
										</select>
										<span id="teamSpan">*</span>
									</td>
								</tr>
								<tr>
									<td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<input type="submit" value="注册" class="btn btn-info" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<!-- <input type="reset" value="重新输入" class="btn btn-warning"/> -->
										<a href="${pageContext.request.contextPath }/rest/goLogin" class="btn btn-info">返回</a>
									</td>
								</tr>
							</tbody>
						</table>
					</form>
				</div>
			</div>
		</div>
	</body>

</html>