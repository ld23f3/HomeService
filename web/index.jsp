<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>宅急送</title>
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/common.css" />
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="Assets/css/index.css" />
<link rel="shortcut icon" href="Assets/images/bitbug_favicon.ico"/>
<!--騰訊地圖-->
<script charset="utf-8" src="http://map.qq.com/api/js?v=2.exp"></script>
<!--騰訊地圖-->
<!--幻灯片-->
<link rel="stylesheet" type="text/css"
	href="Assets/plugins/banner/css/goodnav.css">
<script type="text/javascript"
	src="Assets/plugins/banner/js/jquery.litenav.js"></script>
<!--幻灯片-->
<!--網點搜尋 -->
<script type="text/javascript">
	var map, marker = null;
	var citylocation, markers = [];
	var i = 0;

	$(function() {

		// 取得省數據資料
		$.get("BranchController?op=query", function(data, status) {
			console.log(data);
			// 將返回的json轉換為數組
			var array = JSON.parse(data);

			// 遍歷數組
			$.each(array, function(index, provice) {

				var name = provice.PROVINCENAME;

				var tn = '<li><a href="#" onclick="getCity('
						+ provice.PROVINCEID + '\,\'' + name + '\');">'
						+ provice.PROVINCENAME + '</a></li>';
				$("#showProviceUl").append(tn);

			});
		});

		// 獲取焦點時
		$("#provinceChoose").focus(
				function() {

					console.log("i=" + i);
					i++;
					if (i % 2 == 0) {
						$(this).parents(".tabCont").find(".showProvice").css(
								"display", "none");
					} else {

						console.log("點到了");
						$(this).parents(".tabCont").find(".showProvice").css(
								"display", "block");

					}

				});

		$("#provinceChoose").click(
				function() {

					i++;
					console.log("i=" + i);
					if (i % 2 == 0) {
						$(this).parents(".tabCont").find(".showProvice").css(
								"display", "none");
					} else {

						console.log("點到了");
						$(this).parents(".tabCont").find(".showProvice").css(
								"display", "block");

					}
				});

	});

	var init = function() {
		var center = new qq.maps.LatLng(39.916527, 116.397128);
		var city = document.getElementById("city");
		map = new qq.maps.Map(document.getElementById('container'), {
			center : center,
			zoom : 10
		});

		citylocation = new qq.maps.CityService();
	}

	function getCity(PROVICEID, PROVICENAME) {

		$("#provinceChoose").val(PROVICENAME);
		console.log(PROVICEID);
		clearOverlays(markers);
		if (parseInt(PROVICEID) < 5) {

			citylocation.searchCityByName(PROVICENAME);
			citylocation = new qq.maps.CityService({

				//检索成功的回调函数
				complete : function(results) {
					//设置回调函数参数
					//var pois = results.detail.pois;
					//for (var i = 0, l = pois.length; i < l; i++) {
					//var poi = pois[i];
					//扩展边界范围，用来包含搜索到的Poi点
					//latlngBounds.extend(results.detail.latLng);
					$("#container").css("display", "block");

					$(".showProvice").css("display", "none");
					clearOverlays(markers);
					map.setCenter(results.detail.latLng);

					console.log(PROVICENAME + "座標:" + results.detail.latLng);
					var marker = new qq.maps.Marker({
						map : map,
						position : results.detail.latLng
					});
	
					//marker.setTitle(i + 1);
					markers.push(marker);
					//}
					//调整地图视野
					//map.fitBounds(latlngBounds);
				},
				//若服务请求失败，则运行以下函数
				error : function() {
					//alert("出错了。");
					console.log("查不到" + citylocation);
				}
			});

		} else {

			// 取得省數據資料
			$.post("BranchController?op=queryCityByPro", "PROVICEID="
					+ PROVICEID, function(data, status) {

				// 將返回的json轉換為數組
				var array = JSON.parse(data);
				console.log("array.length" + array.length);

				$("#container").css("display", "block");

				$(".showProvice").css("display", "none");

				clearOverlays(markers);
				// 遍歷數組
				$.each(array, function(index, city) {
					//$("#showProviceUl").append("<li value="+provice.PROVINCEID+"><a href='#' onclick='geolocation_localcity()'>"+provice.PROVINCENAME+"</a></li>");				
					//console.log(city.CITYID+":"+city.CITYNAME);
					//geolocation_localcity(city.CITYNAME);
					citylocation.searchCityByName(city.CITYNAME);
					citylocation = new qq.maps.CityService({

						//检索成功的回调函数
						complete : function(results) {
							//设置回调函数参数
							//var pois = results.detail.pois;
							//for (var i = 0, l = pois.length; i < l; i++) {
							//var poi = pois[i];
							//扩展边界范围，用来包含搜索到的Poi点
							//latlngBounds.extend(results.detail.latLng);

							if (index == 0) {
								map.setCenter(results.detail.latLng);
							}

							console.log(city.CITYNAME + "座標:"
									+ results.detail.latLng);
							var marker = new qq.maps.Marker({
								map : map,
								position : results.detail.latLng
							});
							//marker.setTitle(i + 1);
							markers.push(marker);
							//}
							//调整地图视野
							//map.fitBounds(latlngBounds);
						},
						//若服务请求失败，则运行以下函数
						error : function() {
							//alert("出错了。");
							console.log("查不到" + citylocation);
						}
					});

				});

			});
		}

		//清除地图上的marker
		function clearOverlays(overlays) {
			var overlay;
			while (overlay = overlays.pop()) {
				overlay.setMap(null);
			}
		}

	}
</script>
</head>

<body onload="init()">
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
					<li class="now"><a href="index.jsp">首页</a></li>
					<li><a href="search.jsp">订单查询</a></li>
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
		<!--盒子1-->
		<div class="box_1 clearfix">
			<div class="box_1_l">
				<a href="book.jsp">我要寄件<img src="Assets/images/icon2.png" /></a> <a
					href="follow.jsp" class="a_2">货物追踪<img
					src="Assets/images/icon2.png" /></a>
			</div>
			<div class="banner">
				<!-- 代码 开始 -->
				<div id="hotpic">
					<div id="NewsPic">
						<a target="_blank" href=""
							style="visibility: visible; display: block;"> <img
							src="Assets/upload/banner.jpg" class="Picture" alt="" /></a> <a
							style="visibility: hidden; display: none;" target="_blank"
							href=""> <img src="Assets/upload/banner2.jpg" class="Picture"
							alt="" /></a> <a style="visibility: hidden; display: none;"
							target="_blank" href=""> <img src="Assets/upload/banner3.jpg"
							class="Picture" alt="" /></a> <a
							style="visibility: hidden; display: none;" target="_blank"
							href=""> <img src="Assets/upload/banner4.jpg" class="Picture"
							alt="" /></a> <a style="visibility: hidden; display: none;"
							target="_blank" href=""> <img src="Assets/upload/banner5.jpg"
							class="Picture" alt="" /></a> <a
							style="visibility: hidden; display: none;" target="_blank"
							href=""> <img src="Assets/upload/banner6.jpg" class="Picture"
							alt="" /></a>
						<div class="Nav">
							<span class="Normal">6</span> <span class="Normal">5</span> <span
								class="Normal">4</span> <span class="Normal">3</span> <span
								class="Normal">2</span> <span class="Cur">1</span>
						</div>
					</div>
				</div>
				<script type="text/javascript">
					$('#hotpic').liteNav(5000);
				</script>
				<!-- 代码 结束 -->
			</div>
		</div>
		<!--盒子1-->
		<div class="space_hx">&nbsp;</div>
		<!--盒子2-->
		<div class="box_2">
			<div class="tabBox_t">
				<div class="tabBox">
					<ul class="tabNav">
						<li class="now">网点查询</li>

					</ul>
					<form action="" method="post">
						<div class="tabCont" style="display: block">
							<div class="ctn">
								<span>网点查询</span> <input id="provinceChoose"
									name="provinceChoose" readonly="true" type="text"
									placeholder="请选择省分名称">
							</div>

							<div id="showProvice" class="showProvice">
								<ul id="showProviceUl">

								</ul>
							</div>
						</div>
				</div>
				</form>
			</div>
		</div>
		<br>
		<div style="width: 100%; height: 300px; display: none" id="container"></div>
	</div>

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
</body>
</html>