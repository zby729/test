
$(document).ready(function(){
//	function subUse(){
//		$.ajax{
//			
//		}
//		
//	}
//	$("#sub").click(function(){
//		alert(2);
//	});
})

function check(){
	var femail=document.getElementById("password");
	var ftemail=document.getElementById("sure_password");
	var pwd2 = ftemail.value;
	var pwd1 = femail.value;
	
	if (frm.username.value==""){
		alert("用户名不能为空!")
		return false;
	}else if (frm.password.value==""){
		alert("密码不能为空!");
		return false;
	}else if (frm.sure_password.value==""){
		alert("确认密码不能为空!");
		return false;
	}else if(pwd1 != pwd2){
		alert("两次密码不一样，请重新输入！");
		femail.value="";
		return false;
	}else if (frm.e_mail.value==""){
		alert("邮箱不能为空!");
		return false;
	}else if (frm.phone_number.value==""){
		alert("联系电话不能为空!");
		return false;
	}else if (frm.rel_name.value==""){
		alert("真实姓名不能为空!");
		return false;
	}else if (frm.address.value==""){
		alert("详细地址不能为空!");
		return false;
	}else if (frm.answer.value==""){
		alert("密保答案不能为空!");
		return false;
	} else{
		frm.submit();
		return true;
	}
}

function checkemail(){
	var regemail=/^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*(;\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*)*$/;
	var femail=document.getElementById("e_mail");
	var ftemail=document.getElementById("se_mail");
	if(femail.value==""){
	ftemail.innerHTML="× 电子邮箱不能为空！";
	}
	else{
	if(femail.value.match(regemail)){
	ftemail.innerHTML="√ 邮箱地址正确！";
	}
	else{
	ftemail.innerHTML="× 邮箱格式输入错误，请重新输入！";
	femail.value="";
	}
	}
	}

function checkqq(){
	var regemail=/^\d{5,10}$/;
	var femail=document.getElementById("qq_number");
	var ftemail=document.getElementById("sqq_number");
	
	if(femail.value.match(regemail)){
	ftemail.innerHTML="√ qq格式正确！";
	}
	else{
	ftemail.innerHTML="× qq格式输入错误，请重新输入！";
	femail.value="";
	}
	}

function checkzip(){
	var regemail=/^[1-9][0-9]{5}$/;
	var femail=document.getElementById("zip_code");
	var ftemail=document.getElementById("szip_code");
	
	if(femail.value==""){
		ftemail.innerHTML="× 邮编不能为空！";
		}else if(femail.value.match(regemail)){
	ftemail.innerHTML="√ 邮编格式正确！";
	}
	else{
	ftemail.innerHTML="× 邮编格式输入错误，请重新输入！";
	femail.value="";
	}
	}

function checkphone(){
	var regemail=/^(13[0-9]{9})|(15[89][0-9]{8})$/;
	var femail=document.getElementById("phone_number");
	var ftemail=document.getElementById("sphone_number");
	
	if(femail.value==""){
		ftemail.innerHTML="× 手机号码不能为空！";
		} else if(femail.value.match(regemail)){
	ftemail.innerHTML="√ 手机号码格式正确！";
	}
	else{
	ftemail.innerHTML="× 手机号码格式输入错误，请重新输入！";
	femail.value="";
	}
	}

function checktruename(){
	var regemail=/^(([\u4e00-\u9fa5]{2,8})|([a-zA-Z]{2,16}))$/;
	var femail=document.getElementById("rel_name");
	var ftemail=document.getElementById("srel_name");
	
	if(femail.value==""){
		ftemail.innerHTML="× 真实姓名不能为空！";
		} else if(femail.value.match(regemail)){
	ftemail.innerHTML="√ 姓名格式正确！";
	}
	else{
	ftemail.innerHTML="× 姓名格式输入错误，请重新输入！";
	femail.value="";
	}
	}

function checkaddr(){
	var regemail=/^([^\x00-\xff]|[A-Za-z0-9_])+$/;
	var femail=document.getElementById("address");
	var ftemail=document.getElementById("saddress");
	
	if(femail.value==""){
		ftemail.innerHTML="× 详细地址不能为空！";
		} else if(femail.value.match(regemail)){
	ftemail.innerHTML="√ 地址格式正确！";
	}
	else{
	ftemail.innerHTML="× 地址格式输入错误，请重新输入！";
	femail.value="";
	}
	}

function checkapwdone(){
	var femail=document.getElementById("password");
	var ftemail=document.getElementById("spassword");
	
	if(femail.value=="" || femail.value == null){
		ftemail.innerHTML="× 密码不能为空！";
	} else {
		ftemail.innerHTML="";
	}
	}

function checkapwdtwo(){
	var femail=document.getElementById("sure_password");
	var ftemail=document.getElementById("ssure_password");
	var femail1=document.getElementById("password");
	var ftemail1=document.getElementById("spassword");
	
	if(femail.value==""){
		ftemail.innerHTML="× 密码不能为空！";
	} else {
		ftemail.innerHTML="";
	}
	if(femail.value != femail1.value){
		ftemail.innerHTML="× 两次密码不一样！";
		email.value="";
	} else{
		ftemail.innerHTML="";
	}
	
}
