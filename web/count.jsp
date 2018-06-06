<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>运费试算</title>
		<link rel="stylesheet" type="text/css" href="Assets/css/reset.css" />
		<link rel="stylesheet" type="text/css" href="Assets/css/common.css" />
		<link rel="stylesheet" type="text/css" href="Assets/css/thems.css" />
	</head>

	<body>
		<!--头部-->
		<div class="head_bg">
			<div class="head clearfix">
				<div class="logo">
					<a href="index.jsp"><img src="Assets/images/logo.png" alt="" /></a>
				</div>
				<div class="menu">
					<div class="head_top">
						<a href="">设为首页</a>
						<a href="">加入收藏</a>
					</div>
					<ul class="clearfix">
						<li >
							<a href="index.jsp">首页</a>
						</li>
						<li>
							<a href="search.jsp">订单查询</a>
						</li>
						<li>
							<a href="search.jsp">货物追踪</a>
						</li>
						<!-- <li class="news"><a href="">消息<span>12</span></a></li>-->
						<li class="now">
							<a href="count.jsp">运费试算</a>
						</li>
						<li>
							<a href="about.jsp">关于宅急送</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!--头部-->
		<!--中间部分-->
		<div class="main">
			<div class="book">
				<div class="tabBox_t">
					<div class="tabBox">
						<ul class="tabNav">
							<li class="now"><em>运费试算</em><span>&nbsp;</span></li>
						</ul>
						<div class="tabCont" style="display:block;">
							<div class="book_m">
								<div class="space_hx">&nbsp;</div>

								<div class="space_hx">&nbsp;</div>
								<form action="" method="post">

									<div class="space_hx">&nbsp;</div>
									<ul class="xinxi">
										<li>
											收货城市
											<input name="" type="text" class="wenben" placeholder="请输入城市名">
										</li>
										<li>
											到达城市
											<input name="" type="text" class="wenben" placeholder="请输入城市名">
										</li>
										
										<li>
											货物數量
											<input name="" type="text" class="wenben"> 件
										</li>
						
										<li>
											货物重量
											<input name="" type="text" class="wenben"> 
										</li>
									<div class="space_hx">&nbsp;</div>

									<div class="space_hx">&nbsp;</div>

									<div class="xiadan_btn">
										<a href="" class="sub">运费试算</a>
							
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="space_hx">&nbsp;</div>
		</div>
		<!--中间部分-->
		<div class="space_hx">&nbsp;</div>
		<!--底部-->
		<div class="foot_bg">
			<div class="foot">
				<div class="foot_t">
					<a href="">业务介绍</a>
					<a href="">联系我们</a>
				</div>
				<div class="copy">
					Copyright&copy;&nbsp;2012-2015&nbsp; 宅急送有限责任公司.&nbsp;&nbsp;All&nbsp;&nbsp;rights&nbsp;&nbsp;reserved. &nbsp;&nbsp;粤ICP备10005645
				</div>
			</div>
		</div>
		<!--底部-->
	</body>

</html>