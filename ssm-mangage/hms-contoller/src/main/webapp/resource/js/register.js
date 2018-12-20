function trim(str) {
	return str.replace(/^(\s|\u00A0)+/, '').replace(/(\s|\u00A0)+$/, '')
			.replace(" ", "");
}

function check() {
	// 登陆校验
	
	var ss= $("#team option:checked").val();
	var sd=$("#major option:checked").val();
	var sa=$("#college option:checked").val() ;
//	var q1=selectmajor() ;
//	var q2=checkUsername();
//	var q3=checkUsernumber();
//	var q4=checkPwd() ;
//	var q5=checkRepwd();
//		var q6=	selectcollege() ;
//			var q7=	selectteam();
	var flag =checkUsername() & checkUsernumber() & checkPwd() & checkRepwd() &ss&sd&sa&1;
//	 alert(flag);
	if(flag)
		return true;
	return false;
}
function checkUsername() {
	// 校验用户名
	if (trim($("#username").val()) == "") {
		$("#usernameSpan").css("color", "red");
		$("#usernameSpan").text("用户名不能为空");
		return false;
	} else if ($("#username").val().length > 10) {
		$("#usernameSpan").css("color", "red");
		$("#usernameSpan").text("用户名太长");
		return false;
	} else {
		var s = $("#username").val().split(" ");
		var str = trim($("#username").val());
		while (s.length > 1) {
			$("#username").val(str);
			s = $("#username").val().split(" ");
			str = trim($("#username").val());
		}
		$("#username").val(str);
		$("#usernameSpan").css("color", "green");
		$("#usernameSpan").text("√");
		return true;
	}
}
function checkUsernumber() {
	// 校验学号
	if ($("#usernumber").val() == "") {
		$("#usernumberSpan").css("color", "red");
		$("#usernumberSpan").text("学号不能为空");
		return false;
	} else {
		var s = /^[0-9]{5,}$/;
		if (s.test($("#usernumber").val())) {
			$("#usernumberSpan").css("color", "green");
			$("#usernumberSpan").text("√");
			return true;
		} else {
			$("#usernumberSpan").css("color", "red");
			$("#usernumberSpan").text("学号格式不正确");
			return false;
		}
	}
}
function checkPwd() {
	// 校验密码
	if ($("#pwd").val() == "") {
		$("#pwdSpan").css("color", "red");
		$("#pwdSpan").text("密码不能为空");
		return false;
	} else {
		var s = /^[0-9a-zA-Z._]{6,20}$/;
		if (s.test($("#pwd").val())) {
			$("#pwdSpan").css("color", "green");
			$("#pwdSpan").text("√");
			// checkRepwd();
			return true;
		} else {
			$("#pwdSpan").css("color", "red");
			$("#pwdSpan").text("密码少于6位或多于20位或有特殊字符");
			return false;
		}
	}
}
function checkRepwd() {
	// 校验确认密码
	if ($("#repwd").val() == "") {
		$("#repwdSpan").css("color", "red");
		$("#repwdSpan").text("重复密码不能为空");
		return false;
	} else if ($("#repwd").val() == $("#pwd").val()) {
		$("#repwdSpan").css("color", "green");
		$("#repwdSpan").text("√");
		return true;
	} else {
		$("#repwdSpan").css("color", "red");
		$("#repwdSpan").text("请填写正确重复密码");
		return false;
	}
}
function selectcollege() {
	// 选择学院
	if ($("#college option:checked").val() > 0) {// 选择了学院
		// alert($("#college option:checked").val());
		$("#major").text("");
		$("#major").children().remove();
		$("#major").append("<option value='0'>请选择专业</option>");
		var collegeid = $("#college option:checked").val();// 学院id
		// 数据回显,显示专业
		$.ajax({
			type : "post",
			url : "/rest/user/queryByDep",
			data : collegeid,
			contentType : "application/json",
			success : function(data) {
				i = 0;
				
				if (data.length > 0)
					while (i < data.length){
						$("#major").append("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
					i++;
					}
			},
			error : function(data) {
				alert('no information');
			}
		});

		$("#major").css("display", "block");
		return true;
	} else {
		$("#teamSpan").css("color", "red")
		$("#teamSpan").text("请选择学院");
		$("#major").css("display", "none");
		$("#team").css("display", "none");
		return false;
	}
}
function selectmajor() {
	// 选择专业
	if ($("#major option:checked").val() > 0) {

		$("#team").text("");
		$("#team").children().remove();
		$("#team").append("<option value='0'>请选择班级</option>");
		var majorid = $("#major option:checked").val();// 专业id
		// 数据回显，显示班级
		$.ajax({
			type : "post",
			url : "/rest/user/queryByMag",
			data : majorid,
			contentType : "application/json",
			success : function(data) {
				i = 0;
				
				if (data.length > 0)
					while (i < data.length){
						$("#team").append("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
					i++;
					}
			},
			error : function(data) {
				alert('no information');
			}
		});
// $("#team").append("<option value='11'>11班</option>");
		$("#team").css("display", "block");
		return true;
	} else {
		$("#teamSpan").css("color", "red")
		$("#teamSpan").text("请选择专业");
		$("#team").css("display", "none");
		return false;
	}
}
function selectteam() {
	// 选择班级
//	alert($("#team option:checked").val() );
	
	if ($("#team option:checked").val() > 0) {
		$("#teamSpan").text("√");
		$("#teamSpan").css("color", "green")
		return true;
	} else {
		$("#teamSpan").css("color", "red")
		$("#teamSpan").text("请选择班级");
		return false;
	}
}
