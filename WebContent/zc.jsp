<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- by 李津 -->
<html lang="en" class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>状元课堂-注册</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->




				
				<script type="text/javascript">
				
				
					
				function valS_name(){
					if (f.s_name.value==""){
						document.getElementById("span1").innerHTML="不允许为空";
						return false;
					}else{
						return true;
					}
				}
				//验证密码
				function valPassword(){
					if(f.s_password.value.length<6){
						document.getElementById("span2").innerHTML="应大于6位";
						return false;
					}else{
						return true;
					}
				}
				
				function valTelno(){
					var p = /^\d{11}$/;
					
					//if (f.s_telno.value.search("/^\d{11}$/"==-1)){
				   if(!p.test(f.s_telno.value)){
					   document.getElementById("span3").innerHTML="请输入11位数字";
						return false;
					}else{
					 return true;
					}
				}
				
					
					
					
				function checkPassword(){
					if(f.s_password.value!=f.s_password1.value)
					{
						 document.getElementById("span4").innerHTML="两次输入密码不同";
						return false;
					}else{
						return true;
					}
					
				}
				</script>
				
				
				


</head>
<body>

		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>欢迎注册状元课堂！</h3>
						<h4>课堂因你而精彩，你因课堂而自信</h4>
						<form  name="f" method="post" id="f">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="s_name" class="text" style="color: #FFFFFF !important" type="text"  id= "s_name" onblur="valS_name()" placeholder="请输入账户">
							<span id="span1" ></span>
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="s_password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" onblur="valPassword()" placeholder="请输入密码">
							<span id="span2" ></span>
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="s_password1" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" onblur="checkPassword()" placeholder="请确认密码">
							<span id="span3" ></span>
							</div>
							<div class="input_outer">
								<span class="uss_uer"></span>
								<input name="s_telno" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="text"  onblur="valTelno()"  placeholder="请输入手机号码">
							<span id="span4" ></span>
							</div>		
							<div class="mb2"><input class="act-but submit" style="width:400px; border:none;color:white;" type="submit" value="注册" 
							onclick="if(valS_name()&&valPassword()&&checkPassword()&&valTelno()){f.action='ZCServlet'; f.submit();}"/>
							</div>
						</form>
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