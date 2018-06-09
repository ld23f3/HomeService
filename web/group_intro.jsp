<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>帮助与支持</title>
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/common.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/thems.css" />
<link rel="shortcut icon" href="Assets/images/bitbug_favicon.ico"/>
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#left_menu li ul").css("display","block");
	$("#left_menu li .yiji").click(function(){
		$(this).parents("li").find(".erji").toggle();
	});
})
</script>
</head>

<body>
	<!--头部-->
	<!--头部-->
	<div class="head_bg">
		<div class="head clearfix">
			<div class="logo">
				<a href="index.jsp"><img src="Assets/images/logo.png" alt="" /></a>
			</div>
			<div class="menu">
				<div class="head_top">
					<a href="">加入收藏</a>
				</div>
				<ul class="clearfix">
					<li><a href="index.jsp">首页</a></li>
					<li><a href="search.jsp">订单查询</a></li>
					<li><a href="search.jsp">货物追踪</a></li>
					<!-- <li class="news"><a href="">消息<span>12</span></a></li>-->
					<li><a href="count.jsp">运费试算</a></li>
					<li><a href="about.jsp">关于宅急送</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--头部-->
	<!--中间部分-->
	<div class="main">
		<!--新闻列表-->
		<div class="person clearfix">
			<div class="order_l person_l">
				<ul id="left_menu" class="left_menu">
					<li><a class="yiji"><span>新手指南</span><em>&nbsp;</em></a>
						<ul class="erji">
							<li><i>&nbsp;</i> <strong><a href="">如何注册</a></strong></li>
							<li><i>&nbsp;</i> <strong><a href="">如何追踪货物</a></strong></li>
							<li><i>&nbsp;</i> <strong><a href="">如何在线支付</a></strong></li>
							<li><i>&nbsp;</i> <strong><a href="">如何网上下单</a></strong></li>
						</ul></li>
					<li><a class="yiji"><span>常见问题</span><em>&nbsp;</em></a>
						<ul class="erji">
							<li><i>&nbsp;</i> <strong><a href="">寄送货物</a></strong></li>
							<li><i>&nbsp;</i> <strong><a href="">追踪货物</a></strong></li>
							<li><i>&nbsp;</i> <strong><a href="">接收货物</a></strong></li>
							<li><i>&nbsp;</i> <strong><a href="">结算支付</a></strong></li>
							<li><i>&nbsp;</i> <strong><a href="">账户管理</a></strong></li>
						</ul></li>
					<li><a class="yiji"><span>下载中心</span></a></li>
					<li><a class="yiji"><span>咨询/建议/投诉</span></a></li>
				</ul>
			</div>
			<div class="person_r">
				<div class="person_h">
					<span>新手指南</span>
				</div>
				<div class="person_rmain">
					<div class="news_d">
						零担（精准卡航、精准城运、精准汽运、精准空运）重货与轻货的区分为：货物的总重量（KG）和总体积（m3）的比值大于或等于210为重货，按重量计费；若比值低于210为轻货，按体积计费。如有疑问请联系当地营业部咨询。

						快递（德邦快递）重货与轻货的区分为：A=货物实际重量， B=货物的体积重量（=长CM*宽CM*高CM/6000）
						若A≥B，为重货，按实际重量计费；若A＜B，为轻货，按体积重量计费。如有疑问请联系当地营业部咨询。</div>
				</div>
			</div>
		</div>
		<!--新闻列表-->
		<div class="space_hx">&nbsp;</div>
	</div>
	<!--中间部分-->
	<div class="space_hx">&nbsp;</div>
	<!--底部-->
	<div class="foot_bg">
		<div class="foot">
			<div class="foot_t">
				<a href="">业务介绍</a> <a href="">联系我们</a>
			</div>
			<div class="copy">Copyright&copy;&nbsp;2012-2015&nbsp;
				找物流有限责任公司.&nbsp;&nbsp;All&nbsp;&nbsp;rights&nbsp;&nbsp;reserved.
				&nbsp;&nbsp;粤ICP备10005645</div>
		</div>
	</div>
	<!--底部-->
</body>
</html>
