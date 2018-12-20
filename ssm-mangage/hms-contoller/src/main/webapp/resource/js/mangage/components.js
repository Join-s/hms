$(function(){
	
	$("#sousuo-btn").click(function(){
		$("#sousuo-form").submit();
	});
	
	// 模态框弹出初始化
	function modelInitBtns() {

		// 模态框表单提交
		$("#xq-form-sumbit").click(function() {
			$("#xq-form").submit();
			$("#myModal").modal('hide');
		});

		// 模态框详情点击按钮
		$(".xq-btn").click(function() {
			$("#xq-form-sumbit").hide();
			var ids = $(this).parent().parent().find("input").val();
// alert(ids);
$(".modal-title").text("元件详情");
$(".modal-body").children().remove();
			$.ajax({
				type: "post",
				url: "/rest/comp/findById",
				data: ids,
				contentType: "application/json",
				success: function(obj) {
//					alert(1);
					
	var t1=	$("	<table class='table table-bordered'></table>");
	var t11=	$("	<tr><td width='145px'>元件名称</td><td colspan='3'>"+obj.name+obj.tSubclass.name+"</td></tr>");
	var t12=	$("	<tr><td>值</td><td  width='145px'>"+obj.val+"</td><td colspan='2' rowspan='4'><img class='img'  width='290px' height='140px' alt='img.jpg' src='"+obj.img+"'/></td></tr>");
	var t13=	$("	<tr><td>位置</td><td>"+obj.place+"</td></tr>");
	var t14=	$("	<tr><td>库存</td><td>"+obj.store+"</td></tr>");                                                         
	var t15=	$("	<tr><td>是否入库</td><td>"+obj.isstore+"</td></tr>");
	var t16=	$("	<tr><td>原厂型号</td><td>"+obj.version+"</td><td  width='145px'>型号规格</td><td  width='145px'>"+obj.specification+"</td></tr>");
	var t17=	$("	<tr><td>单价</td><td>"+obj.price+"</td><td>申领等级</td><td>"+obj.level+"</td></tr>");
	var t18=	$("	<tr><td>元件大类</td><td>"+obj.tSubclass.tLargeclass.name+"</td><td>元件小类</td><td>"+obj.tSubclass.name+"</td></tr>");
	var t19=	$("	<tr><td>品牌</td><td>"+obj.brand+"</td><td>备注 一</td><td>"+obj.remark1+"</td></tr>");
	var t111=	$("	<tr><td>商城链接</td><td colspan='3'>"+obj.malllink+"</td></tr>");
	var t112=	$("	<tr><td>元建封装链接</td><td colspan='3'>"+obj.sealing+"</td></tr>");
	var t113=	$("	<tr><td>下载链接</td><td colspan='3'> "+obj.updownlink+"</td></tr>");
	var t114=	$("	<tr><td>备注2</td><td colspan='3'>"+obj.remark2+"</td></tr>");
	var t115=	$("	<tr><td>备注3</td><td colspan='3'>"+obj.remark3+"</td></tr>");
	var t116=	$("	<tr><td>介绍</td><td colspan='3'>"+obj.introduce+"</td></tr>");
			
			t1.append(t1);
			t1.append(t11);
			t1.append(t12);
			t1.append(t13);
			t1.append(t14);
			t1.append(t15);
			t1.append(t16);
			t1.append(t17);
			t1.append(t18);
			t1.append(t19);
			t1.append(t111);
			t1.append(t112);
			t1.append(t113);
			t1.append(t116);
			t1.append(t114);
			t1.append(t115);
			
			$(".modal-body").append(t1);
				},
				error: function(data) {
					alert("error");
				}
			});

		});

		// 模态框修改按钮
		$(".xg-btn").click(function() {
			$("#xq-form-sumbit").show();
			var ids = $(this).parent().parent().find("input").val();
			// alert(ids);
			$(".modal-title").text("修改元件");
			$(".modal-body").children().remove();
						$.ajax({
							type: "post",
							url: "/rest/comp/findById",
							data: ids,
							contentType: "application/json",
							success: function(obj) {
								
								var t1=	$("	<table class='table table-bordered'></table>");
								var t11=	$("	<tr><td width='145px'>元件名称</td><td colspan='3'>"+obj.name+obj.tSubclass.name+"</td></tr>");
								var t12=	$("	<tr><td>值</td><td  width='145px'>"+obj.val+"</td><td colspan='2' rowspan='4'><img class='img'  width='290px' height='140px' alt='img.jpg' src='"+obj.img+"'/></td></tr>");
								var t13=	$("	<tr><td>位置</td><td>"+obj.place+"</td></tr>");
								var t14=	$("	<tr><td>库存</td><td>"+obj.store+"</td></tr>");                                                         
								var t15=	$("	<tr><td>是否入库</td><td>"+obj.isstore+"</td></tr>");
								var t16=	$("	<tr><td>原厂型号</td><td>"+obj.version+"</td><td  width='145px'>型号规格</td><td  width='145px'>"+obj.specification+"</td></tr>");
								var t17=	$("	<tr><td>单价</td><td>"+obj.price+"</td><td>申领等级</td><td>"+obj.level+"</td></tr>");
								var t18=	$("	<tr><td>元件大类</td><td>"+obj.tSubclass.tLargeclass.name+"</td><td>元件小类</td><td>"+obj.tSubclass.name+"</td></tr>");
								var t19=	$("	<tr><td>品牌</td><td>"+obj.brand+"</td><td>备注 一</td><td>"+obj.remark1+"</td></tr>");
								var t111=	$("	<tr><td>商城链接</td><td colspan='3'>"+obj.malllink+"</td></tr>");
								var t112=	$("	<tr><td>元建封装链接</td><td colspan='3'>"+obj.sealing+"</td></tr>");
								var t113=	$("	<tr><td>下载链接</td><td colspan='3'> "+obj.updownlink+"</td></tr>");
								var t114=	$("	<tr><td>备注2</td><td colspan='3'>"+obj.remark2+"</td></tr>");
								var t115=	$("	<tr><td>备注3</td><td colspan='3'>"+obj.remark3+"</td></tr>");
								var t116=	$("	<tr><td>介绍</td><td colspan='3'>"+obj.introduce+"</td></tr>");
						
								t1.append(t1);
								t1.append(t11);
								t1.append(t12);
								t1.append(t13);
								t1.append(t14);
								t1.append(t15);
								t1.append(t16);
								t1.append(t17);
								t1.append(t18);
								t1.append(t19);
								t1.append(t111);
								t1.append(t112);
								t1.append(t113);
								t1.append(t116);
								t1.append(t114);
								t1.append(t115);
								
								$(".modal-body").append(t1);
							},
							error: function(data) {
								alert("error");
							}
						});
		});
	}// //模态框弹出初始化
	modelInitBtns();
});

// 删除按钮
function delteCheck() {
	var flag = getCheckId();
	var from1 = $("#form1");
	if(flag) {
// from1.action ="${pageContext.request.contextPath }/rest/notice/delete";
// from1.attr("action","${pageContext.request.contextPath }/rest/notice/delete")
		from1.submit();
		
		alert("删除成功");
		window.lcoal.href='/rest/comp/queryAll';
	} else {
		alert("请至少选择一行");
		return false;
	}
	
}
// 模态框表检查信息
function checkinfo() {
// alert('模态框表检查信息');
	return true;
}

function checkId() {
	// 获取name 为ids的集合
	var ids = document.getElementsByName("ids");
	// 循环遍历
	for(var i in ids) {
		// 获取循环出来的每一个input标签
		var id = ids[i];
		if(id.checked) { // 如果被选择 true
			id.checked = false;
		} else {
			id.checked = true;
		}
	}
}

function getCheckId() {
	var flag = false;
	// 获取name 为ids的集合
	var ids = document.getElementsByName("ids");
	// 循环遍历
	for(var i in ids) {
		// 获取循环出来的每一个input标签
		var id = ids[i];
		if(id.checked) { // 如果被选择 true
			flag = true;
			return flag;
		}
	}
	return flag;
}