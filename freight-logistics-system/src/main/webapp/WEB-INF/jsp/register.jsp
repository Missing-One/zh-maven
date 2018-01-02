<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="icon" href="${pageContext.request.contextPath }/images/logo.ico">
<title>新广货运联盟-注册页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css" />
<body>
<div class="register-container">
	<h1>会员注册</h1>
	<form action="chkRegister" method="post" id="registerForm">
    	<div>
			<input type="text" name="phone" class="phone_number" placeholder="输入手机号码" autocomplete="off" id="number"/>
		</div>
        <div>
			<input type="password" name="password" class="password" placeholder="输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="password" class="confirm_password" placeholder="再次输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="text" name="userName" class="username" placeholder="真实姓名" autocomplete="off"/>
		
        <div>
			<input type="text" name="idCard" class="id" placeholder="输入身份证号码" oncontextmenu="return false" onpaste="return false" />
		</div>
	
      	</div>
        	<div>
			<input type="email" name="email" class="email" placeholder="输入邮箱地址" oncontextmenu="return false" onpaste="return false" />
		</div>
        <div>
        	<input type="text" name="address" placeholder="输入所在城市 选填">
        </div>
       
        <div style="float:left; margin-top:10px;">
			注册即代表同意<a href="agreement.html" target="_blank">&laquo;会员注册协议&raquo;</a>
		</div>
		<button id="submit" type="submit">注 册</button>
        <button type="reset" style="background:#F0AD4E;">重 置</button>
	</form>
	<a href="login.html">
		<button type="button" class="register-tis">已经有账号？</button>
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