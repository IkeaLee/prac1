<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--
	 by李亦佳
-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>答疑中心</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Motel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="applijewelleryion/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="/aaaaaa/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="/aaaaaa/css/style1.css" rel='stylesheet' type='text/css' />	
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
								<li><a href="grzx.jsp">个人中心</a></li>
								<li><a href="kczx.jsp">课程中心</a></li>
								<li class="active"><a href="dyzx.jsp">答疑中心</a></li>
								<li><a href="gxzx.jsp">共享中心</a></li>
								<li><a href="lxwm.jsp">联系我们</a></li>
							</ul>
						</div>
						<!--/.navbar-collapse-->
					</nav>
				<!--  <div class="search-box">
					<div id="sb-search" class="sb-search">
						<form>
							<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
							<input class="sb-search-submit" type="submit" value="">
							<span class="sb-icon-search"> </span>
							</form>
					</div>
				</div> -->
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
<div class="typo">
		<div class="container">
			<h3 class="title">答疑中心</h3>
			<div class="grid_3 grid_4">
				<form action="QueryDyzxServlet" method="post">
				<h3><input type="submit" style="border:none;background:white;color:black;" value="最近问题"></h3>
				</form>
				<div class="bs-example">
					<table class="table">
						<tbody>
							<c:forEach items="${requestScope.qtlist }" var="q">
								<tr>
								<td class="type-info" name="q_id">${q.q_id }</td>
								<a class="anchorjs-link" href="#h3.-bootstrap-heading"><span class="anchorjs-icon"></span></a>
								<td><h4 id="h3.-bootstrap-heading">${q.q_subject}</h4></td>
								<td><h4 id="h3.-bootstrap-heading">${q.q_content}</h4></td>
								
								<td><a href="/aaaaaa/dyzx/detail?q_id=${q.q_id }"><input type="button"  style="width:100px;height:40px;color:white;background:#00A600;border:none;" value="详情" ></a></td>
								
								</tr>	
							</c:forEach>										
						</tbody>
					</table>
				</div>
			</div>
		
				<h3>&nbsp;内容范围</h3><br>
				
				<div style="float:left">	<form action="YwDyzxServlet" method="post" >
				<h3><input  type="submit" style="width:100px;height:40px;border:none;background:#EEEE00;color:white;" value="语文"></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="SxDyzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#FF00FF;color:white; " value="数学"></a></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="YyDyzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#FF3030;color:white; " value="英语"></a></h3>
				&nbsp;</form>
					&nbsp;</div>
					<div style="float:left">	<form action="WlDyzxServlet" method="post" >
				<h3><input  type="submit" style="width:100px;height:40px;border:none;background:#CA8EFF;color:white;" value="物理"></h3>
				&nbsp;</form>&nbsp;</div>
					<div style="float:left"><form action="HxDyzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#79FF79;color:white; " value="化学"></a></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="SwDyzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#FF84C1FF;color:white; " value="生物"></a></h3>
				&nbsp;</form>
					&nbsp;</div>
					<div style="float:left">	<form action="ZzDyzxServlet" method="post" >
				<h3><input  type="submit" style="width:100px;height:40px;border:none;background:#F75000;color:white;" value="政治"></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="LsDyzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#B87070;color:white; " value="历史"></a></h3>
				&nbsp;</form>&nbsp;</div>
				<div style="float:left">	<form action="DlDyzxServlet" method="post" >
				<h3><a><input  type="submit" style="width:100px;height:40px;border:none;background:#A3D1D1;color:white; " value="地理"></a></h3>
				&nbsp;</form>
					&nbsp;</div>
		<div style="float:left">	
		<h3>&nbsp;发表解答</h3>
			
		
			
				
			   <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s" >
				
		
					<p><br>教师可以解答问题</p>
					<form action="/aaaaaa/JdDyzxServlet" method="post">
						<div>
						    <span >问题编号<label>*</label></span>
						    <textarea rows="1" cols="50" name="q_id"></textarea>
							<span >解答<label>*</label></span>
							<textarea rows="8" cols="50" name="q_answer"placeholder="250字以内"></textarea>
						</div>
						<input type="submit" value="提交">
					</form>
			   </div>	
				<div class="clearfix"> </div>
			
		</div>
	
	<div style="float:right">
	<h3>&nbsp;发表新问题</h3>
	
		
			
				
			   <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s" >
				
		
					<p><br>学生可以上传遇到的问题</p>
					
					<form action="/aaaaaa/TwDyzxServlet" method="post">
					 <span >科目：<label>*</label></span>
					<select name="q_subject" > 
						<option value="语文">语文</option> 
						<option value="数学">数学</option> 
						<option value="英语">英语</option> 
						<option value="物理">物理</option>
						<option value="化学">化学</option> 
						<option value="生物">生物</option>
						<option value="政治">政治</option> 
						<option value="历史">历史</option>
						<option value="地理">地理</option> 
						
					</select> 
						<div>
							<span>问题<label>*</label></span>
							<textarea rows="7" cols="50" name="q_content"placeholder="250字以内"></textarea>
						</div>
						<input type="submit" value="提交">
					</form>
			   </div>	
				<div class="clearfix"> </div>
			
		
	</div>
	
	<!--end-map-->

			<div class="clearfix"> </div>
	
	<div class="footer-bottom">
			<div class="container">
				<p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="sy.html" target="_blank" title="状元课堂">状元课堂</a> 
</p>
			</div>
		</div>
	<!-- footer -->
</body>
</html>