<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="Dashboard">
		<meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

		<title>宅急送快遞員派件管理</title>

		<!-- Bootstrap core CSS -->
		<link href="${pageContext.request.contextPath}/Assets/css/bootstrap.css"rel="stylesheet">
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
				<a href="index.html" class="logo"><b>宅急送快遞員派件管理</b></a>
				<!--logo end-->
				<div class="nav notify-row" id="top_menu">
					<!--  notification start -->

				</div>
				<div class="top-menu">
					<ul class="nav pull-right top-menu">
						<li><a class="logout"
				href="${pageContext.request.contextPath}/Back/courierlogin.jsp">退出登陆</a></li>
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
				<a href="profile.html"><img
					src="${pageContext.request.contextPath}/Assets/img/ui-sam.jpg"
					class="img-circle" width="60"></a>
			</p>
			<h5 class="centered">宅急送</h5>

			<li class="sub-menu"><a class="hover"
				href="${pageContext.request.contextPath}/CourierController?op=queryOrderByPage0">
					<i class="fa fa-dashboard"></i> <span>未揽收</span>
			</a></li>

			<li class="sub-menu"><a class="hover"
				href="${pageContext.request.contextPath}/CourierController?op=queryOrderByPage1">
					<i class="fa fa-desktop"></i> <span>已揽收</span>
			</a></li>

			<li class="sub-menu"><a class="hover"
				href="${pageContext.request.contextPath}/CourierController?op=queryOrderByPage2">
					<i class="fa fa-cogs"></i> <span>未派件</span>
			</a></li>

			<li class="sub-menu"><a class="hover"
				href="${pageContext.request.contextPath}/CourierController?op=queryOrderByPage3"> <i
					class="fa fa-desktop"></i> <span>已派件</span>
			</a></li>

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
						<form action="${pageContext.request.contextPath}/CourierController?op=upcollectinfo" method="post" ">

							<div class="table-responsive">
								<table class="table table-striped">
									<thead>
										<tr>
											<th>
												<div class="sub-header">详细信息</div>
											</th>
										</tr>
									</thead>
								</table>
								<table class="table table-striped">
									<thead>
										<tr>
											<th>
												<div class=wrap>
													<div class="infbox1">
														<ul>
															<li>
																<label>订单编号</label><input name="orderNo" type="text" id="orderNo" value="${ob.ORDERNO}" autofocus>
															</li>
															</br>
															<li>
																<label>寄件人地址</label><input name="senderAddress" type="text" value="${ob.SENDERADDRESS}" >
															</li>
															</br>
															<li>
																<label>收件人姓名</label><input name="recriver" id="recriver" type="text" value="${ob.RECEIVER}" >
															</li>
															</br>
															<li>
																<label>收件人电话</label><input name="receiverMobile" id="receiverMobile" type="text" value="${ob.RECEIVERMOBILE}" >
															</li>
															</br>
															<li>
																<label>重量(kg)</label><input name="goodsWeight" id="goodsWeight" type="text" value="${ob.GOODSWEIGHT}" >
															</li>
															<li>
																<label>状态</label>
																<select name="orderStatus" id="orderStatus">
																	<option value="0">未揽件</option>
																	<option value="1">已揽件</option>
																</select>
															</li>
														</ul>
													</div>
													<div class="infbox2">
														<ul>
															<li>
																<label>寄件人姓名</label><input name="sender" id="sender" type="text"  value="${ob.SENDER}">
															</li>
															</br>
															<li>
																<label>寄件人电话</label><input name="senderMobile" id="senderMobile" type="text" value="${ob.SENDERMOBILE}">
															</li>
															</br>
															<li>
																<label>收件人地址</label><input name="receiverAddress" id="receiverAddress" type="text" value="${ob.RECEIVERADDRESS}">
															</li>
															</br>
															<li>
																<label>寄件日期</label><input name="orderDate" id="orderDate" type="text" value="${ob.ORDERDATE}">
															</li>
															</br>
															<li>
																<label>价格(元)</label><input name="goodsPrice" id="goodsPrice" type="text" value="${ob.GOODSPRICE}">
															</li>
														</ul>
													</div>

												</div>
											</th>
										</tr>
									</thead>
								</table>
								<table class="table table-striped">
									<thead>
										<tr>
											<th>
												<div class=wrap2>
												<button class="btn btn-theme btn-block2" href="index.html" type="submit">修改</button>
												<button class="btn btn-theme btn-block2" href="index.html" type="button">取消</button>
												</div>
											</th>
										</tr>
									</thead>
								</table>

							</div>
							</form>

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

		<script type="application/javascript">
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

	</body>

</html>