<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻审核</title>
    <link rel="stylesheet" href="/resources/css/manage.css" />
    <script type="text/javascript" src="/resources/js/jquery-1.8.3.min.js" ></script>
    <script type="text/javascript" src="/resources/js/manage.js"></script>
</head>
<body>
<div class="nav">
    <div class="manage_info">
        <span>欢迎管理员：</span><span style="color:#99CC00">${username}</span><a href='/news/list' style="float:right;color:99CCCC;margin-right:5px">返回</a>
    </div>
</div>

<div class="main">
    <div class="right_main">
        <div class="rm_meun manage_2">
            <div class="manage_top">
                <ul>
                    <li>id</li>
                    <li>标题</li>
                    <li></li>
                    <li style="margin-left: 98px">作者</li>
                    <li style="margin-right: 15px">日期</li>
                    <li style="margin-left: 130px">操作</li>
                </ul>
            </div>
            <div class="manage_main manage_main_news">
                <c:forEach items="${list}" var="news">
                    <div class="ul_box">
                        <ul>
                            <li class="manage_main_li">${news.newsId }</li>
                            <li class="manage_main_li manage_main_li_title">${news.newsTitle }</li>
                            <li class="manage_main_li">${news.newsAuthor }</li>
                            <li class="manage_main_li">${news.newsDate }</li>
                            <li class="manage_main_btn manage_update_btn" style="margin-left: 160px"><a href="/review/yes?newsId=${news.newsId }">通过</a></li>
                            <li class="manage_main_btn manage_del_btn"><a href="/review/no?newsId=${news.newsId }">拒绝</a></li>
                        </ul>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>



</body>
</html>
