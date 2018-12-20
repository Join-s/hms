<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
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
					<h3>添加学生信息</h3>
					<br />
				</div>
				<div class="col-md-6 col-md-offset-1 column">
					<form action="noticeList.html" method="get" class="bs-example bs-example-form" role="form">
						<div class="row">
							<table class="table table-condensed">
								<tr>
									<td>
										<div class="input-group col-lg-11">
											<span class="input-group-addon">学号</span>
											<input type="text" class="form-control" placeholder="student id">
										</div>
										<br />
									</td>
									<td>
										<div class="input-group col-lg-11">
											<span class="input-group-addon">姓名</span>
											<input type="text" class="form-control" placeholder="name">
										</div>
										<br />
									</td>
								</tr>
								<tr>
									<td>
										<div class="input-group col-lg-11">
											<span class="input-group-addon">性别</span>
											<input type="text" class="form-control" placeholder="sex">
										</div>
										<br />
									</td>
									<td>

										<div class="input-group col-lg-11">
											<span class="input-group-addon">电话</span>
											<input type="text" class="form-control" placeholder="tel">
										</div>
										<br />
									</td>
								</tr>
								<tr>
									<td>
										<div class="input-group col-lg-11">
											<span class="input-group-addon">QQ&nbsp;</span>
											<input type="text" class="form-control" placeholder="qq">
										</div>
										<br />
									</td>
									<td>

										<div class="input-group col-lg-11">
											<span class="input-group-addon">密码</span>
											<input type="password" class="form-control" placeholder="password">
										</div>
										<br />
									</td>
								</tr>
								<tr>
									<td>
										<div class="input-group col-lg-8">
											<span class="input-group-addon">学院</span>
											<select name="" class="form-control">
												<option value="#">请选择学院</option>
												<option value="1">1</option>
												<option value="1">1</option>
												<option value="1">1</option>
												<option value="1">1</option>
											</select>
										</div>
										<br />
									</td>
									<td>
										<div class="input-group  col-lg-8">
											<span class="input-group-addon">专业</span>
											<select name="" class="form-control">
												<option value="#">请选择专业</option>
												<option value="1">1</option>
												<option value="1">1</option>
												<option value="1">1</option>
												<option value="1">1</option>
											</select>
										</div>
										<br />

									</td>
								</tr>
								<tr>
									<td>
										<div class="input-group  col-lg-8">
											<span class="input-group-addon">班级</span>
											<select name="" class="form-control">
												<option value="#">请选择班级</option>
												<option value="1">1</option>
												<option value="1">1</option>
												<option value="1">1</option>
												<option value="1">1</option>
											</select>
											<!--<input type="text" class="form-control" placeholder="notice title">-->
										</div>
										<br />
									</td>
									<td>
										
									</td>
								</tr>
								<tr>
									<td></td>
									<td>
										<div class="input-group  col-lg-2">
											<span class="input-group-btn">
												<button class="btn btn-primary" type="submit">
													submit
												</button>
											</span>
										</div>
									</td>
								</tr>
								
							</table>

						</div>
					</form>

				</div>
			</div>
		</div>

	</body>

</html>