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
						<li class="now">
							<a href="index.jsp">首页</a>
						</li>
						<li>
							<a href="search.jsp">订单查询</a>
						</li>
						<li>
							<a href="search.jsp">货物追踪</a>
						</li>
						<!-- <li class="news"><a href="">消息<span>12</span></a></li>-->
						<li>
							<a href="index.jsp">运费试算</a>
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
							<li class="now"><em>网上下单</em><span>&nbsp;</span></li>
						</ul>
						<div class="tabCont" style="display:block;">
							<div class="book_m">
								<div class="space_hx">&nbsp;</div>
								<div class="shunxu">
									<img src="Assets/images/icon6.jpg" alt="" />
								</div>
								<div class="space_hx">&nbsp;</div>
								<form action="" method="post">

									<div class="space_hx">&nbsp;</div>
									<ul class="xinxi">
										<li>
											货物數量
											<input name="" type="text" class="wenben"> 件
										</li>
						
										<li>
											货物類型
											<input name="" type="text" class="wenben"> 
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
												<li>
													<span>
                                    	<i>&nbsp;</i>
                                       寄件人
                                    </span>
													<input name="" type="text">
												</li>
												<li>
													<span>
										<i>&nbsp;</i>
                                        手机
                                    </span>
													<input name="" type="text">
												</li>

												<li>
													<span>
                                    	<i>&nbsp;</i>
                                        发货地址
                                    </span>

												<select name="">
														<option>请选择省份</option>
														<option value="volvo">福建省</option>
														<option value="volvo">廣東省</option>
														<option value="volvo">浙江省</option>
														<option value="volvo">安徽省</option>
													</select>
													<select name="">
													<option>请选择市級</option>
													<option value="volvo">廈門市</option>
													<option value="volvo">漳州市</option>
													<option value="volvo">北京市</option>						
													</select>
													<select name="">
													<option>请选择县/区</option>
													<option value="volvo">湖里區</option>
													<option value="volvo">思明區</option>
													</select>
													<input name="" type="text" placeholder="请输入详细地址">
												</li>
											</ul>
										</div>
										<!--发货人信息-->

										<!--收货人信息-->
										<div class="txxx_r">
											<div class="txxx_h">
												<span>收货人信息</span>
											</div>
											<ul>
												<li>
													<span>
                                    	<i>&nbsp;</i>
                                        收货人
                                    </span>
													<input name="" type="text">
												</li>
												<li>
													<span>
									<i>&nbsp;</i>
                                        手机
                                    </span>
		
													<input name="" type="text">
													
												</li>
												<li>
													<span>
                                    	<i>&nbsp;</i>
                                        收货地址
                                    </span>
													<select name="">
														<option>请选择省份</option>
														<option value="volvo">福建省</option>
														<option value="volvo">廣東省</option>
														<option value="volvo">浙江省</option>
														<option value="volvo">安徽省</option>
													</select>
													<select name="">
													<option>请选择市級</option>
													<option value="volvo">廈門市</option>
													<option value="volvo">漳州市</option>
													<option value="volvo">北京市</option>						
													</select>
													<select name="">
													<option>请选择县/区</option>
													<option value="volvo">湖里區</option>
													<option value="volvo">思明區</option>
													</select>
													<input name="" type="text" placeholder="请输入详细地址">
												</li>
											</ul>
										</div>
										<!--收货人信息-->
									</div>
									<div class="space_hx">&nbsp;</div>
									<div class="tiaok">
										<span><input name="" type="checkbox" value="" checked>统一服务条款</span>
										<textarea name="" cols="" rows="">
1.托运人应准确填写本单，如实告知承运人所托运货物的名称、性质、重量、数量、价值等必要情况；托与人应对所托运获取按照行业标准妥善包装，使其适合运输.
2.托运人应准确填写本单，如实告知承运人所托运货物的名称、性质、重量、数量、价值等必要情况；托与人应对所托运获取按照行业标准妥善包装，使其适合运输.
3.托运人应准确填写本单，如实告知承运人所托运货物的名称、性质、重量、数量、价值等必要情况；托与人应对所托运获取按照行业标准妥善包装，使其适合运输.
4.托运人应准确填写本单，如实告知承运人所托运货物的名称、性质、重量、数量、价值等必要情况；托与人应对所托运获取按照行业标准妥善包装，使其适合运输.
                        </textarea>
									</div>
									<div class="space_hx">&nbsp;</div>
									<div class="xiadan_btn">
										<a href="" class="sub">立刻下单</a>
										<a href="" class="qux">取消</a>
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