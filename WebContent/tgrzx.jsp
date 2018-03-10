<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--
	 by李津
-->
<html>
<head>
<title>个人中心</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Motel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="applijewelleryion/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style1.css" rel='stylesheet' type='text/css' />	
<script src="js/jquery-1.11.1.min.js"></script>
<!--webfonts-->

   <!--//webfonts-->
<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
<!-- banner -->
	<div class="banner1">
		<div class="header">
			<div class="container">
				<div class="logo">
					<h1><a href="zy.jsp">状元课堂</a></h1>
				</div>
					<nav class="navbar navbar-default" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">状元课堂</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<!--/.navbar-header-->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a href="zy.jsp">主页</a></li>
								<li class="active"><a href="tgrzx.jsp">个人中心</a></li>
								<li><a href="kczx.jsp">课程中心</a></li>
								<li><a href="dyzx.jsp">答疑中心</a></li>
								<li><a href="gxzx.jsp">共享中心</a></li>
								<li><a href="lxwm.jsp">联系我们</a></li>
							</ul>
						</div>
						<!--/.navbar-collapse-->
					</nav>
				<div class="search-box">
					<div id="sb-search" class="sb-search">
						<form>
							<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
							<input class="sb-search-submit" type="submit" value="">
							<span class="sb-icon-search"> </span>
							</form>
					</div>
				</div>
					<div class="clearfix"> </div>

				<!-- search-scripts -->
					<script src="js/classie.js"></script>
					<script src="js/uisearch.js"></script>
					<script>
						new UISearch( document.getElementById( 'sb-search' ) );
					</script>
				<!-- //search-scripts -->

			</div>
		</div>
	</div>		
		<!-- banner -->
<!-- single -->
	<div class="single">
		<div class="container">
			<div class="single-top">
				
				<div >	
					<h3><a href="tgrzx.jsp">修改个人信息</a></h3>
					<h6>我的信息</h6>
					<form action="/aaaaaa/UpdateTeacher" method="post" >
					<table border="0" class="table" >
					<tr><td>我的昵称:</td><td>
					<input style="width: 300px" type="text" name="t_name" value="${t__user.t_name }"/></td></tr>
					<tr><td>我的密码:</td><td>
					<input style="width: 300px" type="password" name="t_password"  value="${t__user.t_password }"/></td></tr>
					<tr><td>我的性别:</td><td>
					<input style="width: 300px" type="text" name="t_sex" value="${t__user.t_sex }"/></td></tr>
					<tr><td>所教科目:</td><td>
					<input style="width: 300px" type="text" name="t_subject" value="${t__user.t_subject }"/></td></tr>
					<tr><td>联系方式:</td><td>
					<input style="width: 300px" type="text" name="t_telno" value="${t__user.t_telno }"/></td></tr>
					<tr><td>我的邮箱:</td><td>
					<input style="width: 300px" type="text" name="t_email" value="${t__user.t_email }"/></td></tr>
					<tr><td colspan="2">
					<input style="align:center" class="button green" type="submit" value="修改"/>
					<input style="align:center" class="button green" type="reset" value="重置"/>
					</td></tr>
					</table>
					</form>
					<hr/>
					<div class="sinbt">
					<a class="hvr-shutter-in-horizontal" onclick="action=ExitServlet" href="dl.jsp">安全退出</a>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		 </div>
	</div>
<!-- registration -->
<!-- footer -->
	<div class="footer-bottom">
			<div class="container">
				<p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="sy.jsp" title="状元课堂">状元课堂</a> 
			</div>
		</div>
	<!-- footer -->
</body>
</html>