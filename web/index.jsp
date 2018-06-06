<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>宅急送</title>
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css"/>
<link rel="stylesheet" type="text/css" href="Assets/css/common.css"/>
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="Assets/css/index.css"/>
<!--幻灯片-->
<link rel="stylesheet" type="text/css" href="Assets/plugins/banner/css/goodnav.css">
<script type="text/javascript" src="Assets/plugins/banner/js/jquery.litenav.js"></script>
<!--幻灯片-->
<!--滑动门-->
<script type="text/javascript">
$(function(){
	$(".tabBox .tabNav li").click(function(){
		$(this).siblings("li").removeClass("now");
		$(this).addClass("now");
		$(this).parents(".tabBox").find(".tabCont").css("display","none");
		var i=$(this).index();
		$(this).parents(".tabBox").find(".tabCont:eq("+i+")").css("display","block");
		//console.log(i);
	});
})
</script>
<!--滑动门-->
</head>

<body>
<!--头部-->
<div class="head_bg">
	<div class="head clearfix">
    	<div class="logo"><a href="index.html"><img src="Assets/images/logo.png" alt=""/></a></div>
        <div class="menu">
        	<div class="head_top">

                <a href="">设为首页</a>
                <a href="">加入收藏</a>
            </div>
            <ul class="clearfix">
            	<li class="now"><a href="index.html">首页</a></li>
                <li><a href="search.html">订单查询</a></li>
                <li><a href="follow.html">货物追踪</a></li>
               <!-- <li class="news"><a href="">消息<span>12</span></a></li>-->
                <li><a href="count.html">运费试算</a></li>
                <li><a href="about.html">关于宅急送</a></li>
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
        	<a href="book.html">我要寄件<img src="Assets/images/icon2.png"/></a>
            <a href="follow.html" class="a_2">货物追踪<img src="Assets/images/icon2.png"/></a>
        </div>
        <div class="banner">
        	<!-- 代码 开始 -->
            <div id="hotpic">
                <div id="NewsPic">
                    <a target="_blank" href="" style="visibility: visible; display: block;">
                        <img src="Assets/upload/banner.jpg" class="Picture" alt="" /></a>
                    <a style="visibility: hidden; display: none;" target="_blank" href="">
                       <img src="Assets/upload/banner2.jpg" class="Picture" alt="" /></a>
                    <a style="visibility: hidden; display: none;" target="_blank" href="">
                        <img src="Assets/upload/banner3.jpg" class="Picture" alt="" /></a>
                    <a style="visibility: hidden; display: none;" target="_blank" href="">
                        <img src="Assets/upload/banner4.jpg" class="Picture" alt="" /></a>
                    <a style="visibility: hidden; display: none;" target="_blank" href="">
                        <img src="Assets/upload/banner5.jpg" class="Picture" alt="" /></a>
                    <a style="visibility: hidden; display: none;" target="_blank" href="">
                        <img src="Assets/upload/banner6.jpg" class="Picture" alt="" /></a>
                    <div class="Nav">
                        <span class="Normal">6</span>
                        <span class="Normal">5</span>
                        <span class="Normal">4</span>
                        <span class="Normal">3</span>
                        <span class="Normal">2</span>
                        <span class="Cur">1</span>
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
                <li class="now">找物流</li>
                <li>网点查询</li>
               
              </ul>
              <form action="" method="post">
              <div class="tabCont" style="display:block;">
              	<div class="ctn">
                <span>发货城市</span>
                <input name="" type="text" placeholder="请输入城市名（中文/拼音）">
                <span>到达城市</span>
                <input name="" type="text" placeholder="请输入城市名（中文/拼音）">
                <a href="">搜索</a>
                </div>
              </div>
              <div class="tabCont">
              	<div class="ctn">
                <span>网点查询</span>
                <input name="" type="text" placeholder="请输入网点名称">
                <a href="">搜索</a>
                </div>
              </div>
            </div>
            </form>
        </div>
    </div>

</div>

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
