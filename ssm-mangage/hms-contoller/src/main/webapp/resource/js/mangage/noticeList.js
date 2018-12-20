$(function() {
	function tableInit() { //表格信息冗余处理初始化
		$("table tbody tr").each(function() {
			var td1 = $(this).find("td").eq(2).text().replace(' ', '').replace('/\r\n/g', '').length;
			var td2 = $(this).find("td").eq(3).text().replace(' ', '').length;
			var td3 = $(this).find("td").eq(1).text().replace(' ', '').length;
			if(td1 > 10) {
				var d = $(this).find("td").eq(2).text().replace(' ', '').replace('/\r\n/g', '').replace('/-/g', '');
				d = d.substr(0, 20);
				$(this).find("td").eq(2).text(d + '...');
			}
			if(td2 > 40) {
				var d = $(this).find("td").eq(3).text().substr(0, 40);
				$(this).find("td").eq(3).text(d + '...');
			}
			if(td3 > 15) {
				var d = $(this).find("td").eq(1).text().substr(0, 15);
				$(this).find("td").eq(1).text(d + '...');
			}
		});
	}
	tableInit();

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
			var ids = $(this).parent().parent().find("input").val();
			
			$.ajax({//
				type: "post",
				url: "/rest/notice/query",
				contentType: "application/json",
				data: ids,
				success: function(obj) {
					$("#myModalLabel").text('公告详情'); //模态框标题
					var mbody = $("#myModal .modal-dialog .modal-body"); //模态框内容
					mbody.children().remove();
					
					var mtab=$("<table  class='table table-condensed'></table>");
					var tr1=$("<tr><td><b>公告标题:</b>"+obj.title+"</td></tr>");
					var tr2=$("<tr><td><b>公告内容:</b></td></tr>");
					var tr3=$("<tr></tr>");
					var td3=$("<td></td>");
					var mtext3=$("<textarea id='ntext' name='' cols='76%' rows='20'></textarea>");
					
					mtext3.text(obj.text);
					
					var tr4=$("<tr><td><b>公告链接:</b>"+obj.link+"</td></tr>");
					var tr5=$("<tr><td><b>公告时间:</b>"+new Date(obj.createtime).toLocaleDateString()+"</td></tr>");
					
					if(obj.istop=='1'){
						var tr6=$("<tr class='alert-info'><td><b>状态:</b>"+'置顶'+"</tr>");
					}else{
						var tr6=$("<tr class='alert-warning'><td><b>状态:</b>"+'未置顶'+"</tr>");
					}
					mtab.append(tr1);
					mtab.append(tr2);
					td3.append(mtext3);
					tr3.append(td3);
					mtab.append(tr3);
					mtab.append(tr4);
					mtab.append(tr5);
					mtab.append(tr6);
					mbody.append(mtab);

					$("#myModal .modal-dialog modal-footer"); //模态框底部
				},
				error: function(data) {
					alert('网络错误！');
				}
			});
		});

		//模态框修改按钮
		$(".xg-btn").click(function() {
			$("#xq-form-sumbit").show();//释放提交按钮
			var ids = $(this).parent().parent().find("input[type='checkbox']").val();
			$.ajax({
				type: "post",
				url: "/rest/notice/query",
				contentType: "application/json",
				data: ids,
				success: function(obj) {
					$("#myModalLabel").text('公告详情'); //模态框标题
					var mbody = $("#myModal .modal-dialog .modal-body"); //模态框内容
					mbody.children().remove();
					
					var mform=$("<form id='xq-form' onsubmit='return checkinfo()' method='post'></form>");
					
					mform.attr("action","/rest/notice/update");
					var mtab=$("<table  class='table table-condensed'></table>");
					var tr1=$("<tr><td><b>公告标题:</b><input type='text' value='"+obj.title+"' name='title' id='ntitile' /></td></tr>");
					var tr2=$("<tr><td><b>公告内容:</b></td></tr>");
					var tr3=$("<tr></tr>");
					var td3=$("<td></td>");
					var mtext3=$("<textarea  name='text' cols='76%' rows='20' value='"+obj.text+"'></textarea>");
					
					mtext3.text("niahoahashd");
					
					var tr4=$("<tr><td><b>公告链接:</b><input type='text' value='"+obj.link+"' name='link' /></td></tr>");
					var tr5=$("<tr><td><b>公告时间:</b><input type='text' value='"+new Date(obj.createtime).toLocaleDateString()+"' name='updatetime' readonly='readonly' /></td></tr>");
					var tr6=$("<tr><td><input type='hidden' value='"+ids+"' name='id' /></tr>");
					
					mtab.append(tr1);
					mtab.append(tr2);
					td3.append(mtext3);
					tr3.append(td3);
					mtab.append(tr3);
					mtab.append(tr4);
					mtab.append(tr5);
					mtab.append(tr6);
					mform.append(mtab);
					mbody.append(mform);

					$("#myModal .modal-dialog modal-footer"); //模态框底部
				},
				error: function(data) {
					alert('网络错误');
				}
			});
		});
	}////模态框弹出初始化
	modelInitBtns();

});
//删除按钮
function delteCheck() {
	var flag = getCheckId();
	var from1 = $("#form1");
	if(flag) {
//		from1.action ="${pageContext.request.contextPath }/rest/notice/delete";
//		from1.attr("action","${pageContext.request.contextPath }/rest/notice/delete")
		from1.submit();
		
		alert("删除成功");
	} else {
		alert("请至少选择一行");
		return false;
	}
	
}
//模态框表检查信息
function checkinfo() {
//	alert('模态框表检查信息');
	return true;
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