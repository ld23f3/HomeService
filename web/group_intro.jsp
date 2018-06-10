<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><c:set
	var="basePath" value="${pageContext.request.scheme}" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>团队介绍</title>
<link rel="stylesheet" type="text/css" href="Assets/css/reset.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/common.css" />
<link rel="stylesheet" type="text/css" href="Assets/css/thems.css" />
<script type="text/javascript" src="Assets/js/jquery-1.8.3.min.js"></script>
<link rel="shortcut icon" href="Assets/images/bitbug_favicon.ico" />
<script type="text/javascript">
	$(function() {
		$("#left_menu li ul").css("display", "block");
		$("#left_menu li .yiji").click(function() {
			$(this).parents("li").find(".erji").toggle();
		});
	})

	function btn() {
		document.getElementById("d1").style.display = "block";
		document.getElementById("d2").style.display = "none";
		document.getElementById("d3").style.display = "none";
		document.getElementById("d4").style.display = "none";
		document.getElementById("d5").style.display = "none";
		document.getElementById("d6").style.display = "none";
		document.getElementById("d7").style.display = "none";

	}
	function btn1() {
		document.getElementById("d1").style.display = "none";
		document.getElementById("d2").style.display = "block";
		document.getElementById("d3").style.display = "none";
		document.getElementById("d4").style.display = "none";
		document.getElementById("d5").style.display = "none";
		document.getElementById("d6").style.display = "none";
		document.getElementById("d7").style.display = "none";
	}

	function btn2() {
		document.getElementById("d1").style.display = "none";
		document.getElementById("d2").style.display = "none";
		document.getElementById("d3").style.display = "block";
		document.getElementById("d4").style.display = "none";
		document.getElementById("d5").style.display = "none";
		document.getElementById("d6").style.display = "none";
		document.getElementById("d7").style.display = "none";
	}

	function btn3() {
		document.getElementById("d1").style.display = "none";
		document.getElementById("d2").style.display = "none";
		document.getElementById("d3").style.display = "none";
		document.getElementById("d4").style.display = "block";
		document.getElementById("d5").style.display = "none";
		document.getElementById("d6").style.display = "none";
		document.getElementById("d7").style.display = "none";
	}

	function btn4() {
		document.getElementById("d1").style.display = "none";
		document.getElementById("d2").style.display = "none";
		document.getElementById("d3").style.display = "none";
		document.getElementById("d4").style.display = "none";
		document.getElementById("d5").style.display = "block";
		document.getElementById("d6").style.display = "none";
		document.getElementById("d7").style.display = "none";
	}

	function btn5() {
		document.getElementById("d1").style.display = "none";
		document.getElementById("d2").style.display = "none";
		document.getElementById("d3").style.display = "none";
		document.getElementById("d4").style.display = "none";
		document.getElementById("d5").style.display = "none";
		document.getElementById("d6").style.display = "block";
		document.getElementById("d7").style.display = "none";
	}

	function btn6() {
		document.getElementById("d1").style.display = "none";
		document.getElementById("d2").style.display = "none";
		document.getElementById("d3").style.display = "none";
		document.getElementById("d4").style.display = "none";
		document.getElementById("d5").style.display = "none";
		document.getElementById("d6").style.display = "none";
		document.getElementById("d7").style.display = "block";
	}
</script>
</head>

<body>
	<!--头部-->
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
					<li><a href="search.jsp">货物追踪</a></li>
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
		<!--新闻列表-->
		<div class="person clearfix">
			<div class="order_l person_l">
				<ul id="left_menu" class="left_menu">
					<li><a class="yiji"><span>团队简介</span><em>&nbsp;</em></a>
						<ul class="erji">
							<li><i>&nbsp;</i> <strong><a id="a1"
									onclick="btn()">乔治的一家</a></strong></li>
						</ul></li>
					<li><a href="#" class="yiji"><span>团员介绍</span><em>&nbsp;</em></a>
						<ul class="erji">
							<li><i>&nbsp;</i> <strong><a href="#" id="a2"
									onclick="btn1()">伟杰(组长)</a></strong></li>
							<li><strong><a href="#" id="a3" onclick="btn2()">惠城</a></strong></li>
							<li><strong><a href="#" id="a4" onclick="btn3()">佩祺</a></strong></li>
							<li><strong><a href="#" id="a5" onclick="btn4()">建辉</a></strong></li>
							<li><strong><a href="#" id="a6" onclick="btn5()">锦明</a></strong></li>
							<li><strong><a href="#" id="a7" onclick="btn6()">文帅</a></strong></li>
						</ul></li>
				</ul>
			</div>
			<div class="person_r">
				<div class="person_h">
					<span>乔治的一家</span>
				</div>
				<div >
					<div id="d1" onclick="">
						<div class="person_rmain">
							<div >
								<img alt="140x140" src="Assets/img/sticker/team.jpg"
									style="width: 50%" />
							</div>
							<div class="news_d">
						这次做项目的期间，组员很照顾我，因为我请假的原因，让我负责的部分很少也都很简单，但是确实，我需要检讨自己
从一起做项目的同学身上我看到了谦虚谨慎、细心努力的态度，在以后我的生活中我还会留意身边同学的优点，从他们身上找寻我所缺少的品质，不断学习。在此次的实训中我感觉到我们最大的不足就是动手的能力太差，在项目组的同学也给我提出一些建议，让我有机会自己多动手，不是我们缺乏知识，而是我们没有运用知识的能力，这段时间的项目开发过程中，我自己也认识到虽然我们的理论知识没有那么全面，但是如果在学校认真学习了，我们的理论知识并不比别人差，所以以后的日子，我会更加注重自己的动手能力。最后很感谢每个组员的照顾与鼓励，很开心有他们
						</div>
						
						</div>
						<br/>
					</div>
			
				</div>
			
				<div id="d2" style="display: none;">
					<div class="person_rmain">
						<div >
							<img alt="140x140" src="Assets/img/sticker/people1.jpg"
								style="width: 25%" />
						</div>
						<div class="news_d">
						这次做项目的期间，组员很照顾我，因为我请假的原因，让我负责的部分很少也都很简单，但是确实，我需要检讨自己
从一起做项目的同学身上我看到了谦虚谨慎、细心努力的态度，在以后我的生活中我还会留意身边同学的优点，从他们身上找寻我所缺少的品质，不断学习。在此次的实训中我感觉到我们最大的不足就是动手的能力太差，在项目组的同学也给我提出一些建议，让我有机会自己多动手，不是我们缺乏知识，而是我们没有运用知识的能力，这段时间的项目开发过程中，我自己也认识到虽然我们的理论知识没有那么全面，但是如果在学校认真学习了，我们的理论知识并不比别人差，所以以后的日子，我会更加注重自己的动手能力。最后很感谢每个组员的照顾与鼓励，很开心有他们
						</div>
					</div>
					<br/>
				</div>

				<div id="d3" style="display: none;">
					<div class="person_rmain">
						<div>
							<img alt="140x140" src="Assets/img/sticker/people2.jpg"
								style="width: 25%" />
						</div>
						<div class="news_d">
						这次做项目的期间，组员很照顾我，因为我请假的原因，让我负责的部分很少也都很简单，但是确实，我需要检讨自己
从一起做项目的同学身上我看到了谦虚谨慎、细心努力的态度，在以后我的生活中我还会留意身边同学的优点，从他们身上找寻我所缺少的品质，不断学习。在此次的实训中我感觉到我们最大的不足就是动手的能力太差，在项目组的同学也给我提出一些建议，让我有机会自己多动手，不是我们缺乏知识，而是我们没有运用知识的能力，这段时间的项目开发过程中，我自己也认识到虽然我们的理论知识没有那么全面，但是如果在学校认真学习了，我们的理论知识并不比别人差，所以以后的日子，我会更加注重自己的动手能力。最后很感谢每个组员的照顾与鼓励，很开心有他们
						</div>
					</div>
					<br/>
				</div>


				<div  id="d4"  style="display: none;">
					<div class="person_rmain">
						<div >
							<img alt="140x140" src="Assets/img/sticker/people3.jpg"
								style="width: 25%" />
						</div>
						<div class="news_d">
						这次做项目的期间，组员很照顾我，因为我请假的原因，让我负责的部分很少也都很简单，但是确实，我需要检讨自己
从一起做项目的同学身上我看到了谦虚谨慎、细心努力的态度，在以后我的生活中我还会留意身边同学的优点，从他们身上找寻我所缺少的品质，不断学习。在此次的实训中我感觉到我们最大的不足就是动手的能力太差，在项目组的同学也给我提出一些建议，让我有机会自己多动手，不是我们缺乏知识，而是我们没有运用知识的能力，这段时间的项目开发过程中，我自己也认识到虽然我们的理论知识没有那么全面，但是如果在学校认真学习了，我们的理论知识并不比别人差，所以以后的日子，我会更加注重自己的动手能力。最后很感谢每个组员的照顾与鼓励，很开心有他们
						</div>
					</div>
					<br/>
				</div>


				<div  id="d5"  style="display: none;">
					<div class="person_rmain">
						<div>
							<img alt="140x140" src="Assets/img/sticker/people4.jpg"
								style="width: 25%" />
						</div>

						<div class="news_d">
						这次做项目的期间，组员很照顾我，因为我请假的原因，让我负责的部分很少也都很简单，但是确实，我需要检讨自己
从一起做项目的同学身上我看到了谦虚谨慎、细心努力的态度，在以后我的生活中我还会留意身边同学的优点，从他们身上找寻我所缺少的品质，不断学习。在此次的实训中我感觉到我们最大的不足就是动手的能力太差，在项目组的同学也给我提出一些建议，让我有机会自己多动手，不是我们缺乏知识，而是我们没有运用知识的能力，这段时间的项目开发过程中，我自己也认识到虽然我们的理论知识没有那么全面，但是如果在学校认真学习了，我们的理论知识并不比别人差，所以以后的日子，我会更加注重自己的动手能力。最后很感谢每个组员的照顾与鼓励，很开心有他们
						</div>
					</div>
					<br/>
				</div>


				<div  id="d6"  style="display: none;">
					<div class="person_rmain">
						<div>
							<img alt="140x140" src="Assets/img/sticker/people5.jpg"
								style="width: 25%" />
						</div>
						<div class="news_d">
						这次做项目的期间，组员很照顾我，因为我请假的原因，让我负责的部分很少也都很简单，但是确实，我需要检讨自己
从一起做项目的同学身上我看到了谦虚谨慎、细心努力的态度，在以后我的生活中我还会留意身边同学的优点，从他们身上找寻我所缺少的品质，不断学习。在此次的实训中我感觉到我们最大的不足就是动手的能力太差，在项目组的同学也给我提出一些建议，让我有机会自己多动手，不是我们缺乏知识，而是我们没有运用知识的能力，这段时间的项目开发过程中，我自己也认识到虽然我们的理论知识没有那么全面，但是如果在学校认真学习了，我们的理论知识并不比别人差，所以以后的日子，我会更加注重自己的动手能力。最后很感谢每个组员的照顾与鼓励，很开心有他们
						</div>
					</div>
					<br/>
				</div>


				<div  id="d7"  style="display: none;">
					<div class="person_rmain" >
						<div>
							<img alt="140x140" src="Assets/img/sticker/people6.jpg"
								style="width: 25%" />
						</div>
						<div class="news_d">
						这次做项目的期间，组员很照顾我，因为我请假的原因，让我负责的部分很少也都很简单，但是确实，我需要检讨自己
从一起做项目的同学身上我看到了谦虚谨慎、细心努力的态度，在以后我的生活中我还会留意身边同学的优点，从他们身上找寻我所缺少的品质，不断学习。在此次的实训中我感觉到我们最大的不足就是动手的能力太差，在项目组的同学也给我提出一些建议，让我有机会自己多动手，不是我们缺乏知识，而是我们没有运用知识的能力，这段时间的项目开发过程中，我自己也认识到虽然我们的理论知识没有那么全面，但是如果在学校认真学习了，我们的理论知识并不比别人差，所以以后的日子，我会更加注重自己的动手能力。最后很感谢每个组员的照顾与鼓励，很开心有他们
						</div>
					</div>
					<br/>
				</div>
			</div>
		</div>
	</div>
	</div>
	<!--新闻列表-->
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
				找物流有限责任公司.&nbsp;&nbsp;All&nbsp;&nbsp;rights&nbsp;&nbsp;reserved.
				&nbsp;&nbsp;粤ICP备10005645</div>
		</div>
	</div>
	<!--底部-->
</body>
</html>