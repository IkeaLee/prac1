<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
	 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>状元课堂</title>
    <meta name="description" content="This is a free Bootstrap landing page theme created for BootstrapZero. Feature video background and one page design." />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="generator" content="Codeply">
    <link rel="stylesheet" href="./css/bootstrap.min.css" />
    <link rel="stylesheet" href="./css/animate.min.css" />
    <link rel="stylesheet" href="./css/ionicons.min.css" />
    <link rel="stylesheet" href="./css/styles.css" />
    
    <link rel="stylesheet" type="text/css" href="css/normalize.css" />

	<link rel="stylesheet" type="text/css" href="css/component.css" />


    	<!--
        	作者：lijin_heu@163.com
        	时间：2017-07-27
        	描述：table CSS
        -->
    	<style type="text/css">
			table.hovertable {
			font-family: verdana,arial,sans-serif;
			font-size:11px;
			color:#333333;
			border-width: 1px;
			border-color: #999999;
			border-collapse: collapse;
			}
			table.hovertable th {
			background-color:#c3dde0;
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #a9c6c9;
			}
			table.hovertable tr {
			background-color:#d4e3e5;
			}
			table.hovertable td {
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #a9c6c9;
			}
			body,td,th {
	font-family: Questrial, "Helvetica Neue", Arial, sans-serif;
	color: #930093;
}
body {
	background-image: url(img/ppt-backgrounds-2340382__340.png);
}
        </style>
			<!-- tableCSS end -->
			<!-- 隐藏Div -->
			<script type="text/javascript">
			function change()
			{
				var div1 = document.getElementById("div1");
				var div2 = document.getElementById("div2");
				if(div2.style.display == "none")
				{
					div2.style.display = 'block';
				}
				else
				{
					div2.style.display = 'none';
				}
			}
			function change1()
			{
				var div3 = document.getElementById("div3");
				var div4 = document.getElementById("div4");
				if(div4.style.display == "none")
				{
					div4.style.display = 'block';
				}
				else
				{
					div4.style.display = 'none';
				}
			}
			</script>
			<!-- 隐藏Div end -->
  </head>
  <body>
    <nav id="topNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#first"><i class="ion-ios-analytics-outline"></i>状元课堂</a>
            </div>
            <div class="navbar-collapse collapse" id="bs-navbar">
                <ul class="nav navbar-nav">
                    <li>
                        <a class="page-scroll" href="#one">学生用户管理</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#two">教师用户管理</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#three">建议意见管理</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#four">问题管理</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#last">文件管理</a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" data-toggle="modal" title="A free Bootstrap video landing theme" href="#aboutModal">关于我们</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <header id="first">
        <div class="header-content">
            <div class="inner">
                <h1 class="cursive" style="font-family: '微软雅黑';">状&nbsp;元&nbsp;课&nbsp;堂</h1>
                <br /><br />
                <h4 style="font-family: '微软雅黑';font-size:large;">课&nbsp;堂&nbsp;因&nbsp;你&nbsp;而&nbsp;精&nbsp;彩&nbsp;，&nbsp;你&nbsp;因&nbsp;课&nbsp;堂&nbsp;而&nbsp;自&nbsp;信</h4>
                <br/><br/><hr>
                 <a href="#one" class="btn btn-primary btn-xl page-scroll" style="font-family: '微软雅黑';">Start</a>
            </div>
        </div>
        
    </header>
    <body>
    <section id="one">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2 text-center">
                    <h2 class="margin-top-0 text-primary">学生用户管理</h2>
                    <br>
                    <div style="width:720px;margin: auto;text-align: left;">
		
								<form action = "/aaaaaa/AdminStudentServlet" method="post" style="font-family: '微软雅黑';font-size: large;">
								查询学生用户 <select name="choice" style="width: auto;background: white;border:none">
								<option value="1">按ID查询</option>
								<option value="2">按名称查询</option>
								<option value="3">查询所有</option>
								</select><br /><br />
								请输入查询用户的  ID&nbsp;&nbsp;<input type=" text" name="s_id" style="background: white;border:none"/><br/><br />
								请输入查询用户的名称<input type=" text"  name="s__name" id="s__name" style="background: white;border:none"/><br>
                              	<input type="submit" value="提交" class="btn btn-default btn-xl page-scroll"/>
								</form>
						</div>
											
                </div>
                <div class="media wow fadeInRight" style="width:1000px;margin: auto;text-align: left;">
										<hr>
										<h3 style="background: white; font-family: '微软雅黑';width: auto;">学生信息表</h3>
										<table border="0" style="font-family: '微软雅黑';font-size: larger;" class="hovertable">
										<tr>
											<td>用户 ID</td><td>用户名称</td><td>&nbsp;&nbsp;用户密码&nbsp;&nbsp;</td><td>用户性别</td><td>用户年龄</td><td>弱势科目</td><td>&nbsp;&nbsp;&nbsp;&nbsp;所在学校&nbsp;&nbsp;&nbsp;&nbsp;</td>
											<td>所在年级</td><td>&nbsp;&nbsp;联系方式&nbsp;&nbsp;</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;操&nbsp;&nbsp;作&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
											</tr>
											<c:forEach  items="${s_users}" var="u">
											<tr>
												<td>${u.s_id }</td><td>${u.s_name}</td><td>${u.s_password}</td>
												<td>${u.s_sex}</td><td>${u.s_age}</td><td>${u.s_subject}</td><td>${u.s_school}</td><td>${u.s_grade}</td>
												<td>${u.s_telno}</td>
												<td>
												<a href="/aaaaaa/DeleteStudentServlet?s_id=${u.s_id}">删除</a>&nbsp;&nbsp;
												<a href="/aaaaaa/UpdateSuserServlet?s_id=${u.s_id}">修改</a>
											</tr>
											</c:forEach>
										</table>
                                        
										</div><br>
                 
              <div>
				<div id="div1">
				<center><a href="#" class="btn btn-default btn-xl page-scroll" onclick="change()">新增学生用户</a></center>
				</div>
				<div id="div2" style="display:none; width:720px;margin:auto; ;text-align: left;">
					<form action="AddStudentServlet" method="post">
					用户名称<input type="text" name="s_name" style="background: gray;font-family: '微软雅黑';font-size: large;"/><br/><br />
					用户密码<input type="password"  name="s_password"  style="background: gray;font-family: '微软雅黑';font-size: large;"/><br/>
                    <input type="submit" value="提交" class="btn btn-default btn-xl page-scroll"/>
					</form>
				</div>
			</div>
                  
         
            </div>
        </div>
    </section>

    <section id="two">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="margin-top-0 text-primary">教师用户管理</h2>
                     <br>
                    <div style="width:650px;margin: auto;text-align: left;">
		
											<form action = "/aaaaaa/AdminTeacherServlet" method="post" style="font-family: '微软雅黑';font-size: large;">
											查询老师用户 <select name="choice" style="width: auto;background: white;">
														<option value="1">按ID查询</option>
														<option value="2">按名称查询</option>
														<option value="3">查询所有</option>
														</select><br /><br />
											请输入查询用户的  ID&nbsp;&nbsp;<input type=" text" name="t_id" style="background: white;"/><br/><br />
											请输入查询用户的名称<input type=" text" name="t__name" id="t__name" style="background: white;"/><br>
                                                <input type="submit" value="提交" class="btn btn-default btn-xl page-scroll"/>
											</form>
											</div>
											
                </div>
                <div class="media wow fadeInRight" style="width:900px;margin: auto;text-align: left;">
										<hr>
										<h3 style="background: white; font-family: '微软雅黑';width=100%: auto;">老师信息表</h3>
										<table border="0" style="font-family: '微软雅黑';font-size: larger;" class="hovertable">
										<tr>
											<td>用户 ID</td><td>用户名称</td><td>&nbsp;&nbsp;&nbsp;&nbsp;用户密码&nbsp;&nbsp;&nbsp;&nbsp;</td><td>用户性别</td><td>所教科目</td><td>&nbsp;&nbsp;联系方式&nbsp;&nbsp;</td>
											<td>&nbsp;&nbsp;用户邮箱&nbsp;&nbsp;</td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;操&nbsp;&nbsp;作&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
											</tr>
											<c:forEach items="${t_users}" var="u">
										<tr>
											<td>${u.t_id }</td><td>${u.t_name}</td><td>${u.t_password}</td>
											<td>${u.t_sex}</td><td>${u.t_subject}</td><td>${u.t_telno}</td><td>${u.t_email}</td>
											<td>
											<a href="/aaaaaa/DeleteTeacherServlet?t_id=${u.t_id}">删除</a>&nbsp;&nbsp;
											<a href="/aaaaaa/UpdateT_userServlet?t_id=${u.t_id}">修改</a>
										</tr>
										</c:forEach>
										</table>
										</div><br>
                   
                   <div>
				<div id="div3">
				<center><a href="#" class="btn btn-default btn-xl page-scroll" onclick="change1()">新增教师用户</a></center>
				</div>
				<div id="div4" style="display:none; width:720px;margin:auto; ;text-align: left;">
					<form action="/aaaaaa/AddTeacherServlet" method="post">
					用户名称<input type="text" name="t_name" style="background: white;font-family: '微软雅黑';font-size: large;"/><br/><br />
					用户密码<input type="password"  name="t_password"  style="background: white;font-family: '微软雅黑';font-size: large;"/><br/>
                    <input type="submit" value="提交" class="btn btn-default btn-xl page-scroll"/>
					</form>
				</div>
			</div>
                   
                   
            </div>
        </div>
    </section>
   
        <section id="three">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="margin-top-0 text-primary">建议意见管理</h2>
                     <br>
                    <div style="width:720px;margin: auto;text-align: left;">
		
											<form action = "balabala" method="post" style="font-family: '微软雅黑';font-size: large;">
											查询建议<select name="choice" style="width: auto;background: white;">
														<option value="1">按ID查询</option>
														<option value="2">按关键词查询</option>
														<option value="3">查询所有</option>
														</select><br /><br />
											请输入查询建议的  ID&nbsp;&nbsp;<input type=" text" name="id" style="background: white;"/><br/><br />
											请输入查询建议的关键词<input type=" text" name="cu__advice" id ="cu__advice" style="background: white;"/><br>
                                            <input type="submit" value="提交" class="btn btn-default btn-xl page-scroll"/>
											</form>
											</div>
											
                </div>
                <div class="media wow fadeInRight" style="width:800px;margin: auto;text-align: left;">
										<hr>
										<h3 style="background: white; font-family: '微软雅黑';width=100%: auto;">建议信息表</h3>
										<table border="0" style="font-family: '微软雅黑';font-size: larger;" class="hovertable">
											<tr>
			<td>建议ID</td><td>用户名称</td><td>用户邮箱</td><td>联系方式</td><td>用户建议</td><td>操作</td>
			</tr>
			<c:forEach items="${cus}" var="c">
			<tr>
		<td>${c.id }</td><td>${c.name}</td><td>${c.email}</td><td>${c.telno}</td><td>${c.advice}</td>
			<td>
			&nbsp;<a href="/aaaaaa/DeleteContactUsServlet?id=${c.id}">删除</a>&nbsp;
			</tr>
			</c:forEach>
			</table>
			</div><br>
                  
            </div>
        </div>
    </section>
     <section id="four">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="margin-top-0 text-primary">问题管理</h2>
                     <br>
                    <div style="width:720px;margin: auto;text-align: left;">
		
											<form action = "/aaaaaa/CQuestionServlet" method="post" style="font-family: '微软雅黑';font-size: large;">
											查询问题<select name="choice" style="width: auto;background: white;">
														<option value="1">按ID查询</option>
														<option value="2">按名称查询</option>
														<option value="3">查询全部</option>
														</select><br /><br />
											请输入查询问题的  ID&nbsp;&nbsp;<input type=" text" name="q_id" style="background: white;"/><br/><br />
											请输入查询问题的内容<input type=" text" name="q_name" style="background: white;"/><br>
                                            <input type="submit" value="查询" class="btn btn-default btn-xl page-scroll"/>
											</form>
											</div>
											
                </div>
                 <div class="media wow fadeInRight" style="width:1000px;margin: auto;text-align: left;">
										<hr>
										<h3 style="background:white; font-family: '微软雅黑';width=100%: auto;">问题信息表</h3>
										<table border="0" style="font-family: '微软雅黑';font-size: larger;" class="hovertable">
										<tr>
			<td>问题编号</td><td>问题科目</td><td>问题内容</td><td>提问者</td><td>解答者</td><td>问题答案</td><td>操作</td>
			</tr>
											<c:forEach items="${q__users}" var="u">
									<tr>
			<td>${u.q_id }</td><td>${u.q_subject}</td><td>${u.q_content}</td><td>${u.q_id1}</td><td>${u.q_id2}</td><td>${u.q_answer}</td>
	
												<td>
											<a href="/aaaaaa/sfileServlet?q_id=${u.q_id}">删除</a>&nbsp;&nbsp;</td>
											
										</tr>
										</c:forEach>
										</table>
										</div><br>
                 
            </div>
        </div>
    </section>
  
        <section id="last">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                          <h2 class="margin-top-0 text-primary">文件管理</h2>
                     <br>
                    <div style="width:720px;margin: auto;text-align: left;">
		
											<form action = "/aaaaaa/CFilesServlet" method="post" style="font-family: '微软雅黑';font-size: large;">
											查询文件<select name="choice" style="width: auto;background: white;">
														<option value="1">按ID查询</option>
														<option value="2">按名称查询</option>
														<option value="3">查询全部</option>
														</select><br /><br />
											请输入查询文件的  ID&nbsp;&nbsp;<input type=" text" name="f_id" style="background: white;"/><br/><br />
											请输入查询文件的名字<input type=" text" name="f_name" style="background: white;"/><br>
                                            <input type="submit" value="查询" class="btn btn-default btn-xl page-scroll"/>
											</form>
											</div>
											
                </div>
                 <div class="media wow fadeInRight" style="width:1000px;margin: auto;text-align: left;">
										<hr>
										<h3 style="background: white; font-family: '微软雅黑';width=100%: auto;">问题信息表</h3>
										<table border="0" style="font-family: '微软雅黑';font-size: larger;" class="hovertable">
										<tr>
			<td>文件编号</td><td>文件科目</td><td>文件名</td><td>上传者</td><td>文件地址<td>文件类型</td><td>操作</td>
			</tr>
											<c:forEach items="${f__users}" var="u">
									<tr>
			<td>${u.f_id }</td><td>${u.f_subject}</td><td>${u.f_name}</td><td>${u.f_id1}</td><td>${u.f_address}</td><td>${u.f_category}</td>
	
												<td>
											<a href="/aaaaaa/SFilesServlet?f_id=${u.f_id}">删除</a>&nbsp;&nbsp;</td>
											
										</tr>
										</c:forEach>
										</table>
										</div><br>
                 
            </div>
        </div>
    </section>
      <div id="aboutModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
        <div class="modal-content">
        	<div class="modal-body">
        		<h2 class="text-center">LLG项目组</h2>
        		<h5 class="text-center">
        	       团队口号：迎接挑战，勇于创新，乐观向上，永不言弃，超越自我，追求卓越。
        		</h5>
        		<p class="text-justify">
        		团队宗旨：   团结，协作，齐心共赢;同德才能走的更近，同心才能走的更远;开拓不息，奋斗不止;激昂挑战人生，成就团队梦想。
        		</p>
        		<p class="text-center"><a href="sy.jsp">了解我们</a></p>
        		<br/>
        		<button class="btn btn-primary btn-lg center-block" data-dismiss="modal" aria-hidden="true"> OK </button>
        	</div>
        </div>
        </div>
    </div>
    <div id="alertModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-sm">
        <div class="modal-content">
        	<div class="modal-body">
        		<h2 class="text-center">Nice Job!</h2>
        		<p class="text-center">You clicked the button, but it doesn't actually go anywhere because this is only a demo.</p>
        		<p class="text-center"><a href="#">Learn more at BootstrapZero</a></p>
        		<br/>
        		<button class="btn btn-primary btn-lg center-block" data-dismiss="modal" aria-hidden="true">OK <i class="ion-android-close"></i></button>
        	</div>
        </div>
        </div>
    </div>
    <!--scripts loaded here -->
    <script src="./js/jquery1.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/jquery.easing.min.js"></script>
    <script src="./js/wow.js"></script>
    <script src="./js/scripts.js"></script>
    </body>
  </body>
</html>
<!-- offers -->
<!-- footer -->

	
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