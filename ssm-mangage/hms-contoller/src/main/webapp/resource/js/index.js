$(function(){
	
	function changeFrameHeight(){
        var ifm= document.getElementById("mainifram");
        ifm.height=document.documentElement.clientHeight-56;
    }
    window.onresize=function(){ changeFrameHeight();}
    $(function(){changeFrameHeight();});
});


