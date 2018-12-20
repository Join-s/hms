<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="referrer" content="never">
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
	src="${pageContext.request.contextPath }/resource/js/mangage/components.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<h3>元件列表</h3>
			</div>
		</div>
		<div class="row clearfix">
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
							<form id="sousuo-form" role="form" action="${pageContext.request.contextPath }/rest/comp/queryAll" method="post">
								<div class="input-group">
									<input type="text" class="form-control" name="name"
										id="exampleInputEmail1" value="${(tComponent==null && tComponent.name==null)?'':tComponent.name }"/><span type="submit" id="sousuo-btn"
										class="btn btn-default input-group-addon glyphicon glyphicon-search"></span>
								</div>
							</form>
						</div>
						<div class="col-md-3 column">
							<div class="btn-group">
								<button class="btn btn-default" type="button" >
									<a href="${pageContext.request.contextPath }/rest/comp/queryAll?zonghe=1" class="glyphicon glyphicon glyphicon-resize-vertical">名称</a>
								</button>
								<button class="btn btn-default" type="button">
									<a href="${pageContext.request.contextPath }/rest/comp/queryAll?kucun=1" class="glyphicon glyphicon glyphicon-resize-vertical">库存</a>
								</button>
								<button class="btn btn-default" type="button">
									<a href="${pageContext.request.contextPath }/rest/comp/queryAll?lei=1" class="glyphicon glyphicon glyphicon-resize-vertical">分类</a>
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<br/> 
			<div class="col-md-12 column">
				<form action="${pageContext.request.contextPath }/rest/comp/delete" method="get" id="form1"> 
					<table class="table table-condensed table-striped">
						<thead>
							<tr></tr>
							<tr>
								<th>状态</th>
								<th>元件名称</th>
								<th>规格</th>
								<th>品牌</th>
								<th>单价</th>
								<th>库存</th>
								<th>位置</th>
								<th>是否入库</th>
								<th>申领等级</th>
								<th>分类</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${largepageInfo.list }" var="clist">
								<tr>
									<td><input type="checkbox" name="ids" value="${clist.id}" /></td>
									<td>${clist.name}</td>
									<td>${clist.specification}</td>
									<td>${clist.brand}</td>
									<td>${clist.price}</td>
									<td>${clist.store}</td>
									<td>${clist.place}</td>
									<td>${clist.isstore}</td>
									<td>${clist.level}</td>
									<td>${clist.tSubclass.name}/${clist.tSubclass.tLargeclass.name}</td>
									<td><a href="javascript:void(-1);" class="xq-btn"
										data-toggle="modal" data-target="#myModal" cid="${clist.id}">详情</a> <a
										href="javascript:void(-1);" class="xg-btn" data-toggle="modal"
										data-target="#myModal">修改</a></td>
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
							href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${largepageInfo.prePage}">Prev</a></li>

						<c:if test="${largepageInfo.pages>5 }">
							<c:if test="${largepageInfo.pageNum>3 }">
								<li><a
									href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=1">1</a></li>
								<li><a
									href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=2">2</a></li>
								<c:forEach begin="${largepageInfo.pageNum }" var="info"
									end="${(largepageInfo.pageNum+3)>largepageInfo.pages?largepageInfo.pages:largepageInfo.pageNum+3 }" step="1">
									<c:if test="${largepageInfo.pageNum==info }" var="flag2">
										<li class="active"><a
											href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${info}">${info }</a></li>
									</c:if>
									<c:if test="${!flag2 }">
										<li><a
											href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${info}">${info }</a></li>
									</c:if>
								</c:forEach>

							</c:if>
							<c:if test="${largepageInfo.pageNum<=3 }">
								<c:forEach begin="1" var="info" end="3" step="1">
									<c:if test="${largepageInfo.pageNum==info }" var="flag">
										<li class="active"><a
											href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${info}">${info }</a></li>
									</c:if>
									<c:if test="${!flag }">
										<li><a
											href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${info}">${info }</a></li>
									</c:if>
								</c:forEach>
								<c:if test="${largepageInfo.pageNum==largepageInfo.pages }" var="flag4">
									<li class="active"><a
										href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${largepageInfo.pages}">${largepageInfo.pages }</a></li>
								</c:if>
								<c:if test="${!flag4 }">
									<li><a
										href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${largepageInfo.pages}">${largepageInfo.pages }</a></li>
								</c:if>

							</c:if>
						</c:if>

						<c:if test="${largepageInfo.pages<=5 }">
							<c:forEach begin="1" var="info" end="${largepageInfo.pages }" step="1">
								<c:if test="${largepageInfo.pageNum==info }" var="flag5">
									<li class="active"><a
										href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${info}">${info }</a></li>
								</c:if>
								<c:if test="${!flag5 }">
									<li><a
										href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${info}">${info }</a></li>
								</c:if>
							</c:forEach>
						</c:if>
						<li><a
							href="${pageContext.request.contextPath }/rest/comp/queryAll?pageNum=${largepageInfo.nextPage}">Next</a></li>
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
							<form action="" method="post" id="xq-form"
								onsubmit="return checkinfo()">
								<table class='table table-bordered'>
										<tr><td width='145px'>元件名称</td><td colspan='3'></td></tr>
										<tr><td>值</td><td  width='145px'></td><td colspan='2' rowspan='4'>
												<img class='img'  width='290px' height='140px' alt='img.jpg' src='${pageContext.request.contextPath }/resource/img/bg.jpg'/>
											</td></tr>
								 		<tr><td>位置</td><td></td></tr>
										<tr><td>库存</td><td></td></tr>
										<tr><td>是否入库</td><td></td></tr>
										<tr><td>原厂型号</td><td></td><td  width='145px'>型号规格</td><td  width='145px'></td></tr>
										<tr><td>单价</td><td></td><td>申领等级</td><td></td></tr>
										<tr><td>元件大类</td><td></td><td>元件小类</td><td></td></tr>
										<tr><td>品牌</td><td></td><td>备注 一</td><td></td></tr>
										<tr><td>商城链接</td><td colspan='3'></td></tr>
										<tr><td>元建封装链接</td><td colspan='3'></td></tr>
										<tr><td>下载链接</td><td colspan='3'> </td></tr>
										<tr><td>备注2</td><td colspan='3'></td></tr>
										<tr><td>备注3</td><td colspan='3'></td></tr>
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