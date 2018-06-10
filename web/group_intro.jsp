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
						乔治的一家，出自，热门教育动画片小猪佩奇，成立于，2018-4-11。每个组员都能像家人一样对待彼此，每个人都能在项目中获得成就，查漏补缺。发挥每个人的特长，在小组完成项目发现困难的时候，要和小组共同讨论，共同解决、攻克 困难，所以一个小组的团结至关重要。团队的凝聚力能冲破一切阻挡团队前 进步伐的绊脚石。每发现一个困难就是一个不可多得的经验，每解决一个困 难就是一个不可多得的成长历程。在制作项目当中会发现或多或少的困难，只要不放弃，总能成功的克服 困难，专研、问同学、求助老师、上网搜索；方法很多，只要用心、尽力， 就能克服一切。我们是一家人。
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
						我喜欢看电影，喜欢听歌，也喜欢唱歌,喜欢看一群认识的人在那打闹，然后自己在后面当一个安静的美男子。
上星期又重复看了第N遍《大话西游之仙履奇缘》，果然还是不想当那条狗，也不想当那条闲鱼。最喜欢的歌呢，应该是《一生所爱》吧。不过最喜欢的歌手是Eason,陈奕迅的声音一直都超级迷人的呢,要是有喜欢的，下次再约起来一起听他的演唱会啊。
项目感想的话,平时有不会的知识点，要早点啃下来。
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
						洪佩祺，女，来自台湾，工作了五六年来学习进修。在厦门重温了当学生的乐趣，也认识了许多朋友，让我觉得厦门很友善，之后因为公司安排的关系，会被派驻在厦门，再请大家多多指教，来这边学习到怎么去团队合作，也学到很多知识，非常开心。
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
						王建辉，男，单身，见习程序猿，工作一年多后又回来当学生。感想：第二次项目做的比第一次好点，虽然还是磕磕绊绊的。分配的任务有做了些，但是不够完善，有些功能需要队友的补充（比如访问控制），周五因为个人原因请了一天假，耽误了任务的完成，本想周六完成任务的，但是有些地方卡住了，做了一天才完成一个分页查询功能，最后一个修改来不及做，耽误了进度，抱歉。

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