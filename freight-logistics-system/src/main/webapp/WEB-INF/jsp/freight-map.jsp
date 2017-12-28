<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="${pageContext.request.contextPath }/images/logo.ico">
<title>新广货运联盟-货运地图</title>
<meta name="description" content="新广货运联盟实现了车找货、货找车的实时连接，通过互联网服务于广大货运司机和相关货运的各界人。新广货运联盟坚持社会效益始终第一的原则，服务质量期待你的关注，希望一路与你同行，共创美好的未来！">
<meta name="keywords" content="新广货运联盟,物流,新广货运联盟,货运,货运联盟">
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/freight-detail.css">
<!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath }/js/html5shiv.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/respond.min.js"></script>
<![endif]-->
</head>
<body>
<!--顶部-开始-->
<div style=" background:#EBEBEB; width:100%; height:80px; line-height:80px;">
    <div class="container">
        <div class="row">
            <span class="col-sm-7 col-sm-offset-1 col-xs-6 col-xs-offset-1"><img src="${pageContext.request.contextPath }/images/logo.png" class="img-responsive" alt="新广货运联盟"></span>
            <span class="col-sm-4 col-xs-5" style="float:right">
            	<a href="modify data.html" target="_blank" style="display:none">su23c0e</a>
                <a href="" style="display:none">退出</a>
            </span>
            <span class="col-sm-4 col-xs-5" style="float:right">
            	<a href="login.html" target="_blank" id="login">登录</a>&nbsp;
                <a href="register.html" target="_blank" id="reg">注册</a>
            </span>
        </div>
    </div>
</div>
<!--顶部-结束-->

<!--导航-开始-->
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="index.html">首页<span class="sr-only"></span></a></li>
                <li><a href="alliance.html">联盟简介</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">货运信息<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="freight-info.html">货运信息发布</a></li>
                        <li><a href="freight-details.html">货运信息详情</a></li>
                        <li><a href="#">货运地图</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">司机读本<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="driving-knowledge.html">驾驶常识</a></li>
                        <li><a href="driving-knowledge.html">政策法规</a></li>
                        <li><a href="driving-knowledge.html">卡车评估</a></li>
                        <li><a href="driving-knowledge.html">修车指导</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">行内互动<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="line-interaction.html">驾驶员记分</a></li>
                        <li><a href="line-interaction.html">卡车求购转让</a></li>
                        <li><a href="line-interaction.html">招聘信息</a></li>
                    </ul>
                </li>
                <li><a href="contact-us.html">联系我们</a></li>
            </ul>
        </div>
    </div>
</nav>
<!--导航-结束-->

<div class="container map">
	<div class="row">
    	<div class="col-sm-9" style="border:1px solid #ccc">
        	vdsggr
        </div>
        <div class="col-sm-2 col-sm-offset-1" style="border:1px solid #ccc">
        	<ul class="row text-center">
            	<h4 style="background:#F5841C; margin:0 -15px; padding:10px 0; color:#fff">快速查询</h4>
            	<li class="col-sm-6 col-xs-6"><a href="">修车</a></li>
                <li class="col-sm-6 col-xs-6"><a href="">禁行区</a></li>
                <li class="col-sm-6 col-xs-6"><a href="">补胎</a></li>
                <li class="col-sm-6 col-xs-6"><a href="">加气站</a></li>
                <li class="col-sm-6 col-xs-6"><a href="">限高</a></li>
                <li class="col-sm-6 col-xs-6"><a href="">加油站</a></li>
                <li class="col-sm-6 col-xs-6"><a href="">停车</a></li>
                <li class="col-sm-6 col-xs-6"><a href="">罚款区</a></li>
            </ul>
        </div>
    </div>
</div>

<!--尾部-开始-->
<div class="footer" style="background:#525252; width:100%; padding-bottom:20px; margin-top:30px;">
    <div class="container">
        <div class="row">
            <div class="col-sm-4">
                <p>友情链接</p>
                <hr>
                <ul>
                   <li><a href="" target="_blank">中国物流网</a></li>
                   <li><a href="" target="_blank">中国物流网</a></li>
                   <li><a href="" target="_blank">中国物流网</a></li>
                </ul>
            </div>
            <div class="col-sm-4">
                <p>新广货运联盟</p>
                <hr>
                <p>新广货运联盟成立于2013年，是一家专业提供互联网物流信息的网站。</p>
                <p>新广货运联盟实现了车找货、货找车的实时连接，通过互联网服务于广大货运司机和相关货运的各界人士。</p>
                <p>新广货运联盟坚持社会效益始终第一的原则，服务质量期待你的关注，希望一路与你同行，共创美好的未来！</p>
            </div>
            <div class="col-sm-4">
                <p><a href="contact-us.html">加盟我们</a> | <a href="contact-us.html">联系我们</a></p>
                <hr>
                <p>咨询电话：13462264663</p>
                <p>邮箱：xinguanghuoyun@163.com</p>
                <p>地址：河南省新乡市八一路35号中同街办事处</p>
            </div>
            <div class="col-sm-12 text-center" style="margin-top:20px;">
            	Copyright ©  新广货运联盟 版权所有 Power by www.xghylm.com  更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a>
            </div>
        </div>
    </div>
</div>
<!--尾部-结束-->
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</body>
</html>