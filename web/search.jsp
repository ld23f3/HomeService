<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>订单查询</title>
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/common.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/thems.css" />
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<link rel="shortcut icon" href="Assets/images/bitbug_favicon.ico" />
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
					<li class="now"><a href="search.jsp">订单查询</a></li>
					<li><a href="follow.jsp">货物追踪</a></li>
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
						<li class="now"><em>订单查询</em><span>&nbsp;</span></li>
					</ul>
					<div class="tabCont" style="display: block;">
						<div class="follow_m">
							<div class="space_hx">&nbsp;</div>
							<div class="follow_mtop">
								<form action="" method="post">
									<input type="text" name="queryLike" id="queryLike"
										placeholder="请输入手机号码" value="${queryLike}"> <a
										href="#" id="btnSearch">查询</a>
								</form>

							</div>
							<div class="space_hx">&nbsp;</div>
						</div>
						<div id="web_m" class="web_m">
							<table class="wang" cellpadding="0" cellspacing="0">
								<tr>
									<th width="70" scope="col">订单编号</th>
									<th width="70" scope="col">寄件人</th>
									<th width="70" scope="col">寄件人地址</th>
									<th width="70" scope="col">寄件人手机</th>
									<th width="70" scope="col">收件人</th>
									<th width="70" scope="col">收件人地址</th>
									<th width="70" scope="col">收件人手机</th>
									<th width="90" scope="col">下单日期</th>
									<th width="90" scope="col" hidden>订单状态</th>
								</tr>
								<c:if test="${pd!=null}">
									<c:forEach items="${pd.data}" var="order">

										<tr>

											<td><a href="#" onclick="getdetail(${order.ORDERNO})">${order.ORDERNO}</a></td>
											<td>${order.SENDER}</td>
											<td>${order.SENDERPROVINCENAME}${order.SENDERCITYNAME}${order.SENDERCOUNTYNAME}${order.SENDERADDRESS}</td>
											<td>${order.SENDERMOBILE}</td>
											<td>${order.RECEIVER}</td>
											<td>${order.RECEIVERPROVINCENAME}${order.RECEIVERCITYNAME}${order.RECEIVERCOUNTYNAME}${order.RECEIVERADDRESS}</td>
											<td>${order.RECEIVERMOBILE}</td>
											<td>${order.ORDERDATE}</td>
											<%-- 													<td>${order.ORDERSTATUS}</td> --%>
											<%-- 													<td >${order.ORDERRMODIFIED}</td> --%>


										</tr>
									</c:forEach>
								</c:if>

							</table>
							<!--分页导航-->
							<div class="pclady_page">
								<a href="javascript:void(0)" id="prePage">上一页</a>
								<c:forEach begin="1" end="${pd.totalPage}" var="index">
									<!-- 激活当前页码显示效果 -->
									<c:if test="${index == pd.page}">
										<a href="javascript:void(0)" class="now pageNo">${index}</a>
									
									</c:if>
									<c:if test="${index != pd.page}">
										<a href="javascript:void(0)" class="pageNo">${index}</a>
									</c:if>
								</c:forEach>
								<a href="javascript:void(0)" id="nextPage">下一页</a> <a
									href="javascript:void(0)" target="_blank" id="return">返回首页</a>
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
	<script type="text/javascript"
		src="https://cdn.bootcss.com/jquery/2.1.1/jquery.js"></script>
	<script>
	   $(function(){
		   
		   //如果当前页 已经是最后一页了
		   if(${pd.page >= pd.totalPage})
			   {
			   //下一页 样式设置
			   $("#nextPage").css("color","gray");
			   //pointer-events 不能点击了
			   $("#nextPage").css("pointer-events","none");
			   }
		   
		 //如果当前页 已经是第一页了
		   if(${pd.page <= 1})
		   {
			     //上一页 样式设置
		   $("#prePage").css("color","gray");
		   $("#prePage").css("pointer-events","none");
		   }
		   
		   
		   //分页页码点击
		   $(".pageNo").click(function(){
			   location.href = "QueryOrderController?op=queryOrderByPage&pageNum=" + $(this).text()+"&queryLike="+$("#queryLike").val();
		   });
		   
		   //下一页
		   $("#nextPage").click(function(){
			   
			   location.href = "QueryOrderController?op=queryOrderByPage&pageNum=" + ${pd.page+1}+"&queryLike="+$("#queryLike").val();
		   });
		   
		   //上一页
		   $("#prePage").click(function(){
			   location.href = "QueryOrderController?op=queryOrderByPage&pageNum=" + ${pd.page-1}+"&queryLike="+$("#queryLike").val();
		   });
		   
		   
		   
		   //处理模糊检索
		   $("#btnSearch").click(function(){
			   
			   //得到用户输入在文本框中的值
			   var queryLike = $("#queryLike").val();
			   location.href = "QueryOrderController?op=queryOrderByPage&queryLike="+queryLike;
			   
		   });
		   
		   $("#return").click(function(){
			   location.href = "index.jsp";
		   });
		   		   
	   });
	   
	   function getdetail(orderNo){
		   
		 location.href = "LogisticsController?op=query&orderNo="+ orderNo;
		 console.log("orderNo="+orderNo);
	   }
	</script>
</body>
</html>
