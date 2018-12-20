<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title></title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="referrer" content="never">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resource/css/componentList.css" />
<!--bootstrap框架文件-->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/css/bootstrap.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/componentList.js"></script>
<!--iframe  高度自适应脚本-->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resource/js/autoifrheight.js" /></script>
	<script type="text/javascript">
	function addor(id){
		$.ajax({
			type : "post",
			url : "/rest/od/add?id="+id,
			success : function(data) {
				alert("添加成功！");
			},
			error : function(data) {
				alert('添加失败~');
			}
		});
	}
	
	</script>
</head>

<body>
	<div class="container-fluid">
		<div class="row">
			<!--元器件大类导航栏 start-->
			<div class="col-lg-2 col-lg-offset-2">
				<div class="dropdown">
					<div data-toggle="dropdown" id="btn" class="">
						&nbsp; &nbsp;<span class="glyphicon glyphicon-th"
							aria-hidden="true"></span>
						&nbsp;全&nbsp;部&nbsp;元&nbsp;器&nbsp;件&nbsp;分&nbsp;类&nbsp;
					</div>
					<!--<button data-toggle="dropdown" id="btn" class="btn btn-info"> &nbsp;全&nbsp;部&nbsp;元&nbsp;器&nbsp;件&nbsp;分&nbsp;类&nbsp;<span class="caret"></span> </button>-->
					<ul id="myUL" class="dropdown-menu list-group">
						<c:forEach items="${llist }" var="li">
							<li class="list-group-item"><a href="#">${li.name }</a></li>
						</c:forEach>
					</ul>
				</div>
				<div class="panel-group" id="parentPanel">
					<div class="panel panel-primary ">
						<c:forEach items="${llist }" var="li">
							<div class="panel panel-primary  ">
								<div class="panel-heading">
								
									<h3 class="panel-title" data-toggle="collapse"
										data-target="#p${li.id }">
										${li.name }<span>(-${fn:length(li.tSubclassList)})</span>
									<!-- 	<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> -->
									</h3>
								</div>
								<div class="collapse panel-collapse" id="p${li.id }"
									data-parent="#parentPanel">
									<ul class="list-group  ">
										<c:forEach items="${li.tSubclassList }" var="sm">
											<li class="list-group-item"><a
												href="${pageContext.request.contextPath }/rest/comp/queryBySid?sid=${sm.id }">${sm.name } <span>[${fn:length(sm.clist) }]</span></a>
											</li>
										</c:forEach>
									</ul>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
			<!--元器件大类导航栏 end-->

			<!--元器件搜索显示区 start-->
			<div class="col-lg-6">
				<!--元器件搜索头部 start-->
				<div class="row alert alert-info">
					<div class="row ">
						<div class="col-lg-12 col-xs-12 sort-ul">
							<div class="col-lg-9  col-xs-12  ">
								<ul id="sortul" class="list-group">
									<li class="list-group-item"><a href="${pageContext.request.contextPath }/rest/comp/queryBySid?zonghe=1">综合<span
											class="glyphicon glyphicon-sort" aria-hidden="true"></span>
									</a></li>
									<li class="list-group-item"><a href="${pageContext.request.contextPath }/rest/comp/queryBySid?kucun=1">库存<span
											class="glyphicon glyphicon-sort" aria-hidden="true"></span></a></li>
									<li class="list-group-item"><a href="${pageContext.request.contextPath }/rest/comp/queryBySid?price=1">价格<span
											class="glyphicon glyphicon-sort" aria-hidden="true"></span></a></li>
								</ul>
								<div class="clear"></div>
							</div>
							<div class="col-lg-3  col-xs-12">
								<span id="pageSpan">${compPageInfo.pageNum }/${compPageInfo.pages }</span>
								<a href="${pageContext.request.contextPath }/rest/comp/queryBySid?pageNum=${compPageInfo.prePage }" class="btn btn-warning"><span
									class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span></a>
								<a href="${pageContext.request.contextPath }/rest/comp/queryBySid?pageNum=${compPageInfo.nextPage }" class="btn btn-warning"><span
									class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-12 ">
							<form id="myformsousuo" action="${pageContext.request.contextPath }/rest/comp/queryBySid" method="post"
								onsubmit="return check()" role="form" class="form-horizontal">
								<div class="form-group">
									<div class="col-lg-2">
										<span id="mcssSpan"> 名称搜索： </span>
									</div>
									<div class="col-lg-6">
										<input type="text"  name="name" class="form-control col-lg-2" />
									</div>
									<div class="col-lg-1">
										<a onclick="mysubmit()" value="在结果中搜索" class="btn btn-default">
											<span class="glyphicon glyphicon-search" aria-hidden="true"></span>在结果中搜索
										</a>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
				<!--元器件搜索头部 end-->
				<!--元器件显示 start-->
				<div class="row">

					<c:forEach items="${compPageInfo.list }" var="cli">
						<div class="col-lg-12 alert alert-info">
							<div class="col-lg-2">
								<div class="col-lg-12">
									<img class="img img-circle imginfo" src="${cli.img }"
										width="100px" height="100px" alt="#" />
								</div>
								<!-- src="${pageContext.request.contextPath }/resource/img/bg.jpg" -->
								<div class="col-lg-11 col-lg-offset-1">库存：${cli.store }</div>
							</div>
							<div class="col-lg-10">
								<div class="col-lg-12 alert elenamediv">
									<a href="#">${cli.name }</a>
								</div>
								<div class="col-lg-4">商品编号：${cli.id }</div>
								<div class="col-lg-4">封装规格：${cli.specification }</div>
								<div class="col-lg-4">单价：￥${cli.price }</div>
								<div class="col-lg-4 ">品牌：${cli.brand }</div>
								<div class="col-lg-8 ">原厂型号：${cli.val }</div>
								<div class="row">

									<!--数据手册不为空时显示-->
									<!--数据手册start-->
									<div class="col-lg-4 col-lg-offset-8">
										<a href="#">查看数据手册</a>
									</div>
									<!--数据手册end-->
									<div class="col-lg-4 col-lg-offset-8">
										<a href="#">购买</a>&nbsp;&nbsp;|&nbsp;&nbsp; 
										<%-- <a  href="${pageContext.request.contextPath }/rest/od/add?id=${cli.id }">添加</a> --%>
										<a  onclick='addor(${cli.id })'>添加</a>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
				<!--元器件显示 end-->
			</div>
			<!--元器件搜索显示区 end-->
		</div>

	</div>
</body>

</html>