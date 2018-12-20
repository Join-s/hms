$(function(){
	//元件列表初始化
		$(".btn-tog").css("display", "none");
		$(".elename").attr("class","col-lg-6 elename")
		$(".elenum").attr("class","col-lg-4 elenum")
		$(".elebtn").attr("class","col-lg-2 elebtn")
		$(".eleinfodet").attr("class","col-lg-12 eleinfodet")
		$(".btn-tog-all").attr("onclick","btntog2(this)");
		$(".btn-tog-all").text("展开");
	//删除订单
//	$(".delete").click(function (this){
//		$(this).parent().parent().hide();
//	});
		$(".xiangqing").click(function () {
			var id=$(this).attr("id");

			$(".modal-title").text('订单详情');
			$(".modal-body").children().remove();
			
			
			$.ajax({     
				type: "post",     
				url: "/rest/order/orders?oid="+id,
				contentType: "application/json; charset=utf-8",     
				success: function (data) {     
					var len=data.tOrderdetails.length;
					if(len>0){
						for(var i=0;i<len;i++){
							var div1=$("<div class='row ordetails'></div>");
							var div2=$("<div class='col-lg-12 col-lg-offset-0 alert alert-info'></div>");
							var div21=$("<div class='col-lg-2  col-sm-12  col-xs-12 btn-tog'></div>");
							var img21=$("<img src='"+data.tOrderdetails[i].tComponent.img+"' class='img img-circle' width='100px' height='100px' />");
							var div22=$("<div class='col-lg-9 eleinfodet'></div>");
							var div221=$("<div class='col-lg-12 elename'></div>");
							div221.text(data.tOrderdetails[i].tComponent.name);
							var div222=$("<div class='col-lg-12 elenum'></div>");
							div222.text(data.tOrderdetails[i].number+"个");
							var div223=$("<div class='col-lg-6 btn-tog'></div>");
							div223.text("规格："+data.tOrderdetails[i].tComponent.specification);
							var div224=$("<div class='col-lg-6 btn-tog'></div>");
							div224.text("品牌："+data.tOrderdetails[i].tComponent.brand);
							var div225=$("<div class='col-lg-6 btn-tog'></div>");
							div225.text("型号："+data.tOrderdetails[i].tComponent.version);
							var div226=$("<div class='col-lg-6 btn-tog'></div>");
							div226.text("单价："+data.tOrderdetails[i].tComponent.price+"￥");
							var div227=$("<div class='col-lg-6 btn-tog'></div>");
							div227.text("位置："+data.tOrderdetails[i].tComponent.place);
							var div228=$("<div class='col-lg-6 btn-tog'></div>");
							div228.text("库存："+data.tOrderdetails[i].tComponent.store+"个");
							var div2210=$("<div class='col-lg-2 col-lg-offset-10 elebtn'><a href='#' class='btn-tog-all' onclick='btntog(this)'>收起</a></div>");
							div2.append(div21);
							div1.append(div2);
							div21.append(img21);
							div22.append(div221);
							div22.append(div222);
							div22.append(div223);
							div22.append(div224);
							div22.append(div225);
							div22.append(div226);
							div22.append(div227);
							div22.append(div228);
							div22.append(div2210);
							div2.append(div21);
							div2.append(div22);
							$(".modal-body").append(div1);
							$(".modal-body").append(div2);
						}
					}
					
				},     
				error: function (XMLHttpRequest, textStatus, errorThrown) {     
				alert(errorThrown);     
				}     
				});
		});
	
	
});


	//显示订单详情
function showordersinfo(node){
	
	$(".showordersinfo").show();
	$(".showpersonalinfo").hide();
	$(".showorders_li").attr("class","list-group-item active showorders_li");
	$(".showperson_li").attr("class","list-group-item showperson_li");
	
	$(".showorders_li a").css("font-size","25px");
	$(".showperson_li").css("font-size","14px");
	return false;
}

//显示个人信息
function showpersonalinfo(node){
	$(".showordersinfo").hide();
	$(".showpersonalinfo").show();
	$(".showorders_li").attr("class","list-group-item showorders_li");
	$(".showperson_li").attr("class","list-group-item active showperson_li");
	$(".showorders_li a").css("font-size","14px");
	$(".showperson_li").css("font-size","25px");
	return false;
}



//收起元件列表
function btntog(node) {
		$(node).parent().parent().parent().find($(".btn-tog")).css("display", "none");
		$(node).parent().parent().parent().find($(".elename")).attr("class","col-lg-6 elename")
		$(node).parent().parent().parent().find($(".elenum")).attr("class","col-lg-4 elenum")
		$(node).parent().parent().parent().find($(".elebtn")).attr("class","col-lg-2 elebtn")
		$(node).parent().parent().parent().find($(".eleinfodet")).attr("class","col-lg-12 eleinfodet")
		$(node).parent().parent().parent().find($(".btn-tog-all")).attr("onclick","btntog2(this)");
		$(node).parent().parent().parent().find($(".btn-tog-all")).text("展开");
}
//展开元件列表
function btntog2(node) {
		$(node).parent().parent().parent().find(".btn-tog").css("display", "block");
		$(node).parent().parent().parent().find($(".elename")).attr("class","col-lg-12 elename")
		$(node).parent().parent().parent().find($(".elenum")).attr("class","col-lg-12 elenum")
		$(node).parent().parent().parent().find($(".elebtn")).attr("class","col-lg-2 col-lg-offset-10 elebtn")
		$(node).parent().parent().parent().find($(".eleinfodet")).attr("class","col-lg-9 eleinfodet")
		$(node).parent().parent().parent().find($(".btn-tog-all")).attr("onclick","btntog(this)");
		$(node).parent().parent().parent().find($(".btn-tog-all")).text("收起");
}

//删除订单
function deleteorders(node){
	var flag= confirm('确定取消此订单？');
	if(flag){
		$(node).parent().parent().remove();
		
		
		return true;
	}else{
		alert("已取消");
		return false;
	}
	
}
	
	
	
	
	
	