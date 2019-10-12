<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<base href="<%=basePath%>">
		<title>新闻列表</title>
		<link rel="stylesheet" href="css/news_list.css" />
		<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
		<script type="text/javascript" src="js/index.js" ></script>
	</head>
	<body>
		<div class="nav">
			<div class="nav_left">
				<img src="img/01.png" />
			</div>
			<div class="nav_center">
				<ul class="nav_right_ul">
					<li><a href="index">首页</a></li>
					<li><a href="news">学院概况</a></li>
					<li><a href="alunews">校友栏目</a></li>
					<li><a href="company">学生分流</a></li>
					
				</ul>
			</div>
			<div class="nav_right">
				<span><a href="login.jsp" class="signIn">登录</a></span>
				<span>|</span>
				<span><a href="register.jsp" class="signIn">注册</a></span>
			</div>
		</div>
		
		<div class="main">
			<div class="main_list">
				<div class="list_title">新闻列表</div>
				<div class="content">
					<ul>
						<li>${news.newsId}</li>
						<li>${news.newsTitle}</li>
						<li>${news.newsContext}</li>
						<li>${news.newsAuthor}</li>
					</ul>
				</div>

				</div>
			</div>
			
			
		</div>
		
		<!--底部-->
		<div class="footer">
			<div class="footer_content">
				<p>Copyright ©2009-2016 华东交通大学软件学院版权所有</p>
				<p>地址:江西省南昌市经济技术开发区双港东大街808号</p>
				<p>邮编：330013</p>
			</div>
		</div>
	</body>
</html>
