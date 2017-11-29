<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登录</title>
		<link rel="stylesheet" href="<%=path %>/static/assets/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%=path %>/static/css/header1.css">
		<link rel="stylesheet" href="<%=path %>/static/css/login.css">
		<link rel="stylesheet" href="<%=path %>/static/css/footer.css">
	</head>
	<body>
	<div id="header">
			<div class="logo">
				<span>乐购</span>
			</div>
		</div>
		<div id="main" style="background-image:url(<%=path %>/static/img/login.jpg);">
			<div class="login-content">
			<form name="frm" action="<%=path%>/login" method="post">
				<div class="login-name">
					账户登录
				</div>
				<div class="login-wrap">
					<div class="form-group has-feedback">
		                <span class="glyphicon glyphicon-user form-control-feedback"></span>
		                <input type="text" class="form-control" id="username" name="username" placeholder="用户名" maxlength="20" onchange="checkCode();">
		            	<span id="codeSpan" class="tip-bubble"></span>
		            </div>
		            <div class="form-group has-feedback">
	                    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
	                    <input type="password" class="form-control" id="password" name="password" placeholder="密码" maxlength="25">
		            	<span id="pwdSpan" class="tip-bubble"></span>
		            </div>
		            <div class="tips"></div><!-- 
		            <div class="password-control"> -->
						<!-- <input type="checkbox" id="remember" checked/>
						<label for="remember"></label>
						<label for="remember" class="remember-text">记住密码</label> -->
						<!-- <span class="forget-password" style="float: right; cursor: pointer;"><a>忘记密码?</a></span> -->
					<!-- </div> -->
					
					<button type="button" class="btn btn-primary login-btn" onclick="checkPwd();">登录</button> 
				</div> 
				</form>
			</div>
		</div>
		<!--<div id="footer">
			<div class="footer1">
				<ul>
					<li>成都信息工程大学</li>
					<li>乐购商城</li>
					<li>支付宝</li>
					<li>微信</li>
					<li>物流</li>
				</ul>
			</div>
			<div class="footer2">
				<span>关于成都信息工程大学</span>
				<span>合作伙伴</span>
				<span>联系我们</span>
				<span>1111235</span>
			</div>
		</div>-->
	</body>
	<script type="text/javascript" src="<%=path %>/static/assets/jquery/jquery-3.2.0.js"></script>
	<script type="text/javascript" src="<%=path %>/static/assets/bootstrap/js/bootstrap.min.js" ></script>
	<script>
	//1、创建Ajax核心XMLHttpRequest对象实例	
	var http_request = false;
	function createRequest() {
	    http_request = false;
	    if (window.XMLHttpRequest) {     // Mozilla浏览器、IE7以上
	        http_request = new XMLHttpRequest();
	        if (http_request.overrideMimeType) {
	            http_request.overrideMimeType('text/xml');     //设置MIME类别
	        }
	    } else if (window.ActiveXObject) {     // IE5、IE6浏览器
	    
	     var MSXML = ['MSXML2.XMLHTTP.5.0', 'MSXML2.XMLHTTP.4.0', 'MSXML2.XMLHTTP.3.0', 'MSXML2.XMLHTTP', 'Microsoft.XMLHTTP'];
	        for(var n=0; n<MSXML.length; n++){
	            try{
	                var objXMLHttp = new ActiveXObject(MSXML[n]);
	                break;
	            }catch(e){}
	        }
	        
	    }
	}

	//2、事件处理中启动Ajax异步请求，并注册Ajax响应的回调函数
	function checkCode() {
	if(http_request==false){//XMLHttpRequest对象未创建
		createRequest();//创建XMLHttpRequest对象
		if(http_request==false){alert("创建不成功");return;} //创建不成功   	
	}
	var url="<%=path%>/checkname?name="+frm.username.value;
	http_request.onreadystatechange = checkcode_callback;//注册Ajax响应的回调函数
		http_request.open("POST", url, true);
		http_request.send();		//发送Ajax异步请求
	}

	//3、Ajax响应的回调函数，在正常响应后处理反馈数据
	function checkcode_callback() {  
	if (http_request.readyState == 4) { // 完成
	  if (http_request.status == 200) { // 正常响应   
	    var flag=http_request.responseText;   //获取反馈数据
	    //处理反馈数据      
	    if(flag == "3"){
	  		document.getElementById("codeSpan").style.display="block";
	    	document.getElementById("codeSpan").innerHTML=" 该账号已被冻结！";
	    	frm.username.value="";
	  	} else if(flag=="0"){
	  		document.getElementById("codeSpan").style.display="block";
	    	document.getElementById("codeSpan").innerHTML=" 该用户不存在！";
	    	frm.username.value="";
	    }else if(flag=="1"){
	    	document.getElementById("codeSpan").style.display="none";
	    }         
	    
	  } else {
	    alert("Problem: 请填写完整信息" + http_request.statusText);
	  }
	}
	}

	//2、事件处理中启动Ajax异步请求，并注册Ajax响应的回调函数
	function checkPwd() {
	if(http_request==false){//XMLHttpRequest对象未创建
		createRequest();//创建XMLHttpRequest对象
		if(http_request==false){alert("创建不成功");return;} //创建不成功   	
	}
	var url="<%=path%>/checklgpwd?username="+frm.username.value+"&password="+frm.password.value;
	http_request.onreadystatechange = checkpwd_callback;//注册Ajax响应的回调函数
		http_request.open("POST", url, true);
		http_request.send();		//发送Ajax异步请求
	}

	//3、Ajax响应的回调函数，在正常响应后处理反馈数据
	function checkpwd_callback() {  
	if (http_request.readyState == 4) { // 完成
	  if (http_request.status == 200) { // 正常响应   
	    var flag=http_request.responseText;   //获取反馈数据
	 
	    //处理反馈数据      
	    if(flag=="0"){
	  		document.getElementById("pwdSpan").style.display="block";
	    	document.getElementById("pwdSpan").innerHTML=" 密码错误！";
	    	frm.password.value="";
	    } else if(flag=="1"){
	    	document.getElementById("pwdSpan").style.display="none";
	    	check();
	    }         
	    
	  } else {
	    alert("Problem: 请填写完整信息");
	  }
	}
	}

 	function check(){
		frm.submit();
		return true;
	} 
	</script>
</html>
