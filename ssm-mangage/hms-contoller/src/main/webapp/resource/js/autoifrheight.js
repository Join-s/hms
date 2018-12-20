$(function(){
	//ifram高度自适应
	var s3=document.body.scrollHeight;
	parent.document.all("mainifram").style.height=(s3+100)+'px';
	$("#mainifram").load(function(){
			var s= parent.document.all("mainifram").style.height;
			var s2=document.body.scrollHeight;
			parent.document.all("mainifram").style.height=(s2+100)+'px';
	});
});

