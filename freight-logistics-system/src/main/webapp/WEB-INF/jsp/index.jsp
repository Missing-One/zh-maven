<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="${pageContext.request.contextPath }/images/logo.ico">
<title>新广货运联盟-首页</title>
<meta name="description" content="新广货运联盟实现了车找货、货找车的实时连接，通过互联网服务于广大货运司机和相关货运的各界人。新广货运联盟坚持社会效益始终第一的原则，服务质量期待你的关注，希望一路与你同行，共创美好的未来！">
<meta name="keywords" content="新广货运联盟,物流,新广货运联盟,货运,货运联盟">
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css">
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
                <li class="active"><a href="#">首页<span class="sr-only"></span></a></li>
                <li><a href="alliance.html">联盟简介</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">货运信息<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="freight-info.html">货运信息发布</a></li>
                        <li><a href="freight-details.html">货运信息详情</a></li>
                        <li><a href="freight-map.html">货运地图</a></li>
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

<!--内容-开始-->
<!--货源信息-->
<div class="container"><!--广告-->
	<a href="" target="_blank"><img src="${pageContext.request.contextPath }/images/ggt_03.png" class="img-responsive" style="width:100%; height:auto;"></a>
</div>
<div class="container"><!--货源信息-->
    <h3>货源信息</h3>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>出发地</th>
                <th>到达地</th>
                <th>货物描述</th>
                <th>意向价格</th>
                <th>发布时间</th>
                <th>状态</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
            <tr>
                <td>河南省郑州市金水区</td>
                <td>河南省郑州市中原区</td>
                <td>蔬菜，急需运输</td>
                <td>2345</td>
                <td>23/11/2013</td>
                <td class="see"><a href="">查看</a></td>
            </tr>
        </tbody>
    </table>
</div>
<div class="container"><!--货源地图-->
	<h3>货运地图</h3>
    
</div>
<!--<hr class="featurette-divider">	-->
<div class="container"><!--司机读本、行内互动-->
	<div class="row" style="margin:0;">
    	<div class="col-sm-5" style="border:1px solid #ccc;">
            <div class="row reader">
            	<h3 class="driver"><img src="${pageContext.request.contextPath }/images/reader driver.png"> <span> 司机读本</span></h3>
            	<div class="col-md-3 col-xs-6">
                	<a href="">
                    	<img src="${pageContext.request.contextPath }/images/tubiao_03.png" class="img-circle">
                        <p>驾驶常识</p>
                    </a>
                </div>
                <div class="col-md-3 col-xs-6">
                	<a href="">
                    	<img src="${pageContext.request.contextPath }/images/tubiao_09.png" class="img-circle"><p>政策法规</p>
                    </a>
                </div>
                <div class="col-md-3 col-xs-6">
                	<a href=""><img src="${pageContext.request.contextPath }/images/trucks.png" class="img-circle"><p>卡车评估</p></a>
                </div>
                <div class="col-md-3 col-xs-6">
                	<a href=""><img src="${pageContext.request.contextPath }/images/06.png" class="img-circle"><p>修车指导</p></a>
                </div>
            </div>
        </div>
        <div class="col-sm-5 col-sm-offset-2" style="border:1px solid #ccc;">
            <div class="row line">
            	<h3 class="driver" style=" background:#FA8686;"><img src="${pageContext.request.contextPath }/images/line interaction.png"> <span> 行内互动</span></h3>
            	<div class="col-md-4 col-xs-6">
                	<a href="">
                    	<img src="${pageContext.request.contextPath }/images/ttubiao_08.png" class="img-circle">
                        <p>驾照分数</p>
                    </a>
                </div>
                <div class="col-md-4 col-xs-6">
                	<a href="">
                    	<img src="${pageContext.request.contextPath }/images/ttubiao_10.png" class="img-circle">
                        <p>车辆交易</p>
                    </a>
                </div>
                <div class="col-md-4 col-xs-6">
                	<a href="">
                    	<img src="${pageContext.request.contextPath }/images/ttubiao_12.png" class="img-circle">
                   	    <p>招聘信息</p>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
<!--内容-结束-->
<div class="container"><!--广告-->
	<a href="" target="_blank"><img src="${pageContext.request.contextPath }/images/gg_03.jpg" class="img-responsive" style="width:100%; height:auto; margin:20px 0;"></a>
</div>

<!--尾部-开始-->
<div class="footer" style="/* [disabled]background: #525252; */ width: 100%; padding-bottom: 20px; /* [disabled]margin-top:30px; */">
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