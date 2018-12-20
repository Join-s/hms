<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/autoifrheight.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/shoppingcart.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resource/css/shoppingcart.css" />
	<script type="text/javascript">
	

	$(function(){
		$(".elenum input").blur(function(){
								$(this).attr("value",$(this).val());
								/* alert($(this).attr("value")); */
								var number=$(this).attr("value")
								var id=$(this).attr("cid");
								if(!isNaN(number)){
									$.ajax({
										type:"post",
										url:"/rest/od/add?id="+id+"&number="+number,
												
												success:function(data){
													/* window.location.reload(); */
												},
												error:function(data){
													alert('修改错误！');
													window.location.reload();
												}
									});
									
								}else{
									alert('修改错误！');
									window.location.reload();
								}
								
		});
	});
	</script>
</head>
<body>
	<div class="container-fluid">
		<form action="#" method="post" onsubmit="return check()">
			<c:if test="${tComponentsList!=null }" var="tcflag">
					<c:forEach items="${tComponentsList }" var="cli">
						<!--购物车元件显示 start-->
						<div class="row ">
							<div
								class="col-lg-8 col-lg-offset-2 alert alert-info cartlist_detail">
								<div class="col-lg-2  col-sm-12  col-xs-12 btn-tog">
									<img src="${cli.img }" class="img img-circle"
										width="100px" height="100px" />
								</div>
								<div class="col-lg-9 eleinfodet">
									<div class="col-lg-12 elename">
										元件名称:${cli.name } </div>
									<div class="col-lg-12 elenum">
										申领数量: <input type="text" value="${idsMap[cli.id] }" name="number"  cid="${cli.id}"/>
										<!--<span>库存不足</span>-->
									</div>
									<div class="col-lg-6 btn-tog">封装规格：${cli.specification }</div>
									<div class="col-lg-6 btn-tog">品牌：${cli.brand }</div>
									<div class="col-lg-6 btn-tog">原厂型号：${cli.version }</div>
									<div class="col-lg-6 btn-tog">单价：${cli.price }￥</div>
									<div class="col-lg-6 btn-tog">元件位置：${cli.place }</div>
									<div class="col-lg-6 btn-tog">
										库存：<span>${cli.store }</span>个
									</div>
									<div class="col-lg-2 col-lg-offset-10 elebtn">
										<a href="${pageContext.request.contextPath }/rest/od/delete?id=${cli.id}" onclick="return confirm('确定删除?');">删 除</a> | <a
											href="#" class="btn-tog-all" onclick="btntog(this)">收起</a>
									</div>
								</div>
							</div>
						</div>
						<!--购物车元件显示 end-->
					</c:forEach>
				<!--购物车提交 start-->
				<div class="row"> 
					<div class="col-lg-12">
						<div class="col-lg-3 col-lg-offset-9">
							<a  href="${pageContext.request.contextPath }/rest/od/addCart"
								class="btn btn-primary" onclick="return confirm('确定提交?');" >提交</a>
							&nbsp;&nbsp;&nbsp; <a href="${pageContext.request.contextPath }/rest/od/deleteCart" class="btn btn-primary"
								onclick="return confirm('确定清空所有元件?');">清空购物车</a>
						</div>
					</div>
				</div>
				<!--购物车提交 end-->
			</c:if>
		</form>
		<!--购物车位空显示-->
		<c:if test="${!tcflag }">
		 <div class="col-lg-8 col-lg-offset-2">
				<div class="alert alert-warning">
					购物车空空如也，<a href="${pageContext.request.contextPath }/rest/goC">快去添加吧！</a>
				</div>
			</div> 
			</c:if>
	</div>

</body>

</html>