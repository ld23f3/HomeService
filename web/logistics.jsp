<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="Dashboard">
		<meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

		<title>DASHGUM - FREE Bootstrap Admin Template</title>

		<!-- Bootstrap core CSS -->
		<link href="Assets/css/bootstrap.css" rel="stylesheet">
		<!--external css-->
		<link href="Assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="Assets/css/zabuto_calendar.css">
		<link rel="stylesheet" type="text/css" href="Assets/js/gritter/css/jquery.gritter.css" />
		<link rel="stylesheet" type="text/css" href="Assets/lineicons/style.css">

		<!-- Custom styles for this template -->
		<link href="Assets/css/style.css" rel="stylesheet">
		<link href="Assets/css/style-responsive.css" rel="stylesheet">

		<script src="Assets/js/chart-master/Chart.js"></script>
		<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
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
					
					<!--  notification end -->
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
							<a href="profile.html"><img src="Assets/img/ui-sam.jpg" class="img-circle" width="60"></a>
						</p>
						<h5 class="centered">宅急送</h5>

						<li class="mt">
							<a class="hover" href="order.html">
								<i class="fa fa-dashboard"></i>
								<span>订单管理</span>
							</a>
						</li>

						<li class="sub-menu">
							<a class="hover" href="Courier.html">
								<i class="fa fa-desktop"></i>
								<span>快递员管理</span>
							</a>

						</li>

						<li class="sub-menu">
							<a class="hover" href="javascript:;">
								<i class="fa fa-cogs"></i>
								<span>物流查询</span>
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
							<form class="navbar-form navbar-left">
								<input type="text" class="form-control" name="orderNo" id="orderNo" 
										placeholder="请输入订单编号">
								<input type="button" name="" id="btnSearch" value="搜索" />
							</form>
							<div class="table-responsive">
								<table class="table table-striped">
									<thead>
										<tr>
											<th>订单编号</th>
											<th>省</th>
											<th>市</th>
											<th>县/区</th>
											<th>更新时间</th>
											

										</tr>
									</thead>
									<tbody>
										<c:if test="${logistics!=null}">
										<c:forEach items="${logistics}" var="log">
										
											<tr>
													<td>${log.ORDERNO}</td>
													<td>${log.PROVINCEID}</td>
													<td>${log.CITYID}</td>
													<td>${log.COUNTYID}</td>
													<td>33</td>
												

											</tr>
										</c:forEach>
									</c:if>
									</tbody>

								</table>

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
		<script src="Assets/js/jquery.js"></script>
		<script src="Assets/js/jquery-1.8.3.min.js"></script>
		<script src="Assets/js/bootstrap.min.js"></script>
		<script class="include" type="text/javascript" src="Assets/js/jquery.dcjqaccordion.2.7.js"></script>
		<script src="Assets/js/jquery.scrollTo.min.js"></script>
		<script src="Assets/js/jquery.nicescroll.js" type="text/javascript"></script>
		<script src="Assets/js/jquery.sparkline.js"></script>

		<!--common script for all pages-->
		<script src="Assets/js/common-scripts.js"></script>

		<script type="text/javascript" src="Assets/js/gritter/js/jquery.gritter.js"></script>
		<script type="text/javascript" src="Assets/js/gritter-conf.js"></script>

		<!--script for this page-->
		<script src="Assets/js/sparkline-chart.js"></script>
		<script src="Assets/js/zabuto_calendar.js"></script>

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
		</script> -->
		<script>
		$(function() {
			$("#btnSearch").click(function() {
				var orderNo = $("#orderNo").val();
				//点击查询按钮后，页面跳转到"LogisticsController?op=get&orderNo=" + orderNo
				location.href = "LogisticsController2?op=query&orderNo=" + orderNo;
			});
		});
	</script>

	</body>

</html>