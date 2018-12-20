<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--注册结果友好界面-->
<html>

	<head>
		<meta charset="UTF-8">
		<title>注册结果</title>
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="stylesheet" href="css/register.css" />
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/register.js" ></script>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		 <div class="row">
		<div class="col-lg-3 col-lg-offset-4" >
		 		<img src="img/register-success.jpg" class="img-circle" width="623px" height="600px"/>
		 		<!--注册失败显示-->
		 		<!--<img src="img/register-error.jpg" class="img-circle" width="623px" height="600px"/>-->
		 		</div>
		 	</div>
		</div>
		 <div class="row">
		 	<div class="col-lg-4 col-lg-offset-4">
		 		<div class="alert-success result">
		 			注册成功<br/>
		 			<a href="login.html">点击登陆</a>
		 			<!--注册失败显示-->
		 			<!--注册失败<br/>
		 			<a href="register.html">重新注册</a>-->
		 		</div>
		 	</div>
		 </div>
	</body>

</html>