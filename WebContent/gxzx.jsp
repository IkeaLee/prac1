<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--
	 by李亦佳
-->
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>共享中心</title>
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
<body><div class="banner1">
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
								<li><a href="grzx.jsp">个人中心</a></li>
								<li><a href="kczx.jsp">课程中心</a></li>
								<li> <a href="dyzx.jsp">答疑中心</a></li>
								<li class="active"><a href="gxzx.jsp">共享中心</a></li>
								<li><a href="lxwm.jsp">联系我们</a></li>
							</ul>
						</div>
						<!--/.navbar-collapse-->
					</nav>
				
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
<div class="typo">
		<div class="container">
			<h3 class="title">共享中心</h3>
			<div class="grid_3 grid_4">
				<form action="/aaaaaa/QueryGxzxServlet" method="post">
				<h3><input type="submit" style="border:none;background:white;color:black;" value="最近文件"></h3>
				</form>
				<div class="bs-example">
					<table class="table">
						<tbody>
						
							<c:forEach items="${requestScope.ftlist }" var="f"><tr>
								<a class="anchorjs-link" href="#h3.-bootstrap-heading"><span class="anchorjs-icon"></span></a>
								<td class="type-info" name="f_id">${f.f_id }</td>								
								<td><h4 id="h3.-bootstrap-heading">${f.f_subject}</h4></td>

								<td><h4 id="h3.-bootstrap-heading"><a href="${f.f_address}">${f.f_name}</a></h4></td>
								</tr>
							</c:forEach>	
																
						</tbody>
					</table>
				</div>
			</div>
		
				<h3>&nbsp;内容范围</h3><br>
				
				<div style="float:left">	<form action="YwGxzxServlet" method="post" >
				<h3><input  type="submit" style="width:100px;height:40px;border:none;background:#EEEE00;color:white;" value="语文"></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="SxGxzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#FF00FF;color:white; " value="数学"></a></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="YyGxzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#FF3030;color:white; " value="英语"></a></h3>
				&nbsp;</form>
					&nbsp;</div>
					<div style="float:left">	<form action="WlGxzxServlet" method="post" >
				<h3><input  type="submit" style="width:100px;height:40px;border:none;background:#CA8EFF;color:white;" value="物理"></h3>
				&nbsp;</form>&nbsp;</div>
					<div style="float:left"><form action="HxGxzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#79FF79;color:white; " value="化学"></a></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="SwGxzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#FF84C1FF;color:white; " value="生物"></a></h3>
				&nbsp;</form>
					&nbsp;</div>
					<div style="float:left">	<form action="ZzGxzxServlet" method="post" >
				<h3><input  type="submit" style="width:100px;height:40px;border:none;background:#F75000;color:white;" value="政治"></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="LsGxzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#B87070;color:white; " value="历史"></a></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="DlGxzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#A3D1D1;color:white; " value="地理"></a></h3>
				&nbsp;</form>
					&nbsp;</div>
		<div style="float:left">	
		<h3>&nbsp;上传文件</h3>
			
		
			
				
			   <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s" >
				
		
					<p><br>欢迎分享学习资料</p>
					<form action="FileUp" method="post" enctype="multipart/form-data">
					请选择要上传的文件<br><input type="file" name="filename" class="navbar navbar-default"/><br>
					请选择要上传的文件<br><input type="file" name="filename" class="navbar navbar-default"/><br>
					请选择要上传的文件<br><input type="file" name="filename" class="navbar navbar-default"/><br>
					
					<input type="submit" value="上传"/>
					</form>
			   </div>	
				<div class="clearfix"> </div>
			
		</div>
	
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	
	<div class="footer-bottom">
			<div class="container">
				<p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="sy.jsp" target="_blank" title="状元课堂">状元课堂</a> 
</p>
			</div>
		</div>
	<!-- footer -->
</body>
</html>