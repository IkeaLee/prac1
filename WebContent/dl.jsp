3<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--
	 by李亦佳
-->
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h2>欢迎登录状元课堂~~</h2>
						<h4>课堂因你而精彩!</h4>
						<form action="LoginServlet" name="s" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="name"  id="name" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户" required autofocus/>
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="password" id="password"  class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码" required autofocus/>
							<br><br><h4>您的身份是：
<input type="radio" name="authory" value="s" checked="checked"/>学生
<input type="radio" name="authory" value="t"/>教师
</h4> 
</div><br>
							<div class="mb2"><input class="act-but submit" style="width:400px; border:none;color:white;" id="s_login"type="submit" value="登录" ></input></div>
							</form>
							<br><br><h5>还没创建账户？</h5>
							<div class="mb2"><a class="act-but submit" href="zc.jsp" style="color: #FFFFFF">注册</a></div>
						
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="js/TweenLite.min.js"></script>
		<script src="js/EasePack.min.js"></script>
		<script src="js/rAF.js"></script>
		<script src="js/demo-1.js"></script>
		<div style="text-align:center;">

</div>
	</body>
</html>