<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>正在跳转。。。。。。</title>
</head>
<body>
<% String path = request.getContextPath();%>
<form name="frm" action="" method="post"> 
<input type=hidden value=<%=path %> name="path"/>
</form>
	<script language="JavaScript" type="text/javascript">
		function delayURL(url) {
			var delay = document.getElementById("time").innerHTML;
			//最后的innerHTML不能丢，否则delay为一个对象 
			if (delay > 0) {
				delay--;
				document.getElementById("time").innerHTML = delay;
			} else {
				window.top.location.href = url;
			}
			setTimeout("delayURL('" + url + "')", 1000);
			//此处1000毫秒即每一秒跳转一次 
		}
	</script>
	注册成功,<span id="time" >3</span> 秒钟之后跳转到登录页面......
	
	<script type="text/javascript">
		delayURL(frm.path.value+"/login");
	</script>
</body>
</html>