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
<style>
textarea {
  resize : none;
}
</style>
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
					<div class="clearfix"> </div>
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

<br><br><br><br>					
<table width="667" height="160" border="1" align="center">
<tr>
<!--   -->
<td style="background:#00A600;color:white" scope="col" width="100px" height="60">提问者</td>
<td style="background:#00A600;color:white" scope="col" width="200px" height="60">问题</td>
<td style="background:#00A600;color:white" scope="col" width="100px" height="60">解答者</td>
<td style="background:#00A600;color:white" scope="col" width="400px" height="60">答案</td>
</tr>
<tr>

<c:forEach items="${requestScope.qtlist }" var="q">

<td>${q.q_id1}</td><td>${q.q_content}</td><td>${q.q_id2}</td>
<td>${q.q_answer}</td>
</c:forEach></tr>
</table>
<br><br><br><br><br><br><br><br><br><br>
<div><a href="/aaaaaa/dyzx.jsp">←返回</a> </div>
<div class="footer-bottom">
		<div class="container">
		    <p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="sy.html" target="_blank" title="状元课堂">状元课堂</a> 
</p>
	  </div>
</div>

	
</body>
</html>