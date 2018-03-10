<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--
	  by李津
-->
<html>
<head>
<title>联系我们</title>
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
<script type="text/javascript">
function valName(){
	if (f.name.value==""){
		document.getElementById("span1").innerHTML="昵称不允许为空";
		return false;
	}else{
		return true;
	}
}
function valEmail(){
var p =/^\w+@\w+.\w+$/;
   if(!p.test(f.email.value)){
	   document.getElementById("span2").innerHTML="请填写正确的邮箱";
		return false;
	}else{
	 return true;
	}
}
function valTelno(){
	var p = /^\d{11}$/;
	
	//if (f.s_telno.value.search("/^\d{11}$/"==-1)){
   if(!p.test(f.telno.value)){
	   document.getElementById("span3").innerHTML="请输入11位数字";
		return false;
	}else{
	 return true;
	}
}
function valAdvice(){
	var val=document.getElementById('t').value;
	if(val.length===0) {
		document.getElementById("span4").innerHTML="建议不允许为空";
		return false;
	}else{
		return true;
	}
}

</script>
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
								<li><a href="dyzx.jsp">答疑中心</a></li>
								<li><a href="gxzx.jsp">共享中心</a></li>
								<li class="active"><a href="lxwm.jsp">联系我们</a></li>
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
		<!-- banner -->
<!--start-contact-->
	<div class="contact">
		<div class="container">
			<div class="contact-top heading">
				<h3>联系我们</h3>
			</div>
			<form name="f" method="post" >
				<div  class="contact-bottom">
				<input type="text" name="name" value="我的昵称" onfocus="this.value = '';" placeholder="我的昵称"
				onblur="valName()" />
				<span id="span1" ></span>
				<input type="text" name="email" value="我的邮箱" onfocus="this.value = '';" placeholder="我的邮箱"
				onblur="valEmail()" />
				<span id="span2" ></span>
				<input type="text" name="telno" value="联系方式" onfocus="this.value = '';" placeholder="联系方式"
				onblur="valTelno()"  />
				<span id="span3" ></span>
				<textarea id="t" name="advice" value="我的建议:" onfocus="this.value = '';" placeholder="我的建议"
				onblur="valAdvice()" >我的建议</textarea>
				<span id="span4" ></span>
				</div>
				<div class="submit-btn">
				<center>
				<input type="submit" style="width: 16.66666667%;" value="提交"
				onclick="if(valName()&&valEmail()&&valTelno()&&valAdvice()){f.action='LxwmServlet'; f.submit();}">
				</center>
				</div>
			</form>
				</div>
			</div>
		<!--end-contact-->
		<!--start-map-->
			<div class="co-bt">
				<div class="col-md-3 add">
					<h4>地址</h4>
					<address>
						中国.大连.甘井子区<br>
						软件园路8号<br>
						大连东软信息学院<br>
						<abbr title="Phone">联系电话:</abbr>456-7890
					</address>
				</div>
				
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--end-map-->

			<div class="clearfix"> </div>
	
	<div class="footer-bottom">
			<div class="container">
				<p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="sy.jsp" target="_blank" title="状元课堂">状元课堂</a> 
</p>
			</div>
		</div>
	<!-- footer -->
</body>
</html>