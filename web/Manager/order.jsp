<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="Dashboard">
		<meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

		<title>宅急送后台管理</title>

		<!-- Bootstrap core CSS -->
		<link href="${pageContext.request.contextPath}/Assets/css/bootstrap.css" rel="stylesheet">
		<!--external css-->
		<link href="${pageContext.request.contextPath}/Assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Assets/css/zabuto_calendar.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Assets/js/gritter/css/jquery.gritter.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Assets/lineicons/style.css">

		<!-- Custom styles for this template -->
		<link href="${pageContext.request.contextPath}/Assets/css/style.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/Assets/css/style-responsive.css" rel="stylesheet">

		<script src="${pageContext.request.contextPath}/Assets/js/chart-master/Chart.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>

	<body>

		<section id="container">
			<!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
			<!--header start-->
			<header class="header black-bg">

				<div class="sidebar-toggle-box">
					<div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
				</div>
				<!--logo start-->
				<a href="index.html" class="logo"><b>宅急送后台管理</b></a>
				<!--logo end-->
				<div class="nav notify-row" id="top_menu">
					<!--  notification start -->
					
				</div>
				<div class="top-menu">
					<ul class="nav pull-right top-menu">
						<li>
							<a class="logout" href="login.html">退出登陆</a>
						</li>
					</ul>
				</div>

			</header>
			<!--header end-->

			<!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
			<!--sidebar start-->
			<aside>
				<div id="sidebar" class="nav-collapse ">
					<!-- sidebar menu start-->
					<ul class="sidebar-menu" id="nav-accordion">

						<p class="centered">
							<a href="profile.html"><img src="${pageContext.request.contextPath}/Assets/img/ui-sam.jpg" class="img-circle" width="60"></a>
						</p>
						<h5 class="centered">宅急送</h5>

						<li class="mt">
							<a class="hover" href="${pageContext.request.contextPath}/Manager/order.jsp">
								<i class="fa fa-dashboard"></i>
								<span>订单管理</span>
							</a>
						</li>

						<li class="sub-menu">
							<a class="hover" href="${pageContext.request.contextPath}/Manager/courier.jsp">
								<i class="fa fa-desktop"></i>
								<span>快递员管理</span>
							</a>

						</li>

						<li class="sub-menu">
							<a class="hover" href="${pageContext.request.contextPath}/Manager/logistics.jsp">
								<i class="fa fa-cogs"></i>
								<span>物流管理</span>
							</a>

						</li>

					</ul>
					<!-- sidebar menu end-->
				</div>
			</aside>
			<!--sidebar end-->
			<div class="copyrights">Collect from
				<a href="http://www.cssmoban.com/">网页模板</a>
			</div>

			<!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
			<!--main content start-->
			<section id="main-content">
				<section class="wrapper">

					<div class="row">
						<div class="col-lg-9 main-chart">
							<%-- <form class="navbar-form navbar-left">
								<input type="text" class="form-control" name="articleLike"  value="${articleLike==null?'':articleLike}">
								<input type="button" name="" id="" value="搜索" />
							</form> --%>
							
							
							<form class="navbar-form navbar-left">
					<input type="text" id="searchUserName" class="form-control" placeholder="Search..." value="${orderLike==null?'':orderLike}">
					<input type="button" id="btnSearch" class="form-control" value="搜索">
				</form>	
							<div class="table-responsive">
								<table class="table table-striped">
									<thead>
										<tr>
											<th>订单编号</th>
											<th>寄件人姓名</th>
											<th>寄件人地址</th>
											<th>寄件人电话</th>
											<th>收件人姓名</th>
											<th>收件人地址</th>
											<th>收件人电话</th>
											<th>寄件日期</th>
											
											<th>操作</th>

										</tr>
									</thead>
									<tbody>
										<c:if test="${pda.data!=null}">
								<c:forEach items="${pda.data}" var="order">
									<tr>
										<td>${order.ORDERNO}</td>
										<td>${order.SENDER}</td>
										<td>${order.SENDERADDRESS}</td>
										<td>${order.SENDERMOBILE}</td>
										<td>${order.RECEIVER}</td>
										<td>${order.RECEIVERADDRESS}</td>
										<td>${order.RECEIVERMOBILE}</td>
										<td>${order.ORDERDATE}</td>
										<td><button class="btn btn-success">修改</button> <a
											href="javascript:delFunction(${article.articleId})">
											<button
													class="btn btn-danger btnDel" value="${order.ORDERNO}"  >删除</button></a></td>
									</tr>


								</c:forEach>


							</c:if>
									</tbody>
									
								</table>

								<div class="col-md-12 column text-center">
						<ul class="pagination">
							<li><a href="javascript:void(0)" id="prePage">上一页</a></li>
							<%--注意这里   begin="1"  从1开始  end="${pd.totalPage}" 到几结束    var="index" 变量的值 --%>
							<c:forEach begin="1" end="${pda.totalPage}" var="index">
								<%--激活当前页码显示效果 --%>
								<c:if test="${index == pda.page}">
									<li class="active"><a href="javascript:void(0)"
										class="pageNo">${index}</a></li>
								</c:if>
								<c:if test="${index != pda.page}">
									<li><a href="javascript:void(0)" class="pageNo">${index}</a></li>
								</c:if>
							</c:forEach>
							<li><a href="javascript:void(0)" id="nextPage">下一页</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
						<!-- /col-lg-9 END SECTION MIDDLE -->

						<!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->

					</div>
					<! --/row -->
				</section>
			</section>

			<!--main content end-->
			<!--footer start-->
			
			<!--footer end-->
		</section>

		<!-- js placed at the end of the document so the pages load faster -->
		<script src="${pageContext.request.contextPath}/Assets/js/jquery.js"></script>
		<script src="${pageContext.request.contextPath}/Assets/js/jquery-1.8.3.min.js"></script>
		<script src="${pageContext.request.contextPath}/Assets/js/bootstrap.min.js"></script>
		<script class="include" type="text/javascript" src="${pageContext.request.contextPath}/Assets/js/jquery.dcjqaccordion.2.7.js"></script>
		<script src="${pageContext.request.contextPath}/Assets/js/jquery.scrollTo.min.js"></script>
		<script src="${pageContext.request.contextPath}/Assets/js/jquery.nicescroll.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/Assets/js/jquery.sparkline.js"></script>

		<!--common script for all pages-->
		<script src="${pageContext.request.contextPath}/Assets/js/common-scripts.js"></script>

		<script type="text/javascript" src="${pageContext.request.contextPath}/Assets/js/gritter/js/jquery.gritter.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/Assets/js/gritter-conf.js"></script>

		<!--script for this page-->
		<script src="${pageContext.request.contextPath}/Assets/js/sparkline-chart.js"></script>
		<script src="${pageContext.request.contextPath}/Assets/js/zabuto_calendar.js"></script>

		

		<!-- <script type="application/javascript">
			$(document).ready(function() {
				$("#date-popover").popover({
					html: true,
					trigger: "manual"
				});
				$("#date-popover").hide();
				$("#date-popover").click(function(e) {
					$(this).hide();
				});

				$("#my-calendar").zabuto_calendar({
					action: function() {
						return myDateFunction(this.id, false);
					},
					action_nav: function() {
						return myNavFunction(this.id);
					},
					ajax: {
						url: "show_data.php?action=1",
						modal: true
					},
					legend: [{
							type: "text",
							label: "Special event",
							badge: "00"
						},
						{
							type: "block",
							label: "Regular event",
						}
					]
				});
			});

			function myNavFunction(id) {
				$("#date-popover").hide();
				var nav = $("#" + id).data("navigation");
				var to = $("#" + id).data("to");
				console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
			}
		</script>
 -->
 
 
 
 <script type="text/javascript"
		src="https://cdn.bootcss.com/jquery/2.1.1/jquery.js"></script>
	<script>
		
		/* //原生js写的? 希望大家使用jQuery完成?
		function delFunction(articleId) {
			var flag = confirm("是否确定删除文章编号为" + articleId);
			if (flag) {
				location.href = "OrderController?op=del&articleId="
						+ articleId;

			}
		} */
		
		   $(function(){
			   
			   //如果当前页 已经是最后一页了
			   if(${pda.page >= pda.totalPage})
				   {
				   //下一页 样式设置
				   $("#nextPage").css("color","gray");
				   //pointer-events 不能点击了 ,没有测试所有的浏览器
				   $("#nextPage").css("pointer-events","none");
				   }
			   
			 //如果当前页 已经是第一页了
			   if(${pda.page <= 1})
			   {
				     //上一页 样式设置
			   $("#prePage").css("color","gray");
			   $("#prePage").css("pointer-events","none");
			   }
			   
			   
			   //分页页码点击
			   $(".pageNo").click(function(){
				   location.href = "OrderController?op=queryByPage&page=" + $(this).text()+"&orderLike="+$("#searchUserName").val();
			   });
			   
			   //下一页
			   $("#nextPage").click(function(){
				   
				   location.href = "OrderController?op=queryByPage&page=" + ${pda.page+1}+"&orderLike="+$("#searchUserName").val();
			   });
			   
			   //上一页
			   $("#prePage").click(function(){
				   location.href = "OrderController?op=queryByPage&page=" + ${pda.page-1}+"&orderLike="+$("#searchUserName").val();
			   });
			   
			   
			   
			   //处理模糊检索
			   $("#btnSearch").click(function(){
				   
				   //得到用户输入在文本框中的值
				   var orderLike = $("#searchUserName").val();
				   
				   location.href = "OrderController?op=queryByPage&orderLike="+orderLike;
				   
				   
			   });
			   
		   });
		
	</script>
 			
 			
 <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
	<script type="text/javascript">
 

	$(function  () {
			$(".btnDel").click(function  () {
				//alert($("#btnDel").val());
			var flag=confirm("是否确认删除");
			
			if(flag){
				//alert($(".btnDel").val());
		$.get("${pageContext.request.contextPath}/OrderController?op=deleteOrderNo","orderNo="+$(".btnDel").val(),
				function(data, status) {
					
			if(data=="true")
			{
			 alert("删除成功~");
			 
			
			   
			 location.reload(); 
			  
			}
		     else
			{
			alert("删除失败");
			//重新刷新页面
			
			}
			
			
			
				})
				
			}
			
				
			})
		})
	
	
	
	</script>
	</body>

</html>