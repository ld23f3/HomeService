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
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>

<script>
	$(function() {
	
		
		$("#sub").click(function(){
			
			// 序列化表單
			var params = $("#model_form").serialize();
			// 避免中文亂碼
			params = decodeURIComponent(params,true); 
			
			//console.log("資料:"+params);
			//console.log("資料:"+$("#model_form").serialize());
			$.post("FreightController?op=querycity",params, function(data, status) {
				
				$("#web_m").css(
						"display", "block");
				
				$("#price").text(data);
				$("#senderCity").text($("#CitySelect").val());			
				$("#receiverCity").text($("#CitySelect_").val());
				$("#totalWeight").text($("#weight").val());
				$("#price").text(data);
				
				console.log("data:"+data);
			});
		});
		
		
		
	});
	
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
					<li><a href="follow.jsp">货物追踪</a></li>
					<!-- <li class="news"><a href="">消息<span>12</span></a></li>-->
					<li class="now"><a href="count.jsp">运费试算</a></li>
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
						<li class="now"><em>运费试算</em><span>&nbsp;</span></li>
					</ul>
					<div class="tabCont" style="display: block;">
						<div class="book_m">
							<div class="space_hx">&nbsp;</div>

							<div class="space_hx">&nbsp;</div>
							<form role="form" id="model_form"
								action="FreightController?op=querycity" method="post">

								<div class="space_hx">&nbsp;</div>
								<ul class="xinxi">
									<li>发货城市
									 	<select id="ProvinceSelect" name="ProvinceSelect">
											<option>请选择省份</option>
										</select> 
										<select id="CitySelect" name="CitySelect">
											<option>请选择市級</option>
										</select> <!--<input type="text" required="required" class="wenben"
										name="bcity" id="bcity" placeholder="请输入城市名" />-->
									</li>
									<li>到达城市 
										<select id="ProvinceSelect_" name="ProvinceSelect_">
											<option>请选择省份</option>
										</select> 
										<select id="CitySelect_" name="CitySelect_">
											<option>请选择市級</option>
										</select> 
										<!--<input id="ocity" name="ocity" type="text"
										class="wenben" placeholder="请输入城市名">-->
									</li>

									<li>货物數量 <input id="number" name="number" type="number"
										class="wenben"> 件
									</li>

									<li>货物重量 <input id="weight" name="weight" type="text"
										class="wenben">kg
									</li>
								</ul>
								<div class="space_hx">&nbsp;</div>

								<div class="space_hx">&nbsp;</div>

								<div class="xiadan_btn">
									<a href="#" id="sub" class="sub">运费试算</a>

								</div>
							</form>
						</div>
					</div>
					<div id="web_m" class="web_m" style="display: none">
						<table class="wang" cellpadding="0" cellspacing="0">
							<tr>
								<th width="70" scope="col">发货城市</th>
								<th width="380" scope="col">到达城市</th>
								<th width="100" scope="col">計費重量</th>
								<th width="450" scope="col">運費</th>

							</tr>
							<tr>
								<td id="senderCity">201800001</td>
								<td id="receiverCity">北京昌平区百善镇善缘嘉园北门</td>
								<td id="totalWeight">王小明</td>
								<td id="price"></td>
							</tr>

						</table>

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
				<a href="">业务介绍</a> <a href="">联系我们</a>
			</div>
			<div class="copy">Copyright&copy;&nbsp;2012-2015&nbsp;
				宅急送有限责任公司.&nbsp;&nbsp;All&nbsp;&nbsp;rights&nbsp;&nbsp;reserved.
				&nbsp;&nbsp;粤ICP备10005645</div>
		</div>
	</div>
	<!--底部-->
	<script>

	//省遍历
	$(function() {
		//这里也需要绝对入经
		$.get("${pageContext.request.contextPath}/ProvinceController?op=queryProvince",
				function(data, status) {
					//把字符串变成数组用JSON.parse
					array = JSON.parse(data);
					//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
					$.each(array, function(index, Province) {
						
						//console.log(Province.PROVINCEID + "," + Province.PROVINCENAME)
						//append拼接
						$("#ProvinceSelect").append(
								"<option value="+Province.PROVINCEID+">"
										+ Province.PROVINCENAME + "</option>")
					});
				});
	});
	//省遍历结束	
	//当点击省时把参数传到市
		$(function  () {
			$("#ProvinceSelect").change(function  () {
					//alert($("#ProvinceSelect").val());
					$("#CitySelect").empty();
					$("#CitySelect").append("<option>-请选择市级-</option>");
					//这里也需要绝对入经
					$.get("${pageContext.request.contextPath}/ProvinceController?op=queryCity","ProvinceId="+$("#ProvinceSelect").val(),
					function(data, status) {
					//清空 city的options列表 ,保留一个 请选择
						
					//	$(".CityId").options.length = 1;
					
						//把字符串变成数组用JSON.parse
						array = JSON.parse(data);
						//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
						$.each(array, function(index, City) {
							
							//console.log(City.CITYID + "," + City.CITYNAME)
							$("#CitySelect").append(
									"<option value="+City.CITYID+">"
											+ City.CITYNAME + "</option>")
						});
					});
									
				});
			});
		//当点击省时把参数传到市
		
		//省遍历
	$(function() {
		//这里也需要绝对入经
		$.get("${pageContext.request.contextPath}/ProvinceController?op=queryProvince",
				function(data, status) {
					//把字符串变成数组用JSON.parse
					array = JSON.parse(data);
					//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
					$.each(array, function(index, Province) {
						
						//console.log(Province.PROVINCEID + "," + Province.PROVINCENAME)
						//append拼接
						$("#ProvinceSelect_").append(
								"<option value="+Province.PROVINCEID+">"
										+ Province.PROVINCENAME + "</option>")
					});
				});
	});
	//省遍历结束	
	//当点击省时把参数传到市
		$(function  () {
			$("#ProvinceSelect_").change(function  () {
					//alert($("#ProvinceSelect").val());
					$("#CitySelect_").empty();
					$("#CitySelect_").append("<option>-请选择市级-</option>");
					//这里也需要绝对入经
					$.get("${pageContext.request.contextPath}/ProvinceController?op=queryCity","ProvinceId="+$("#ProvinceSelect_").val(),
					function(data, status) {
					//清空 city的options列表 ,保留一个 请选择
						
					//	$(".CityId").options.length = 1;
					
						//把字符串变成数组用JSON.parse
						array = JSON.parse(data);
						//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
						$.each(array, function(index, City) {
							
							//console.log(City.CITYID + "," + City.CITYNAME)
							$("#CitySelect_").append(
									"<option value="+City.CITYID+">"
											+ City.CITYNAME + "</option>")
						});
					});
									
				});
			});
		//当点击省时把参数传到市

	</script>

</body>




</html>