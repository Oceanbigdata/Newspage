<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>新闻列表</title>
    <link rel="stylesheet" href="/resources/css/news_list.css" />
    <script type="text/javascript" src="/resources/js/jquery-1.8.3.min.js" ></script>
    <script type="text/javascript" src="/resources/js/index.js" ></script>
</head>
<body>
<div class="nav">
    <div class="nav_left">
        <img src="img/01.png" />
    </div>

    <div class="nav_right">
        <span><a href="login.jsp" class="signIn">上传</a></span>
        <span>|</span>
        <span><a href="register.jsp" class="signIn">审核</a></span>
    </div>
</div>

<div class="main">
    <div class="main_list">
        <div class="list_title"><p><s:property value="#request.listname" />新闻列表</p></div>
        <div class="content">
            <ul>
                <c:forEach items="${list}" var="news">
                    <li class="newsstyle"><div><a href="detail?newsId=${news.newsId }">${news.newsTitle}</a></div><span>${news.newsDate}</span><span style="margin-right: 50px">${news.newsAuthor}</span></li>
                </c:forEach>
            </ul>
        </div>
        <div class="page">
            当前页数:[${pageIndex}/${pages}]&nbsp;
            <a class="pagestyle" href="news/list?pageIndex=1">首页</a>
            <a class="pagestyle" href="news/list?pageIndex=${pageIndex-1}">上一页</a>
            <a class="pagestyle" href="news/list?pageIndex=${pageIndex+1}">下一页</a>
            <a class="pagestyle" href="news/list?pageIndex=${pages}">末页</a>


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

