$(function() {
	$("#sum-span").click(function(){
		$("#serachname").submit();
	});
	function fenyeInit() { //分页效果初始化
		//分页效果开始
		var ul_li_len = $(".fenye-ul li").length;
		if(ul_li_len > 7) {
			for(i = 4; i < ul_li_len - 3; i++) {
				$(".fenye-ul li").eq(i).hide();
			}
		}
		$(".fenye-ul li a").click(function() {
			$(".fenye-ul li").show(); //所有节点显示便于计数
			var lass = $(".fenye-ul li[class='active']").index(); //点击之前的页数
			var now = $(this).parent().index(); //当前点击的页数
			var nowt = $(this).text();
			var len = $(".fenye-ul li").length; //所有li的个数
			//重置
			$(".fenye-ul li").attr("class", "");
			if(now == 0) { //点击的是上一页
				if(lass > 1) {
					$(".fenye-ul li").eq(lass - 1).attr("class", "active");
				} else {
					$(".fenye-ul li").eq(1).attr("class", "active");
				}
			} else if(now == len - 1) { //点击的是下一页
				//			alert(lass);
				if(lass < len - 2) {
					$(".fenye-ul li").eq(lass + 1).attr("class", "active");
				} else {
					$(".fenye-ul li").eq(len - 2).attr("class", "active");
				}
			} else { //点击的是中间的页数
				$(".fenye-ul li").eq(now).attr("class", "active");
			};
			var nowactive = $(".fenye-ul li[class='active']").index(); //激活的页面序号
			//防止页数过多
			if(isNaN(nowt)) { //bu是数字？
				if(now == 0) { //点击的是上一页
					if(len - 2 > 5 && nowactive < len - 3 && nowactive > 3) { //大于5页 并且不是后两页 和前两页
						for(i = 3; i < nowactive; i++) {
							$(".fenye-ul li").eq(i).hide();
						}
						for(i = nowactive + 1; i < len - 3; i++) {
							$(".fenye-ul li").eq(i).hide();
						}
					} else if(len - 2 > 5 && nowactive >= len - 3 && nowactive < len) { //大于5页 是后两页
						for(i = 3; i < len - 4; i++) {
							$(".fenye-ul li").eq(i).hide();
						}
					} else if(len - 2 > 5 && nowactive >= 1 && nowactive <= 3) { //大于5页 是前两页
						for(i = 4; i < len - 3; i++) {
							$(".fenye-ul li").eq(i).hide();
						}
					}
				} else { //点击的是下一页
					if(len - 2 > 5 && nowactive < len - 3 && nowactive > 3) { //大于5页 并且不是后两页 和前两页
						for(i = 3; i < nowactive; i++) {
							$(".fenye-ul li").eq(i).hide();
						}
						for(i = nowactive + 1; i < len - 3; i++) {
							$(".fenye-ul li").eq(i).hide();
						}
					} else if(len - 2 > 5 && nowactive >= len - 3 && nowactive < len) { //大于5页 是后两页
						for(i = 3; i < len - 4; i++) {
							$(".fenye-ul li").eq(i).hide();
						}
					} else if(len - 2 > 5 && nowactive >= 1 && nowactive <= 3) { //大于5页 是前两页
						for(i = 4; i < len - 3; i++) {
							$(".fenye-ul li").eq(i).hide();
						}
					}
				}
			} else { //			alert('是数字');
				if(len - 2 > 5 && nowactive < len - 3 && nowactive > 3) { //大于5页 并且不是后两页 和前两页
					for(i = 3; i < nowactive; i++) {
						$(".fenye-ul li").eq(i).hide();
					}
					for(i = nowactive + 1; i < len - 3; i++) {
						$(".fenye-ul li").eq(i).hide();
					}
				} else if(len - 2 > 5 && nowactive >= len - 3 && nowactive < len) { //大于5页 是后两页
					for(i = 3; i < len - 4; i++) {
						$(".fenye-ul li").eq(i).hide();
					}
				} else if(len - 2 > 5 && nowactive >= 1 && nowactive <= 3) { //大于5页 是前两页
					for(i = 4; i < len - 3; i++) {
						$(".fenye-ul li").eq(i).hide();
					}
				}
			}
		}); ////分页效果结束
	}
	fenyeInit();
	//模态框弹出初始化
	function modelInitBtns() {

		//模态框表单提交
		$("#xq-form-sumbit").click(function() {
			$("#xq-form").submit();
			$("#myModal").modal('hide');
		});

		//模态框详情点击按钮
		$(".xq-btn").click(function() {
			$("#xq-form-sumbit").hide();
			var ids = $(this).parent().parent().find("input[type='checkbox']").val();
			//		alert(ids);

			$.ajax({
				type: "get",
				url: "#",
				async: true,
				data: ids,
				success: function(data) {
					//				alert('s' + data);
 

				},
				error: function(data) {
					//				alert('e');
 
				}
			});

		});

		//模态框修改按钮
			$(".xg-btn").click(function(){ 
						$("#xq-form-sumbit").show();
						$(".modal-title").text();//模态框标题
						$(".xq-form").children().remove();
						var id=$(".xg-btn").attr("uid");
						alert(id);
						$.ajax({
							type:"post",
							url:"/rest/stu/find",
							date:id,
							contentType: "application/json",
							success:function(data){
								alert(data);
								},
							error:function(data){
								alert("没有查询到信息");
								}
						});
			});
	}////模态框弹出初始化
	modelInitBtns();

});
//删除按钮
function delteCheck() {
	var flag = getCheckId();
	
	//var from1 = document.getElementById("from1");
	if(flag) {
		$("#from1").attr("action","/rest/stu/delteStu");
		$("#from1").submit();
		alert("删除成功");
		
	} else {
		alert("请至少选择一行");
		return false;
	}
	//from1.submit();
	return true;
}
//模态框表检查信息
function checkinfo() {
	alert('模态框表检查信息');
	return false;
}

function checkId() {
	//获取name 为ids的集合
	var ids = document.getElementsByName("ids");
	//循环遍历
	for(var i in ids) {
		//获取循环出来的每一个input标签 
		var id = ids[i];
		if(id.checked) { //如果被选择  true
			id.checked = false;
		} else {
			id.checked = true;
		}
	}
}

function getCheckId() {
	var flag = false;
	//获取name 为ids的集合
	var ids = document.getElementsByName("ids");
	//循环遍历
	for(var i in ids) {
		//获取循环出来的每一个input标签 
		var id = ids[i];
		if(id.checked) { //如果被选择  true
			flag = true;
			return flag;
		}
	}
	return flag;
}