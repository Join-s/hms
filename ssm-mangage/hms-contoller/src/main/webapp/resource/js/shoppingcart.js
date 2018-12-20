$(function(){
	$(".btn-tog").css("display", "none");
		$(".elename").attr("class","col-lg-6 elename")
		$(".elenum").attr("class","col-lg-4 elenum")
		$(".elebtn").attr("class","col-lg-2 elebtn")
		$(".eleinfodet").attr("class","col-lg-12 eleinfodet")
		$(".btn-tog-all").attr("onclick","btntog2(this)");
		$(".btn-tog-all").text("展开");
//		
//		function addNumber() {
//			alert($(this).attr("value"));
//		}
		

});
//购物车订单提交校验函数
function check() {
	return true;
}
//收起元件列表
function btntog(node) {
		$(node).parent().parent().parent().find($(".btn-tog")).css("display", "none");
		$(node).parent().parent().parent().find($(".elename")).attr("class","col-lg-6 elename")
		$(node).parent().parent().parent().find($(".elenum")).attr("class","col-lg-4 elenum")
		$(node).parent().parent().parent().find($(".elebtn")).attr("class","col-lg-2  elebtn")
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