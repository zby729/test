<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
%>
<html>
	<head>
		<title>注册</title>
		<link rel="stylesheet" href="<%=path %>/static/assets/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%=path %>/static/css/header1.css">
		<link rel="stylesheet" href="<%=path %>/static/css/register.css">
		<link rel="stylesheet" href="<%=path %>/static/css/footer.css">
	</head>
	<body>
		<div id="header">
			<div class="logo">
				<span>乐购</span>
			</div>
		</div>
		 <!--style="background:url(../img/pic5272.jpg)"-->
		<div id="main">
			<div class="rejister-name">
				<span>账户注册</span>
			</div>
			<div class="from-rejister">
				<form name="frm" action="<%=path%>/register" method="post">
					<div class="from-bu"></div>
					<div class="from-control" id="userchange">
						<div class="in-name">
							<span>用户名</span>
						</div>
						<input type="text" class="input-control" id="username" name="username" maxlength="20" onchange="checkCode();">
					</div>
					<!-- <div id="codeSpan" class="tip-bubble-top" display="none"></div> -->
					<span id="codeSpan" class="tip-bubble"></span>
					<div class="from-control">
						<div class="in-name">
							<span>密码</span>
						</div>
						<input type="password" class="input-control" id="password" name="password" maxlength="20" onblur="checkapwdone();" onchange="checkapwdone();">
						
					</div>
					<span id="spassword" class="tip-bubble"></span>
					<div class="from-control">
						<div class="in-name">
							<span>确认密码</span>
						</div>
						<input type="password" class="input-control" id="sure_password" name="sure_password" maxlength="20" onchange="checkapwdtwo();">
					
					</div>
					<span id="ssure_password" class="tip-bubble"></span>
					<div class="from-control">
						<div class="in-name">
							<span>e_mail</span>
						</div>
						<input type="text" class="input-control" id="e_mail" name="e_mail" maxlength="20" onchange="checkemail();">
						
					</div>
					<span id="se_mail" class="tip-bubble"></span>
					<div class="from-control">
						<div class="in-name">
							<span>QQ</span>
						</div>
						<input type="text" class="input-control" id="qq_number" name="qq_number" maxlength="12" onchange="checkqq();">
						
					</div>
					<span id="se_mail" class="sqq_number"></span>
					<div class="from-control">
						<div class="in-name">
							<span>邮编</span>
						</div>
						<input type="text" class="input-control" id="zip_code" name="zip_code" maxlength="6" onchange="checkzip();">
						
					</div>
					<span id="szip_code" class="tip-bubble"></span>
					<div class="from-control">
						<div class="in-name">
							<span>联系手机</span>
						</div>
						<input type="text" class="input-control" id="phone_number" name="phone_number" maxlength="11" onchange="checkphone();">
						
					</div>
					<span id="sphone_number" class="tip-bubble"></span>
					<div class="from-control">
						<div class="in-name">
							<span>真实姓名</span>
						</div>
						<input type="text" class="input-control" id="rel_name" name="rel_name" onchange="checktruename();">
						
					</div>
					<span id="srel_name" class="tip-bubble"></span>
					<div class="from-control">
						<div class="in-name">
							<span>详细地址</span>
						</div>
						<input type="text" class="input-control" id="address" name="address" onchange="checkaddr();">
						
					</div>
					<span id="saddress" class="tip-bubble"></span>
					<div class="from-control">
						<div class="in-name">
							<span>密保问题</span>
						</div>
						<select class="input-control" id="quesion" name="quesion" style="width:280px;height:40px;color:#666666">
							<option value="0" style="color:#666666">妈妈的生日</option>
							<option value="1" style="color:#666666">爸爸的生日</option>
							<option value="2" style="color:#666666">我的生日</option>
						</select>
						
					</div>
					<div class="from-control">
						<div class="in-name">
							<span>答案</span>
						</div>
						<textarea class="input-control" id="answer" name="answer" cols="37" rows="2"></textarea>
						
					</div>
					
					<button class="btn btn-primary register-btn" onclick="return check()">提交</button>
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
	<script type="text/javascript" src="<%=path %>/static/js/register.js"></script>

</html>
<<script type="text/javascript">
<!--

//-->
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
  	if(flag=="0"){
  		document.getElementById("codeSpan").style.display="block";
    	document.getElementById("codeSpan").innerHTML="√ 此用户名可以使用";
    }else if(flag=="1"){
    	document.getElementById("codeSpan").style.display="block";
    	document.getElementById("codeSpan").innerHTML="× 此用户名["+frm.username.value+"]已经存在，请重新输入！";
    	frm.username.value="";
    }         
    
  } else {
    alert("Problem: " + http_request.statusText);
  }
}
}
</script>
