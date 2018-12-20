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
					alert(ids);
					$("#myModalLabel").text("sd"); //标题
					$("#xq-form table").children().remove();
					$("#xq-form").attr("action", ""); //提交地址
					$("#xq-form").attr("method", "post"); //提交方式
					//学号，姓名，性别，电话，qq，荣耀值，学院专业班级，申领权限，是否毕业，辅导员，辅导员电话

					var jnumber = '2016114398';//学号
					var name = 'hellc';//姓名
					var sex = 'nan';//性别
					var tel = '130130130';//电话
					var qq = '408391897';//qq
					var honourval = '111';//荣耀值
					var graid = '1'; //班级id
					var level = '213'; //申领权限
					var isgraduate = '31';//毕业
					var introduce = '31'; //介绍
					var photo = '141';//头像
					var intime = '51'; //入学年份
					var seat = '1542'; //座位
					var yjnum = '1241'; //实验室编号
					var remark1 = '124'; //类别

					var tr1 = $("<tr></tr>");
					var td11 = $("<td>学号</td>");
					var td12 = $("<td><input type='number' name='jnumber' value='"+jnumber+"'/></td>");
					tr1.append(td11);
					tr1.append(td12);
					var tr2 = $("<tr></tr>");
					var td21 = $("<td>姓名</td>");
					var td22 = $("<td><input type='text' name='name' value='"+name+"'/></td>");
					tr2.append(td21);
					tr2.append(td22);
					var tr3 = $("<tr></tr>");
					var td31 = $("<td>性别</td>");
					var td32 = $("<td><input  type='text' name='sex' value='"+sex+"'/></td>");
					tr3.append(td31);
					tr3.append(td32);
					var tr4 = $("<tr></tr>");
					var td41 = $("<td>电话</td>");
					var td42 = $("<td><input type='number'  name='tel' value='"+tel+"'/></td>");
					tr4.append(td41);
					tr4.append(td42);
					var tr5 = $("<tr></tr>");
					var td51 = $("<td>qq</td>");
					var td52 = $("<td><input type='number'  name='qq' value='"+qq+"'/></td>");
					tr5.append(td51);
					tr5.append(td52);
					var tr6 = $("<tr></tr>");
					var td61 = $("<td>荣耀值</td>");
					var td62 = $("<td><input  type='number'  name='honourval' value='"+honourval+"'/></td>");
					tr6.append(td61);
					tr6.append(td62);
					var tr7 = $("<tr></tr>");
					var td71 = $("<td>申领权限</td>");
					var td72 = $("<td><input type='number'  name='level' value='"+level+"'/></td>");
					tr7.append(td71);
					tr7.append(td72);
					var tr8 = $("<tr></tr>");
					var td81 = $("<td>毕业</td>");
					var td82 = $("<td><input name='isgraduate' value='"+isgraduate+"'/></td>");
					tr8.append(td81);
					tr8.append(td82);
					var tr9 = $("<tr></tr>");
					var td91 = $("<td>介绍</td>");
					var td92 = $("<td><input type='text'  name='introduce' value='"+introduce+"'/></td>");
					tr9.append(td91);
					tr9.append(td92);
					var tr10 = $("<tr></tr>");
					var td101 = $("<td>头像</td>");
					var td102 = $("<td><input type='file'  name='photo' value='"+photo+"'/></td>");
					tr10.append(td101);
					tr10.append(td102);
					var tr11 = $("<tr></tr>");
					var td111 = $("<td>入学年份</td>");
					var td112 = $("<td><input type='number'  name='intime' value='"+intime+"'/></td>");
					tr11.append(td111);
					tr11.append(td112);
					var tr12 = $("<tr></tr>");
					var td121 = $("<td>座位</td>");
					var td122 = $("<td><input type='text'  name='seat' value='"+seat+"'/></td>");
					tr12.append(td121);
					tr12.append(td122);
					var tr13 = $("<tr></tr>");
					var td131 = $("<td>实验室编号</td>");
					var td132 = $("<td><input type='text'  name='yjnum' value='"+yjnum+"'/></td>");
					tr13.append(td131);
					tr13.append(td132);
					var tr14 = $("<tr></tr>");
					var td141 = $("<td>类别</td>");
					var td142 = $("<td><input  type='text' name='remark1' value='"+remark1+"'/></td>");
					tr14.append(td141);
					tr14.append(td142);
					
					$("#xq-form table").append(tr1);
					$("#xq-form table").append(tr2);
					$("#xq-form table").append(tr3);
					$("#xq-form table").append(tr4);
					$("#xq-form table").append(tr5);
					$("#xq-form table").append(tr6);
					$("#xq-form table").append(tr7);
					$("#xq-form table").append(tr8);
					$("#xq-form table").append(tr9);
//					$("#xq-form table").append(tr10);
					$("#xq-form table").append(tr11);
					$("#xq-form table").append(tr12);
					$("#xq-form table").append(tr13);
					$("#xq-form table").append(tr14);
					
					
					$("#xq-form-sumbit").hide();

//			$.ajax({
//				type: "get",
//				url: "#",
//				async: true,
//				data: ids,
//				success: function(data) {
//					//				alert('s' + data);
// 
//
//				},
//				error: function(data) {
//					//				alert('e');
// 
//				}
//			});

		});

		//模态框修改按钮
			$(".xg-btn").click(function(){ 
						$("#xq-form-sumbit").show();
						$(".modal-title").text();//模态框标题
						$(".xq-form").children().remove();
						var id=$(".xg-btn").attr("uid");
//						alert(id);
						$("#myModalLabel").text("sd"); //标题
						$("#xq-form table").children().remove();
//						$("#xq-form").attr("enctype", "multipart/form-data"); //提交地址
						$("#xq-form").attr("action", ""); //提交地址
						$("#xq-form").attr("method", "post"); //提交方式
						//学号，姓名，性别，电话，qq，荣耀值，学院专业班级，申领权限，是否毕业，辅导员，辅导员电话

						var jnumber = '2016114398';//学号
						var name = 'hellc';//姓名
						var sex = 'nan';//性别
						var tel = '130130130';//电话
						var qq = '408391897';//qq
						var honourval = '111';//荣耀值
						var graid = '1'; //班级id
						var level = '213'; //申领权限
						var isgraduate = '31';//毕业
						var introduce = '31'; //介绍
						var photo = '141';//头像
						var intime = '51'; //入学年份
						var seat = '1542'; //座位
						var yjnum = '1241'; //实验室编号
						var remark1 = '124'; //类别

						var tr1 = $("<tr></tr>");
						var td11 = $("<td>学号</td>");
						var td12 = $("<td><input type='number' name='jnumber' value='"+jnumber+"'/></td>");
						tr1.append(td11);
						tr1.append(td12);
						var tr2 = $("<tr></tr>");
						var td21 = $("<td>姓名</td>");
						var td22 = $("<td><input type='text' name='name' value='"+name+"'/></td>");
						tr2.append(td21);
						tr2.append(td22);
						var tr3 = $("<tr></tr>");
						var td31 = $("<td>性别</td>");
						var td32 = $("<td><input  type='text' name='sex' value='"+sex+"'/></td>");
						tr3.append(td31);
						tr3.append(td32);
						var tr4 = $("<tr></tr>");
						var td41 = $("<td>电话</td>");
						var td42 = $("<td><input type='number'  name='tel' value='"+tel+"'/></td>");
						tr4.append(td41);
						tr4.append(td42);
						var tr5 = $("<tr></tr>");
						var td51 = $("<td>qq</td>");
						var td52 = $("<td><input type='number'  name='qq' value='"+qq+"'/></td>");
						tr5.append(td51);
						tr5.append(td52);
						var tr6 = $("<tr></tr>");
						var td61 = $("<td>荣耀值</td>");
						var td62 = $("<td><input  type='number'  name='honourval' value='"+honourval+"'/></td>");
						tr6.append(td61);
						tr6.append(td62);
						var tr7 = $("<tr></tr>");
						var td71 = $("<td>申领权限</td>");
						var td72 = $("<td><input type='number'  name='level' value='"+level+"'/></td>");
						tr7.append(td71);
						tr7.append(td72);
						var tr8 = $("<tr></tr>");
						var td81 = $("<td>毕业</td>");
						var td82 = $("<td><input name='isgraduate' value='"+isgraduate+"'/></td>");
						tr8.append(td81);
						tr8.append(td82);
						var tr9 = $("<tr></tr>");
						var td91 = $("<td>介绍</td>");
						var td92 = $("<td><input type='text'  name='introduce' value='"+introduce+"'/></td>");
						tr9.append(td91);
						tr9.append(td92);
						var tr10 = $("<tr></tr>");
						var td101 = $("<td>头像</td>");
						var td102 = $("<td><input type='file'  name='photo' value='"+photo+"'/></td>");
						tr10.append(td101);
						tr10.append(td102);
						var tr11 = $("<tr></tr>");
						var td111 = $("<td>入学年份</td>");
						var td112 = $("<td><input type='number'  name='intime' value='"+intime+"'/></td>");
						tr11.append(td111);
						tr11.append(td112);
						var tr12 = $("<tr></tr>");
						var td121 = $("<td>座位</td>");
						var td122 = $("<td><input type='text'  name='seat' value='"+seat+"'/></td>");
						tr12.append(td121);
						tr12.append(td122);
						var tr13 = $("<tr></tr>");
						var td131 = $("<td>实验室编号</td>");
						var td132 = $("<td><input type='text'  name='yjnum' value='"+yjnum+"'/></td>");
						tr13.append(td131);
						tr13.append(td132);
						var tr14 = $("<tr></tr>");
						var td141 = $("<td>类别</td>");
						var td142 = $("<td><input  type='text' name='remark1' value='"+remark1+"'/></td>");
						tr14.append(td141);
						tr14.append(td142);
						
						$("#xq-form table").append(tr1);
						$("#xq-form table").append(tr2);
						$("#xq-form table").append(tr3);
						$("#xq-form table").append(tr4);
						$("#xq-form table").append(tr5);
						$("#xq-form table").append(tr6);
						$("#xq-form table").append(tr7);
						$("#xq-form table").append(tr8);
						$("#xq-form table").append(tr9);
//						$("#xq-form table").append(tr10);
						$("#xq-form table").append(tr11);
						$("#xq-form table").append(tr12);
						$("#xq-form table").append(tr13);
						$("#xq-form table").append(tr14);
//						$.ajax({
//							type:"post",
//							url:"/rest/stu/find",
//							date:id,
//							contentType: "application/json",
//							success:function(data){
//								alert(data);
//								},
//							error:function(data){
//								alert("没有查询到信息");
//								}
//						});
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