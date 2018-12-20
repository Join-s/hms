<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student info</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<!--bootstrap框架文件-->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/mangage/student.js"></script>
<script type="text/javascript">
	///rest/stu/find?id=1
</script>
</head>

<body>
	<div class="container-fluid">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<h3>学生列表</h3>
			</div>
		</div>
		<div class="row clearfix">

			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="alert alert-success alert-dismissable">
						<button type="button" class="close" data-dismiss="alert"
							aria-hidden="true">×</button>
						<h4>注意!</h4>
						<strong>Warning!</strong> Best check yo self, you're not looking
						too good. <a href="#" class="alert-link">alert link</a>
					</div>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="row clearfix">
						<div class="col-md-2 column">
							<div class="btn-group">
								<button class="btn btn-default" type="button">
									<em class="glyphicon glyphicon glyphicon-download"></em> 导出所选
								</button>
								<button class="btn btn-default" type="button">
									<em class="glyphicon glyphicon glyphicon-download"></em>导出所有
								</button>
							</div>
						</div>
						<div class="col-md-6 column">
							<form role="form"
								action="${pageContext.request.contextPath }/rest/stu/queryList"
								method="post" id="serachname">
								<div class="input-group">
									<input type="text" class="form-control" name="name"
										id="exampleInputEmail1" placeholder="学生姓名" /><span
										type="submit" id="sum-span"
										class="btn btn-default input-group-addon glyphicon glyphicon-search"></span>
								</div>
							</form>
						</div>
						<div class="col-md-3 column">
							<div class="btn-group">
								<button class="btn btn-default" type="button">
									<em class="glyphicon glyphicon glyphicon-resize-vertical"></em><a
										href="${pageContext.request.contextPath }/rest/stu/queryList?num=1">学号</a>
								</button>

							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-10 column">

				<form action="${pageContext.request.contextPath }/rest/stu/deleteStu"
					method="get" id="from1">
					<table class="table table-condensed table-striped">
						<thead>
							<tr></tr>
							<tr>
								<th>状态</th>
								<th>学号</th>
								<th>学生</th>
								<th>性别</th>
								<th>电话</th>
								<th>qq</th>
								<th>申领权限</th>
								<th>荣耀值</th>
								<th>是否在校</th>
								<th>班级</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${stuPageInfo.list }" var="sli">
								<tr>
									<td><input type="checkbox" name="ids" value="${sli.id}" />
									</td>
									<td>${sli.jnumber }</td>
									<td>${sli.name }</td>
									<td>${sli.sex }</td>
									<td>${sli.tel }</td>
									<td>${sli.qq }</td>
									<td>
										<c:if test="${sli.level==null }"> 100</c:if>
										<c:if test="${sli.level!=null }"> ${sli.level } </c:if>
									</td>
									<td>
										<c:if test="${sli.honourval==null }"> 暂无记录 </c:if> 
										<c:if test="${sli.honourval!=null }"> ${sli.honourval } </c:if>
									</td>
									<td>
										<c:if test="${sli.isgraduate!=0 }">离校</c:if> 
										<c:if test="${sli.isgraduate==0 }">在校</c:if>
									</td>
									<td>${sli.tGrade.tMajor.tDepartment.name }${sli.tGrade.tMajor.name }${sli.tGrade.name }
									</td>
									<td><a href="javascript:void(-1);" class="xq-btn"
										data-toggle="modal" data-target="#myModal" uid="1">详情</a> <a
										href="javascript:void(-1);" data-toggle="modal"
										data-target="#myModal" class="xg-btn" uid="1">修改</a></td>
								</tr>

							</c:forEach>

						</tbody>
					</table>
				</form>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="col-lg-2">
					<ul class="pagination pagination-sm">
						<li><a class="btn btn-primary" onclick="checkId()">全选</a></li>
						<li><a class="btn btn-warning" onclick="return delteCheck()">删除</a>
						</li>
					</ul>
				</div>

				<div class="col-lg-8">
					<ul class="pagination pagination-sm fenye-ul">
						<li><a
							href="${pageContext.request.contextPath }/rest/stu/queryList?pageNum=${stuPageInfo.prePage}">Prev</a></li>
						<c:forEach begin="${stuPageInfo.firstPage }"
							end="${stuPageInfo.lastPage }" step="1" var="pli">
							<c:if test="${pli==stuPageInfo.pageNum }">
								<li class="active"><a
									href="${pageContext.request.contextPath }/rest/stu/queryList?pageNum=${pli}">${pli}</a></li>
							</c:if>
							<c:if test="${pli!=stuPageInfo.pageNum }">
								<li><a
									href="${pageContext.request.contextPath }/rest/stu/queryList?pageNum=${pli}">${pli}</a></li>
							</c:if>
						</c:forEach>
						<li><a
							href="${pageContext.request.contextPath }/rest/stu/queryList?pageNum=${stuPageInfo.nextPage}">Next</a></li>
					</ul>
				</div>
			</div>
		</div>

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

							<form action="#" method="post" id="xq-form"
								onsubmit="return checkinfo()"  >
								<table class="table table-condensed">

								</table>
							</form>
							<!-- /修改显示公告信息表单-->
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<!--修改会自动影藏此按钮-->
							<button type="button" class="btn btn-primary" id="xq-form-sumbit"
								onclick="return confirm('确定修改？')">提交更改</button>
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