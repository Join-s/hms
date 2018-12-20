$(function() {
//	$("#btn").mouseover(function() {
//		$("#myUL").dropdown('toggle');
//	});
//	$("#btn").mouseout(function() {
//		$("#myUL").dropdown('toggle');
//	});

	$(".imginfo").parent().append($("<div class='img-info-big'></div>"));
//	alert("ss");

	$(".imginfo").mouseover(function(){
		$(".img-info-big").append("<img "+$(".imginfo").attr("src")+"/>");
		$(".img-info-big").show();
		
	});
	
	$(".imginfo").mouseout(function(){
		
	});
});

//搜索校验函数
function check(){
	return true;
}
function mysubmit(){
	$("#myformsousuo").submit();
}
