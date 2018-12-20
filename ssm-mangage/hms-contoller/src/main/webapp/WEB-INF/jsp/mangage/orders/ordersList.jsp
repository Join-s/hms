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
		<script type="text/javascript" src="${pageContext.request.contextPath }/resource/js/mangage/ordersList.js"></script>
	</head>

	<body>
		<div class="container-fluid">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h3>
				学生列表
			</h3>
				</div>
			</div>
			<div class="row clearfix">

				<div class="row clearfix">
					<div class="col-md-12 column">
						<div class="alert alert-success alert-dismissable">
							<button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
							<h4>
					注意!
				</h4> <strong>Warning!</strong> Best check yo self, you're not looking too good.
							<a href="#" class="alert-link">alert link</a>
						</div>
					</div>
				</div>
				<div class="row clearfix">
					<div class="col-md-12 column">
						<div class="row clearfix">
							<div class="col-md-2 column">
								<div class="btn-group">
									<button class="btn btn-default" type="button"><em class="glyphicon glyphicon glyphicon-download"></em> 导出所选</button> 
									<button class="btn btn-default" type="button"><em class="glyphicon glyphicon glyphicon-download"></em>导出所有</button> 
								</div>
							</div>
							<div class="col-md-6 column">
								<form role="form">
									<div class="input-group">
										<input type="text" class="form-control" id="exampleInputEmail1" placeholder="学生姓名"/><span type="submit" class="btn btn-default input-group-addon glyphicon glyphicon-search"></span>
									</div>
								</form>
							</div>
							<div class="col-md-3 column">
								<div class="btn-group">
									<button class="btn btn-default" type="button"><em class="glyphicon glyphicon glyphicon-resize-vertical"></em>学号</button>
									<button class="btn btn-default" type="button"><em class="glyphicon glyphicon glyphicon-resize-vertical"></em>班级</button> 
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-10 column">

					<form action="" method="post">

						<table class="table table-condensed table-striped">
							<thead>
								<tr></tr>
								<tr>
									<th>
										状态
									</th>
									<th>
										学号
									</th>
									<th>
										学生
									</th>
									<th>
										性别
									</th>
									<th>
										电话
									</th>
									<th>
										qq
									</th>
									<th>
										申领权限
									</th>
									<th>
										荣耀值
									</th>
									<th>
										是否在校
									</th>
									<th>
										班级
									</th>
									<th>
										操作
									</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										<input type="checkbox" name="ids" value="" />
									</td>
									<td>
										2016114398
									</td>
									<td>
										曹飞虎
									</td>
									<td>
										男
									</td>
									<td>
										15056099931
									</td>
									<td>
										408391897
									</td>
									<td>
										100
									</td>
									<td>
										100
									</td>
									<td>
										是
									</td>
									<td>
										计算机与信息工程学院软件工程1班
									</td>
									<td>
										<a href="javascript:void(-1);" class="xq-btn" data-toggle="modal" data-target="#myModal">详情</a>
										<a href="#" data-toggle="modal" data-target="#myModal" class="xg-btn">修改</a>
									</td>
								</tr>

							</tbody>
						</table>
					</form>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="col-lg-2">
						<ul class="pagination pagination-sm">
							<li>
								<a class="btn btn-primary" onclick="checkId()">全选</a>
							</li>
							<li>
								<a class="btn btn-warning" onclick="return delteCheck()">删除</a>
							</li>
						</ul>
					</div>

					<div class="col-lg-8">
						<ul class="pagination pagination-sm fenye-ul">
							<li>
								<a href="#">Prev</a>
							</li>
							<li class="active">
								<a href="#">1</a>
							</li>
							<li>
								<a href="#">2</a>
							</li>
							<li>
								<a href="#">3</a>
							</li>
							<li>
								<a href="#">4</a>
							</li>
							<li>
								<a href="#">5</a>
							</li>
							<li>
								<a href="#">Next</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			
			<div class="row">
						<!-- 公告模态框（Modal） -->
						<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">公告详情</h4>

									</div>
									<div class="modal-body">
										<!--修改显示公告信息表单-->
										学号，姓名，性别，电话，qq，荣耀值，学院专业班级，申领权限，是否毕业，辅导员，辅导员电话
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
														<input type="text" value="" name="" id="nurl" />
													</td>
												</tr>
												<tr>
													<td><b>公告时间:</b>
														<input type="date" value="" name="" id="ntime" />
													</td>
												</tr>
												<tr>
													<td><b>状态:</b>
														<input type="text" value="" name="" id="nstatus" />
														<input type="hidden" value="" name="" id="nid" />
													</td>
												</tr>
											</table>
										</form>
										<!-- /修改显示公告信息表单-->
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
										<!--修改会自动影藏此按钮-->
										<button type="button" class="btn btn-primary" id="xq-form-sumbit" onclick="return confirm('确定修改？')">提交更改</button>
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