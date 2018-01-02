<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="icon" href="${pageContext.request.contextPath }/images/logo.ico">

<title>新广货运联盟-登录页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css" />
<body>
<div class="login-container">
    <h1>会员登录</h1>
    <form action="dologin" method="post" id="loginForm">
        <div>
			<input type="text" name="phone" class="phone_number" placeholder="输入手机号码" autocomplete="off" id="number"/>
        </div>
        <div>
            <input type="password"  name="password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
        </div>
      
        <button id="submit"  type="submit">登 陆</button>
        <button type="reset" style="background:#F0AD4E;">重 置</button>
    </form>
    <a href="register.html">
    	<button type="button" class="register-tis">还没有账号？</button>
    </a>
</div>
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script> 
<script src="${pageContext.request.contextPath }/js/common.js"></script> 
<!--背景图片自动更换--> 
<script src="${pageContext.request.contextPath }/js/supersized.3.2.7.min.js"></script> 
<script src="${pageContext.request.contextPath }/js/supersized-init.js"></script> 
<!--表单验证--> 
<script src="${pageContext.request.contextPath }/js/jquery.validate.min.js?var1.14.0"></script>
</body>
</html>