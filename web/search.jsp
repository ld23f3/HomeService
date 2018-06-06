<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>订单查询</title>
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css"/>
<link rel="stylesheet" type="text/css" href="Assets/css/common.css"/>
<link rel="stylesheet" type="text/css" href="Assets/css/thems.css"/>
</head>

<body>
<!--头部-->
<div class="head_bg">
	<div class="head clearfix">
    	<div class="logo"><a href="index.jsp"><img src="Assets/images/logo.png" alt=""/></a></div>
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
              <div class="tabCont" style="display:block;">
              	<div class="web_m">
                	<div class="space_hx">&nbsp;</div>
                	<div class="web_mtop">
                    	<form action="" method="post">
                        	<input name="" type="text" placeholder="请输入手机号码">
                            <input name="" type="text" placeholder="请输入验证码">
                            <a href="">查询</a>
                        </form>
                    </div>
                    <div class="space_hx">&nbsp;</div>
                    <div class="web_main">
                    	<!--<div class="sheng">
                        	<span><em>省份筛选:</em></span>
                        	<a href="">北京</a>
                            <a href="">安徽省</a>
                            <a href="">江西省</a>
                            <a href="">福建省</a>
                            <a href="">天津</a>
                            <a href="">广东省</a>
                            <a href="">辽宁省</a>
                            <a href="">内蒙古</a>
                            <a href="">上海</a>
                            <a href="">吉林省</a>
                            <a href="">山东省</a>
                            <a href="">陕西省</a>
                            <a href="">山西省</a>
                            <a href="">宁夏</a>
                            <a href="">香港</a>
                            <a href="">广西省</a>
                            <a href="">贵州省</a>
                            <a href="">四川省</a>
                            <a href="">河南省</a>
                            <a href="">河北省</a>
                            <a href="">新疆</a>
                            <a href="">浙江省</a>
                            <a href="">台湾省</a>
                            <a href="">湖南省</a>
                            <a href="">西藏</a>
                            <a href="">江苏省</a>
                            <a href="">湖北省</a>
                            <a href="">北京</a>
                            <a href="">青海省</a>
                            <a href="">澳门</a>
                            <a href="">甘肃省</a>
                            <a href="">海南省</a>
                            <a href="">云南省</a>
                            <a href="">重庆</a>
                            <a href="">黑龙江省</a>
                        </div>-->
                        <div class="space_hx">&nbsp;</div>
                        <table class="wang" cellpadding="0" cellspacing="0">
                          <tr>
                            <th width="70" scope="col">订单编号</th>
                            <th width="380" scope="col">收货地址</th>
                            <th width="100" scope="col">收件人</th>                     
                            <th width="450" scope="col">送货地址</th>
                            <th width="130" scope="col">联系方式</th>
                            <th width="130" scope="col">包裹件數</th>
                            <th width="140" scope="col">狀態</th>
                            <th width="140" scope="col">功能</th>
                          </tr>
                          <tr>
                            <td>201800001</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>王小明</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>010-61733724</td>
                            <td>2</td>
                            <td><a href="">已取件</td>
                            <td><button>取消訂單</button></td>
                          </tr>
                          <tr>
                            <td>201800002</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>李一</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>010-61733724</td>
                            <td>2</td>
                            <td><a href="">已取件</a></td>
                            <td><button>取消訂單</button></td>
                          </tr>
                          <tr>
                            <td>201800003</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>張美麗</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>010-61733724</td>
                            <td>4</td>
                            <td><a href="">出發取件</a></td>
                            <td><button>取消訂單</button></td>
                          </tr>
                          <tr>
                            <td>201800004</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>徐進</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>010-61733724</td>
                            <td>3</td>
                            <td><a href="">发货</a></td>
                            <td><button>取消訂單</button></td>
                          </tr>
                          <tr>
                            <td>201800005</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>洪華億</td>
                            <td>北京昌平区百善镇善缘嘉园北门</td>
                            <td>010-61733724</td>
                            <td>1</td>
                            <td><a href="">发货</a><a href="">提货</a></td>
                            <td><button>取消訂單</button></td>
                          </tr>
                        </table>
                        <div class="space_hx">&nbsp;</div>
                        <!--分页导航-->
                          <div class="pclady_page">
                              <a class="prev" href="">上一页</a>
                              <a href="">1</a>
                              <a class="now">2</a>
                              <a href="">3</a>
                              <a href="">4</a>
                              <a href="">5</a>
                              <a href="">6</a>
                              <a href="">7</a>
                              <a href="">8</a>
                              <a class="next" href="">下一页</a>
                              <a target="_self" href="" class="viewAll">显示全部</a>
                              <a target="_blank" href="">返回首页</a>
                           </div>
                          <!--分页导航--> 
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
