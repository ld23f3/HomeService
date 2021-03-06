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

    <title>宅急送后台管理</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/Assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="${pageContext.request.contextPath}/Assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/Assets/css/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/Assets/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
	  	
		      <form class="form-login" action="${pageContext.request.contextPath}/CourierController?op=update" method="post" >
		        <h2 class="form-login-heading">修改密码</h2>
		        <div class="login-wrap">
		            <input type="text" id="courierNoOrTel" class="form-control" placeholder="原账号/电话" name="courierNoOrTel" autofocus>
		            <br>
		            <input type="password" id="oldcourierPwd" class="form-control" placeholder="输入原密码" name="oldcourierPwd">
		            <br>
		            <input type="password" id="newcourierPwd" class="form-control" placeholder="输入新密码" name="newcourierPwd">
		            <br>
		            <button class="btn btn-theme btn-block2" href="index.html" type="submit">修改</button>
		            <button class="btn btn-theme btn-block2" href="index.html" type="submit">取消</button>
		            <hr>
		            
		            <div class="login-social-link centered">
		            
		            </div>

		
		        </div>
		
		          <!-- Modal -->
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">Forgot Password ?</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>Enter your e-mail address below to reset your password.</p>
		                          <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">
		
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
		                          <button class="btn btn-theme" type="button">Submit</button>
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->
		
		      </form>	  	
	  	
	  	</div>
	  </div>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/Assets/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/Assets/js/bootstrap.min.js"></script>

    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/Assets/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("${pageContext.request.contextPath}/Assets/img/login-bg.jpg", {speed: 500});
    </script>


  </body>
</html>
