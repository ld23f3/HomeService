<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>货物追踪</title>
<link href="Assets/css/bootstrap2.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/common.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/thems.css" />
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<link rel="shortcut icon" href="Assets/images/bitbug_favicon.ico" />
<link rel="stylesheet" href="Assets/css/layui/css/layui.css" media="all">
<script src="Assets/css/layui/layui.js" charset="utf-8"></script>
<script>

	function getQueryVariable(variable)
	{
	   var query = window.location.search.substring(1);
	   var vars = query.split("&");
	   for (var i=0;i<vars.length;i++) {
	           var pair = vars[i].split("=");
	           if(pair[0] == variable){return pair[1];}
	   }
	   return(false);
	}
	
	function getRequest(){
		
		var result = getQueryVariable("orderNo");
		
		if(result!=false){
			
			console.log("XXX="+result);
			
			$("#orderNo").text(result);
			$.post("LogisticsController?op=queryCity&orderNo="+ result,
					function(data, status) {
						array = JSON.parse(data);
						
						console.log(array.length);
						
						
						$.each(array,function(index,log) {
							
							var s ="<li class='layui-timeline-item'><i class='layui-icon layui-timeline-axis'></i>"
								+ "<div class='layui-timeline-content layui-text'>"+ "<h3 class='layui-timeline-title'>"
								+ log.CREATEDATE+ "</h3>"+ "<p>【運輸中】"+ log.CITYNAME+ ""+ log.DETAILADDRESS
								+ "</p>"+ "</div></li>"
							
							if(index==0){
								var s ="<li class='layui-timeline-item'><i class='layui-icon layui-timeline-axis'></i>"
									+ "<div class='layui-timeline-content layui-text'>"+ "<h3 class='layui-timeline-title'>"
									+ log.CREATEDATE+ "</h3>"+ "<p>【已攬件】"+ log.CITYNAME+ ""+ log.DETAILADDRESS
									+ "</p>"+ "</div></li>"
							}
							
							if(index==(array.length-1)){
								var s ="<li class='layui-timeline-item'><i class='layui-icon layui-timeline-axis'></i>"
									+ "<div class='layui-timeline-content layui-text'>"+ "<h3 class='layui-timeline-title'>"
									+ log.CREATEDATE+ "</h3>"+ "<p>【已送達】"+ log.CITYNAME+ ""+ log.DETAILADDRESS
									+ "</p>"+ "</div></li>"
							}
					
							
								
							$("#myline").append(s);
							});
																					
					});
		}
		
	}

	getRequest();
</script>


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
					<a href="">加入收藏</a>
				</div>
				<ul class="clearfix">
					<li><a href="index.jsp">首页</a></li>
					<li><a href="search.jsp">订单查询</a></li>
					<li class="now"><a href="search.jsp">货物追踪</a></li>
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
		<div class="book">
			<div class="tabBox_t">
				<div class="tabBox">
					<ul class="tabNav">
						<li class="now"><em>货物追踪</em><span>&nbsp;</span></li>
					</ul>
					<div class="tabCont" style="display: block;">
						<div class="follow_m">
							<div class="space_hx">&nbsp;</div>
							<div class="follow_mtop">
								<form action="" method="post">
									<input name="orderNo" id="orderNo" type="text"
										placeholder="请输入订单编号"> <a href="#" id="btnSearch">查询</a>
								</form>
							</div>
							<div class="space_hx">&nbsp;</div>
							<div class="follow_main">

								<ul id="myline" class="layui-timeline">
	
								</ul>
							</div>
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
				<a href="group_intro.jsp">团队介绍</a>
			</div>
			<div class="copy">Copyright&copy;&nbsp;2012-2015&nbsp;
				宅急送有限责任公司.&nbsp;&nbsp;All&nbsp;&nbsp;rights&nbsp;&nbsp;reserved.
				&nbsp;&nbsp;粤ICP备10005645</div>
		</div>
	</div>
	<!--底部-->
	<script>
		$(function() {
			$("#btnSearch").click(function() {
				var orderNo = $("#orderNo").val();

				$.post("LogisticsController?op=queryCity&orderNo="+ orderNo,
						function(data, status) {
							array = JSON.parse(data);
							
							console.log(array.length);
							
							$.each(array,function(index,log) {
								
								var s ="<li class='layui-timeline-item'><i class='layui-icon layui-timeline-axis'></i>"
									+ "<div class='layui-timeline-content layui-text'>"+ "<h3 class='layui-timeline-title'>"
									+ log.CREATEDATE+ "</h3>"+ "<p>【運輸中】"+ log.CITYNAME+ ""+ log.DETAILADDRESS
									+ "</p>"+ "</div></li>"
								
								if(index==0){
									var s ="<li class='layui-timeline-item'><i class='layui-icon layui-timeline-axis'></i>"
										+ "<div class='layui-timeline-content layui-text'>"+ "<h3 class='layui-timeline-title'>"
										+ log.CREATEDATE+ "</h3>"+ "<p>【已攬件】"+ log.CITYNAME+ ""+ log.DETAILADDRESS
										+ "</p>"+ "</div></li>"
								}
								
								if(index==(array.length-1)){
									var s ="<li class='layui-timeline-item'><i class='layui-icon layui-timeline-axis'></i>"
										+ "<div class='layui-timeline-content layui-text'>"+ "<h3 class='layui-timeline-title'>"
										+ log.CREATEDATE+ "</h3>"+ "<p>【已送達】"+ log.CITYNAME+ ""+ log.DETAILADDRESS
										+ "</p>"+ "</div></li>"
								}
						
								
									
								$("#myline").append(s);
								});
																						
						});

								//点击查询按钮后，页面跳转到"LogisticsController?op=get&orderNo=" + orderNo
								//location.href = "LogisticsController?op=query&orderNo="
								//+ orderNo;
				});
		});
	</script>
</body>
</html>
