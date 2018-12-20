$(function() {
	function iframeInit(){
	//iframe初始化开始
		var w = window.innerHeight; //可用长度
		var q = 0;
		$(".top_height").each(function() {
			q += $(this).height(); //ifram前素所有行元素的高度
		});
		$("#iframe1").attr("height", w - q + 150 + 'px');
	//iframe初始化结束
	}
	iframeInit();
	//当前位置效果
	$("#yi-erlei").hide();
	$(".panel-title").click(function() {
			$("#yi-erlei").hide();
			$("#yilei").text($(this).text());
	});
	$(".erlei").click(function(){
		$("#yi-erlei").show();
		$("#erlei").text($(this).text());
	});
});