<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传入口</title>
</head>
<body>
    <form action="fileup" enctype="multipart/form-data" method="post" >  
                   用户名称:<input type="text" name="usename"> <br/>  
                   上传图片:<input type="file" name="file1"><br/>  
                   上传文件:<input type="file" name="file2"><br/>  
               <input type="submit" value="提交"/>  
     </form>  
</body>
</html>