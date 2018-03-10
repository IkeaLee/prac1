<%@ page language="java"  import="entity.StudentTab" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--
	主页  by郭洪序
-->
<html>
<head>
<title>Home</title>
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
	<div class="banner">
		<div class="header">
			<div class="container">
				<div class="logo">
					<h1><a href="sy.jsp">状元课堂</a></h1>
				</div>
					<nav class="navbar navbar-default" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<!--/.navbar-header-->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li class="active"><a href="sy.html">主页</a></li>
								<% StudentTab s=(StudentTab)request.getSession().getAttribute("s__user");%>
								
								<%  if(s!=null) {%>
								   <li><a href="grzx.jsp">个人中心</a></li>
								<%} else{%>
									<li> <a href="tgrzx.jsp">个人中心</a></li>
								<% }%>

								<li><a href="kczx.jsp">课程中心</a></li>
								<li><a href="dyzx.jsp">答疑中心</a></li>
								<li><a href="gxzx.jsp">共享中心</a></li>
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
		<div class="banner-info">
			<div class="container">
				<div class="details-1">
					<div class="col-md-10 dropdown-buttons">   
						<div class="col-md-3 dropdown-button">           			
							<div class="input-group">
								<input  name="slider-name" id="slider-name" placeholder="在此搜索" type="text" required="">
							</div>
						</div>
						<!---strat-date-piker
							<link rel="stylesheet" href="css/jquery-ui.css" />
							<script src="js/jquery-ui.js"></script>
							  <script>
									  $(function() {
										$( "#datepicker,#datepicker1" ).datepicker();
									  });
							  </script>
						<!---/End-date-piker---->

						
					  <div class="col-md-3 dropdown-button">           			
							<div class="book_date">
							
								<select  name="slider-name" id="slider-name" placeholder="年级" type="text" required="">
							<option value="p">高一</option>
								<option value="m">高二</option>         
								<option value="u">高三</option>
								<option value="o">其他</option>
							 </select></div>		
							</div>	
							<div class="col-md-3 dropdown-button">
						  <div class="section_1">
							 <select id="country" onChange="change_country(this.value)" class="frm-field required">
								<option value="math">数学</option>
								<option value="null">语文</option>         
								<option value="AX">英语</option>
								<option value="AX">其他</option>
							 </select>
						  </div>
						</div>		
						</div>   
						<div class="clearfix"> </div>
					</div> 
					<div class="col-md-2 submit_button"> 
						<form action="http://localhost/aaaaaa/dyzx/detail?q_id=1054">
							<input type="submit" value="搜索">
						</form>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	</div>		
	<!-- banner -->
	<!-- hod -->
	<div class="hod">
		<div class="container">
			<div class="col-md-6 hod-left">
				<img src="images/14.jpg" class="img-responsive" alt="">
			</div>
			<div class="col-md-6 hod-right">
				<h2>网络课的好处</h2>
				<p>网络学习给我们提供了一种轻松自由的学习环境、学习方式和学习平台，可以利用时间和空间的优势，自我决定学习时间和地点，可以让我们静下心来认真思考，仔细品味。通过网络学习，启发了我的思维，陶冶了我的情操，知识得到了充实和提高，深深地体会到了学习的快乐、知识的力量。 </p>
				<a class="hvr-shutter-in-horizontal" href="kczx.jsp">进入课程中心</a>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- hod -->
    
	<!-- tels -->
	<div class="tels">
		<div class="container">
			<div class="col-md-4 tels-left">
				<h4>数学 <span>王后雄</span></h4>
				<img src="images/4.jpg" class="img-responsive" alt="">
				<p>教师讲课深入浅出，条理清楚，层层剖析，环环相扣，论证严密，结构严谨，用思维的逻辑力量吸引学生的注意力，用理智控制课堂教学进程。学生通过听教师的讲授，不仅学到知识，也受到思维的训练，还受到教师严谨的治学态度的熏陶和感染。虽然有的教师在课堂上不苟言笑，但内心却充满对知识的透彻理解和对人的理智能力发展的执著追求。</p>
				<a class="hvr-shutter-in-horizontal" href="http://video.1kejian.com/senior/senior1/78285/">进入课堂</a>
			</div>
			<div class="col-md-4 tels-left">
				<h4>语文 <span>张雪峰</span></h4>
				<img src="images/9.jpg" class="img-responsive" alt="">
				<p>教师讲课情绪饱满，将对科学的热爱和追求融于对学生的关心、教导和期望之中，充满着对人的高度尊重的信赖。讲到动情之处，往往情绪高涨，慷慨激昂，滔滔不绝，扣人心弦，给人以震撼人心的力量，引起学生强烈的情感共鸣，师生之间在理解、沟通的前提下，共同营造出一种渴求知识、探索真理的热烈气氛。学生在这样的教师引导下，所获得的不仅仅是知识的训练价值，还包括人格、情感的陶冶价值。,</p>
				<a class="hvr-shutter-in-horizontal" href="http://video.1kejian.com/senior/senior2/69413/">进入课堂</a>
			</div>
			<div class="col-md-4 tels-left">
				<h4>英语 <span>新东方</span></h4>
				<img src="images/3.jpg" class="img-responsive" alt="">
				<p>教师讲课亲切自然，朴实无华，没有矫揉造作，也不刻意渲染，而是娓娓而谈，细细道来，师生之间在一种平等、协作、和谐的气氛下，进行默默的情感交流，将对知识的渴求和探索融于简朴、真实的教学情景之中，学生在静静的思考、默默的首肯中获得知识。教师讲课虽然声音不高，但神情自若，情真意切，犹如春雨渗入学生心田，润物细无声，它虽没有江海波澜的壮阔，却不乏山涧流水之清新，给人一种心旷神怡、恬静安宁的感受。 </p>
				<a class="hvr-shutter-in-horizontal" href="http://video.1kejian.com/senior/senior2/79323/">进入课堂</a>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- tels -->
	<!-- special -->
	<div class="special">
		<div class="container">
			<div class="spe-info">
				<h3>学习环境</h3>
				<p>只要拥有网，你可以随时随地上网进行学习，而不用像传统学习把大把的时间花费在路上，而且时间固定还长，使人疲劳，你可以在舒适自由自在的环境学习，而且不会的地方可以反复听或者提问，直到弄懂。</p>
			</div>
		</div>
	</div>
	<!-- special -->
	<!-- quick -->
	<div class="quick">
		<div class="container">
			<div class="col-md-4 quick-left">
				<h3>Most Popular</h3>
					<ul>
						<li><a href="http://localhost/aaaaaa/dyzx/detail?q_id=1056">1：理解社会必要劳动时间需关注三个因素。</a></li>
						<li><a href="http://localhost/aaaaaa/dyzx/detail?q_id=1045">2：某空间存在竖直向下的匀强电场和垂直纸面向里的匀强磁场，已知一离子在电场力和磁场力作用下，从静止开始沿曲线acb运动，到达b点时速度为零，c点为运动的最低点，则(　　)</a></li>
                       	<li><a href="http://localhost/aaaaaa/dyzx/detail?q_id=1054">3：国家发改委、国家物价局等多次发布条文，要求商品销售要实行明码标价。这一行为在我国最早可以追溯到</a></li><a href="dyzx.jsp">More</a>
					</ul>
			</div>
			<div class="col-md-4 quick-left">
				<h3>下载课件</h3>
				<div class="new">
					<div class="n-lft">
						<h5>最多下载</h5>
					</div>
					<div class="n-rgt">
						<li><a href="http://k.3edu.net/Down.asp?SoftID=992470">概率复习课件。</a></li><a href="gxzx.jsp">More</a>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="new">
					<div class="n-lft">
						<h5>浏览最多</h5>
					</div>
					<div class="n-rgt">
						<li><a href="http://a.3edu.net/Down.asp?SoftID=995958">经济全球化的趋势教案</a></li><a href="gxzx.jsp">More</a>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="new-1">
					<div class="n-lft">
						<h5>最新上传</h5>
					</div>
					<div class="n-rgt">
						<li><a href="http://k.3edu.net/Down.asp?SoftID=996059">投资理财的选择课件</a></li><a href="gxzx.jsp">More</a>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="col-md-4 quick-left">
				<h3>提出问题</h3>
						<form action="TwDyzxServlet" method="post">
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
			<div class="clearfix"></div>
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