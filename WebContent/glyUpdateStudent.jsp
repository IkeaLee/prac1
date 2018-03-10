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
			</style>
			<!-- tableCSS end -->
			
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
                        <a class="page-scroll" href="/finallwork/gly.jsp#one">学生用户管理</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="/finallwork/gly.jsp#two">教师用户管理</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="/finallwork/gly.jsp#three">课程管理</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="/finallwork/gly.jsp#four">问题管理</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="/finallwork/gly.jsp#last">文件管理</a>
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
    
    <section class="bg-primary" id="one">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2 text-center">
                    <h2 class="margin-top-0 text-primary">修改学生用户</h2>
                    <br>
                <div class="media wow fadeInRight" style="width:1000px;margin: auto;text-align: left;">
					<hr>
						<h3 style="background: #9900ff; font-family: '微软雅黑';width: auto;">学生信息表</h3>
							
							<form action="UpdateS_userServlet2" method="post">
							<table border="0" style="font-family: '微软雅黑';font-size: larger;" class="hovertable">
							<tr><td>用户id</td><td>
							<input style="width: 300px" type="text" name="s_id" readonly value="${s__user.s_id }"/></td></tr>
							<tr><td>用户名称 </td><td>
							<input style="width: 300px" type="text" name="s_name" value="${s__user.s_name }"/></td></tr>
							<tr><td>用户密码:</td><td>
							<input style="width: 300px" type="password" name="s_password"  value="${s__user.s_password }"/></td></tr>
							<tr><td>用户性别:</td><td>
							<input style="width: 300px" type="text" name="s_sex" value="${s__user.s_sex }"/></td></tr>
							<tr><td>用户年龄:</td><td>
							<input style="width: 300px" type="text" name="s_age" value="${s__user.s_age }"/></td></tr>
							<tr><td>用户学校:</td><td>
							<input style="width: 300px" type="text" name="s_school" value="${s__user.s_school }"/></td></tr>
							<tr><td>用户年级:</td><td>
							<input style="width: 300px" type="text" name="s_grade" value="${s__user.s_grade }"/></td></tr>
							<tr><td>弱势科目:</td><td>
							<input style="width: 300px" type="text" name="s_subject" value="${s__user.s_subject }"/></td></tr>
							<tr><td>联系方式:</td><td>
							<input style="width: 300px" type="text" name="s_telno" value="${s__user.s_telno}"/></td></tr>
							<tr><td colspan="2">
							<input type="submit" value="提交"/>
							<input type="reset" value="重置"/>
							</td></tr>
							</table>
							</form>
                                        
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