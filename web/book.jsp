<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>网上下订单</title>
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
					<a href="">加入收藏</a>
				</div>
				<ul class="clearfix">
					<li class="now"><a href="index.jsp">首页</a></li>
					<li><a href="search.jsp">订单查询</a></li>
					<li><a href="search.jsp">货物追踪</a></li>
					<!-- <li class="news"><a href="">消息<span>12</span></a></li>-->
					<li><a href="index.jsp">运费试算</a></li>
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
						<li class="now"><em>网上下单</em><span>&nbsp;</span></li>
					</ul>
					<div class="tabCont" style="display: block;">
						<div class="book_m">
							<div class="space_hx">&nbsp;</div>
							<div class="shunxu">
								<img src="Assets/images/icon6.jpg" alt="" />
							</div>
							<div class="space_hx">&nbsp;</div>
							
							<form id="model_form" action="${pageContext.request.contextPath}/UserController?op=addOrder" method="post">

								<div class="space_hx">&nbsp;</div>
								<ul class="xinxi">
									<li>货物数量 <input name="GOODSNUMBER" type="text" class="wenben">
										件
									</li>

									<li>货物类型 <input name="GOODSTYPE" type="text" class="wenben">
									</li>
									
									<li>货物重量 <input name="GOODSWEIGHT" type="text" class="wenben">kg
									</li>
									<div class="space_hx">&nbsp;</div>

									<div class="space_hx">&nbsp;</div>
									<div class="txxx clearfix">
										<!--发货人信息-->
										<div class="txxx_l">
											<div class="txxx_h">
												<span>寄件人信息</span>
											</div>
											<ul>
												<li><span> <i>&nbsp;</i> 寄件人
												</span> <input name="SENDER" type="text" class="SENDER"></li>
												<li><span> <i>&nbsp;</i> 手机
												</span> <input name="SENDERMOBILE" type="text" class="SENDERMOBILE"></li>

												<li><span> <i>&nbsp;</i> 发货地址
												</span> <select name="ProvinceId"  class="ProvinceId">
														<option>请选择省份</option>
														<!-- <option value="volvo">福建省</option>
														<option value="volvo">廣東省</option>
														<option value="volvo">浙江省</option>
														<option value="volvo">安徽省</option> -->
												</select> 
												<select name="CityId"  class="CityId">
														<option>请选择市級</option>
														<!-- <option value="volvo">廈門市</option>
														<option value="volvo">漳州市</option>
														<option value="volvo">北京市</option> -->
												</select> 
												<select name="CountyId"  class="CountyId">
														<option>请选择县/区</option>
													<!--<option value="volvo">湖里區</option>
														<option value="volvo">思明區</option> -->
												</select> 
												<input name="SENDERADDRESS" class="SENDERADDRESS" type="text" placeholder="请输入详细地址"></li>
											</ul>
										</div>
										<!--发货人信息-->

										<!--收货人信息-->
										<div class="txxx_r">
											<div class="txxx_h">
												<span>收货人信息</span>
											</div>
											<ul>
												<li><span> <i>&nbsp;</i> 收货人
												</span> <input name="RECEIVER" type="text" class="RECEIVER"></li>
												<li><span> <i>&nbsp;</i> 手机
												</span> <input name="RECEIVERMOBILE" type="text" class="RECEIVERMOBILE"></li>
												<li><span> <i>&nbsp;</i> 收货地址
												</span> 
												<select name="ReciveProvinceId"  class="ReciveProvinceId" id="ReciveProvinceId">
														<option>请选择省份</option>
														<!-- <option value="volvo">福建省</option>
														<option value="volvo">廣東省</option>
														<option value="volvo">浙江省</option>
														<option value="volvo">安徽省</option> -->
												</select> 
												<select name="ReciveCityId"  class="ReciveCityId" >
														<option>请选择市級</option>
														<!-- <option value="volvo">廈門市</option>
														<option value="volvo">漳州市</option>
														<option value="volvo">北京市</option> -->
												</select> 
												<select name="RecivCountyId"  class="RecivCountyId"  >
														<option>请选择县/区</option>
														<!-- <option value="volvo">湖里區</option>
														<option value="volvo">思明區</option> -->
												</select> <input name="RECEIVERADDRESS" type="text" class="RECEIVERADDRESS" placeholder="请输入详细地址"></li>
											</ul>
										</div>
										<!--收货人信息-->
									</div>
									<div class="space_hx">&nbsp;</div>
									<div class="tiaok">
										<span><input name="agreecheckbox" id="agreecheckbox" class="agreecheckbox" type="checkbox" value="" checked>统一服务条款</span>
										<textarea name="" cols="" rows="">
1.托运人应准确填写本单，如实告知承运人所托运货物的名称、性质、重量、数量、价值等必要情况；托与人应对所托运获取按照行业标准妥善包装，使其适合运输.
2.托运人应准确填写本单，如实告知承运人所托运货物的名称、性质、重量、数量、价值等必要情况；托与人应对所托运获取按照行业标准妥善包装，使其适合运输.
3.托运人应准确填写本单，如实告知承运人所托运货物的名称、性质、重量、数量、价值等必要情况；托与人应对所托运获取按照行业标准妥善包装，使其适合运输.
4.托运人应准确填写本单，如实告知承运人所托运货物的名称、性质、重量、数量、价值等必要情况；托与人应对所托运获取按照行业标准妥善包装，使其适合运输.
                        </textarea>
									</div>
									<div class="space_hx">&nbsp;</div>
									<div class="xiadan_btn">
										<!-- <a href="" class="sub">立刻下单</a> <a href="" class="qux">取消</a> -->
										<button type="button" class="sub">提交</button>
										<button type="button" class="qux">取消</button>
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
				<a href="">业务介绍</a> <a href="">联系我们</a>
			</div>
			<div class="copy">Copyright&copy;&nbsp;2012-2015&nbsp;
				宅急送有限责任公司.&nbsp;&nbsp;All&nbsp;&nbsp;rights&nbsp;&nbsp;reserved.
				&nbsp;&nbsp;粤ICP备10005645</div>
		</div>
	</div>
	<!--底部-->
	
	
	
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
	<script type="text/javascript">
	//省遍历
		$(function() {
			//这里也需要绝对入经
			$.get("${pageContext.request.contextPath}/UserController?op=queryProvince",
					function(data, status) {
						//把字符串变成数组用JSON.parse
						array = JSON.parse(data);
						//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
						$.each(array, function(index, Province) {
							
							//console.log(Province.PROVINCEID + "," + Province.PROVINCENAME)
							//append拼接
							$(".ProvinceId").append(
									"<option value="+Province.PROVINCEID+">"
											+ Province.PROVINCENAME + "</option>")
						});
					})
		})
	//省遍历结束	
		
		
		
	//当点击省时把参数传到市
		$(function  () {
				$(".ProvinceId").change(function  () {
					//alert($("#ProvinceId").val());
					$(".CityId").empty();
					$(".CityId").append("<option>-请选择市级-</option>");
					//这里也需要绝对入经
			$.get("${pageContext.request.contextPath}/UserController?op=queryCity","ProvinceId="+$(".ProvinceId").val(),
					function(data, status) {
					//清空 city的options列表 ,保留一个 请选择
						
					//	$(".CityId").options.length = 1;
					
						//把字符串变成数组用JSON.parse
						array = JSON.parse(data);
						//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
						$.each(array, function(index, City) {
							
							//console.log(City.CITYID + "," + City.CITYNAME)
							$(".CityId").append(
									"<option value="+City.CITYID+">"
											+ City.CITYNAME + "</option>")
						});
					})
					
					
					
					
				})
			})
		//当点击省时把参数传到市
		
	
		//当点击市时把参数传到区
		
		$(function  () {
				$(".CityId").change(function  () {
					//alert($("#CityId").val());
					//这里也需要绝对入经
					$(".CountyId").empty();
					$(".CountyId").append("<option>-请选择区级-</option>");
			$.get("${pageContext.request.contextPath}/UserController?op=queryCounty","CityId="+$(".CityId").val(),
					function(data, status) {
						//把字符串变成数组用JSON.parse
						array = JSON.parse(data);
						//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
						$.each(array, function(index, County) {
							
							//console.log(County.COUNTYID + "," + County.COUNTYNAME)
							//append拼接
							$(".CountyId").append(
									"<option value="+County.COUNTYID+">"
											+ County.COUNTYNAME + "</option>")
						});
					})
					
					
					
					
				})
			})
			//结束当点击市时把参数传到区
		
			
			
		
			//收件人的省市区
			
			
			
			//省遍历
		$(function() {
			//这里也需要绝对入经
			$.get("${pageContext.request.contextPath}/UserController?op=queryProvince",
					function(data, status) {
						//把字符串变成数组用JSON.parse
						array = JSON.parse(data);
						//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
						$.each(array, function(index, Province) {
							
							//console.log(Province.PROVINCEID + "," + Province.PROVINCENAME)
							//append拼接
							$(".ReciveProvinceId").append(
									"<option value="+Province.PROVINCEID+">"
											+ Province.PROVINCENAME + "</option>")
						});
					})
		})
	//省遍历结束	
			
		
		
			//当点击省时把参数传到市
		$(function  () {
				$(".ReciveProvinceId").change(function  () {
					//alert($("#ProvinceId").val());
					$(".ReciveCityId").empty();
					$(".ReciveCityId").append("<option>-请选择市级-</option>");
					//这里也需要绝对入经
			$.get("${pageContext.request.contextPath}/UserController?op=queryCity","ProvinceId="+$(".ReciveProvinceId").val(),
					function(data, status) {
					//清空 city的options列表 ,保留一个 请选择
						
					//	$(".CityId").options.length = 1;
					
						//把字符串变成数组用JSON.parse
						array = JSON.parse(data);
						//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
						$.each(array, function(index, City) {
							
							//console.log(City.CITYID + "," + City.CITYNAME)
							$(".ReciveCityId").append(
									"<option value="+City.CITYID+">"
											+ City.CITYNAME + "</option>")
						});
					})
					
					
					
					
				})
			})
		//当点击省时把参数传到市
		
	
		//当点击市时把参数传到区
		
		$(function  () {
				$(".ReciveCityId").change(function  () {
					//alert($("#CityId").val());
					//这里也需要绝对入经
					$(".RecivCountyId").empty();
					$(".RecivCountyId").append("<option>-请选择区级-</option>");
			$.get("${pageContext.request.contextPath}/UserController?op=queryCounty","CityId="+$(".ReciveCityId").val(),
					function(data, status) {
						//把字符串变成数组用JSON.parse
						array = JSON.parse(data);
						//index是数组的小标从0开始的 dept好像是data数组只是给他重新命名
						$.each(array, function(index, County) {
							
							//console.log(County.COUNTYID + "," + County.COUNTYNAME)
							//append拼接
							$(".RecivCountyId").append(
									"<option value="+County.COUNTYID+">"
											+ County.COUNTYNAME + "</option>")
						});
					})
					
					
					
					
				})
			})
			//结束当点击市时把参数传到区
			
			
			
			//buttun单击事件   通过params可以传表单里面的所有属性
			
		$(function  () {
			
				$(".sub").click(function  () {
					
					
				var params = $("#model_form").serialize();
					
					//避免无法中文乱码
				params = decodeURIComponent(params,true);
				
				//console.log("data= "+params);
			  $.post("${pageContext.request.contextPath}/UserController?op=addOrder",params,
					function(data, status) {
				
				//尝试获取status data
				//console.log("status"+status+",data :"+data);
				
				if(data=="true")
				{
				 alert("下单成功~");
				 
				
				   
				location.href = "index.jsp";
				  
				}
			     else
				{
				alert("下单失败,请填写完成信息");
				//重新刷新页面
				location.reload(); 
				}
				
				
						
					})   
						 
					
				})
			})
			
		
		
	//这段是判断服务是否勾上。如果没有勾上提交按不了
	$("#agreecheckbox").click(function(){
		//对象.prop("");  对象.attr("");
		//console.log($(this).prop("checked"));
		$(".sub").attr("disabled",!$(this).prop("checked"));
	});
	
		
		
	</script>
	
	
</body>

</html>