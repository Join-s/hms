<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<!--bootstrap框架文件-->
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.min.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
	</head>

	<body>
		<div class="container-fluid">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h3>添加公告</h3>
				</div>
				<div class="col-md-12 column">
					<form action="/rest/notice/add" method="post" class="bs-example bs-example-form" role="form">
						<div class="input-group">
							<span class="input-group-addon">公告标题</span>
							<input type="text" class="form-control" placeholder="notice title" name="title">
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-addon">公告内容</span>
							<textarea name="text" class="form-control" rows="10" placeholder="notice text">notice text</textarea>
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-addon">公告链接</span>
							<input name="link" type="text" class="form-control" placeholder="notice url">
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-btn">
								<button class="btn btn-primary" type="submit">
									submit
								</button>
							</span>
						</div>
						<br>
					</form>

				</div>
			</div>
		</div>

	</body>

</html>