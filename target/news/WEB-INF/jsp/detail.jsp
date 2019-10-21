<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<base href="<%=basePath%>">
		<title>新闻页面</title>
		<link rel="stylesheet" href="/resources/css/editor.css" />
		<script type="text/javascript" src="/resources/js/jquery-1.8.3.min.js" ></script>
		<script type="text/javascript" src="/resources/js/index.js" ></script>

		<style type="text/css">
			.newsAuthor{
				margin: 5px 25px;
			}
			.newsDate{
				margin: 5px 25px;
			}
			.content{
				margin: 20px auto;
				width: 60%;
			}

		</style>
	</head>
	<body>
		<div class="nav">
			<div class="nav_left">

			</div>
			<div class="nav_right">
				<span><a href="/news/list" class="signIn" style="text-decoration: blink ">返回</a></span>
			</div>
		</div>
		
		<div class="main">
			<center>
				<h1 class="newsTitle">${news.newsTitle}</h1>
				<span class="newsAuthor">作者：${news.newsAuthor}</span>
				<span class="newsDate">日期：${news.newsDate}</span><br />

			</center>
			<div class="content">
				${news.newsContent}
			</div>


			
			
		</div>
		
		<!--底部-->
		<div class="footer">
			<div class="footer_content">

			</div>
		</div>
	</body>
</html>
