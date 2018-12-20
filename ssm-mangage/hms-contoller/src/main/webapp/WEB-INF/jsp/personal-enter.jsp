<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<!--个人中心-->
<!--显示个人信息-->
<!--订单详情-->
<html>
<head>
<meta charset="UTF-8">
<title></title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resource/css/personal-enter.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/personal-enter.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<!--个人信息显示和订单信息显示 starat-->
				<div class="row shows">
					<div class=" ">
						<ul class="list-group ">
							<li class="list-group-item showperson_li"><a href="#"
								onclick="showpersonalinfo(this)">个人信息显示</a></li>
							<li class="list-group-item active showorders_li"><a href="#"
								onclick="showordersinfo(this)">订单信息显示</a></li>
						</ul>
					</div>
				</div>
				<!--个人信息显示和订单信息显示 end-->
				<!--个人信息显示 start-->
				<div class="row showpersonalinfo">
					<!--个人信息显示-->
					<div class="row">
						<div class="col-lg-12">
							<a class="btn btn-default" href="#" target="myifr">查看个人信息</a>
							<a class="btn btn-default" href="#" target="myifr">修改个人信息</a>
							<a class="btn btn-default" href="#" target="myifr">修改密码</a>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-6 col-lg-offset-3">
							<iframe id="myifr" name="myifr" src="#"
								width="100%" height="650px" frameborder="no" border="0"
								marginwidth="0" marginheight="0" scrolling="no"
								allowtransparency="yes"></iframe>
						</div>
					</div>
				</div>
				<!--个人信息显示 end-->
				<c:if test="${user!=null}">
				
				<!--订单信息显示 start-->
				<div class="row showordersinfo alert alert-success">
					<div class="col-lg-12">
						<table class="table table-bordered">
							<thead>
								<th>订单编号</th>
								<th>订单日期</th>
								<th>订单状态</th>
								<th>操作</th>
								<th>查看</th>
								<!--按照日期降序排列-->
							</thead>
							<tbody>
								<c:forEach items="${orderList }" var="oli">

									<!--订单信息 start-->
									<!-- 0:未审核 1：未审核 2：已审核 3：打回 -->
									<tr
										class="${oli.status=='3'?'alert-danger':oli.status=='1'?'alert-warning':oli.status=='2'?'alert-success':'alert-warning' }">
										<td>${oli.id }</td>
										<td><fmt:formatDate value="${oli.createtime }"
												pattern="yyyy-MM-dd hh:mm:ss" /></td>
										<td>${oli.status=='3'?'打回':oli.status=='1'?'未审核':oli.status=='2'?'已审核':'未审核' }</td>
										<!--<td class="alert alert-danger"><a href="ErrorOrders?id=2">审核未通过</a></td>-->
										<!--<td class="alert alert-success">已审核通过</td>-->
										<td><a href="${pageContext.request.contextPath }/rest/order/delete?id=${oli.id }" onclick="return deleteorders(${oli.id });">删除</a>
											| <a href="#" onclick="confirm('暂无此功能');">打印</a></td>
										<td>
											<!-- 按钮：用于打开模态框 --> <!--ajax动态获取订单信息加载--> 
											<a data-toggle="modal" data-target="#order1240504" class="xiangqing" id="${oli.id }">详情 </a>
										</td>
									</tr>
									<c:if test="${oli.remark!=null}">
									<c:if test="${oli.status=='3'}">
										<tr class="alert-danger">
											<td colspan="5">原因：${oli.remark}</td>
										</tr>
									</c:if></c:if>
									<!--订单信息 end-->
								</c:forEach>
							</tbody>
						</table>
					</div>
					<!-- 模态框 start -->
					</c:if>
					<!--ajax动态加载-->
					<div class="modal fade" id="order1240504">
						<div class="modal-dialog modal-lg ">
							<div class="modal-content">
								<!-- 模态框头部 -->
								<div class="modal-header">
									<h4 class="modal-title">订单详情</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>
								<!-- 模态框主体 -->
								<div class="modal-body">
									<!--购物车元件显示 start-->
									<div class="row ordetails">
										<div class="col-lg-12 col-lg-offset-0 alert alert-info">
											<div class="col-lg-2  col-sm-12  col-xs-12 btn-tog">
												<img src="${pageContext.request.contextPath }/resource/img/register-success.jpg" class="img img-circle"
													width="100px" height="100px" />
											</div>
											<div class="col-lg-9 eleinfodet">
												<div class="col-lg-12 elename">贴片合金电阻/0.02Ω ±1% 4W 编带
												</div>
												<div class="col-lg-12 elenum">
													12 个
													<!--<span>库存不足</span>-->
												</div>
												<div class="col-lg-6 btn-tog">规格：2728</div>
												<div class="col-lg-6 btn-tog">品牌：RALEC(旺诠)</div>
												<div class="col-lg-6 btn-tog">型号：LR2728-24R020F1</div>
												<div class="col-lg-6 btn-tog">单价：266￥</div>
												<div class="col-lg-6 btn-tog">位置：A12</div>
												<div class="col-lg-6 btn-tog">
													库存：<span>250</span>个
												</div>
												<div class="col-lg-2 col-lg-offset-10 elebtn">
													<a href="#" class="btn-tog-all" onclick="btntog(this)">收起</a>
												</div>
											</div>
										</div>
									</div>
									<!--购物车元件显示 end-->
									<!--购物车元件显示 start-->
									<div class="row ordetails">
										<div class="col-lg-12 col-lg-offset-0 alert alert-info">
											<div class="col-lg-2  col-sm-12  col-xs-12 btn-tog">
												<img src="${pageContext.request.contextPath }/resource/img/register-success.jpg" class="img img-circle"
													width="100px" height="100px" />
											</div>
											<div class="col-lg-9 eleinfodet">
												<div class="col-lg-12 elename">贴片合金电阻/0.02Ω ±1% 4W 编带
												</div>
												<div class="col-lg-12 elenum">
													12 个
													<!--<span>库存不足</span>-->
												</div>
												<div class="col-lg-6 btn-tog">规格：2728</div>
												<div class="col-lg-6 btn-tog">品牌：RALEC(旺诠)</div>
												<div class="col-lg-6 btn-tog">型号：LR2728-24R020F1</div>
												<div class="col-lg-6 btn-tog">单价：266￥</div>
												<div class="col-lg-6 btn-tog">位置：A12</div>
												<div class="col-lg-6 btn-tog">
													库存：<span>250</span>个
												</div>
												<div class="col-lg-2 col-lg-offset-10 elebtn">
													<a href="#" class="btn-tog-all" onclick="btntog(this)">收起</a>
												</div>
											</div>
										</div>
									</div>
									<!--购物车元件显示 end-->
								</div>
								<!-- 模态框底部 -->
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary"
										data-dismiss="modal">关闭</button>
								</div>
							</div>
						</div>
					</div>
					<!-- 模态框 end -->
				</div>
				<!--订单信息显示 end-->
			</div>
		</div>

	</div>
</body>

</html>