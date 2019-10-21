<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>新闻列表</title>
    <link rel="stylesheet" href="/resources/css/news_list.css" />
    <link rel="stylesheet" href="/resources/css/login.css" />
    <script type="text/javascript" src="/resources/js/jquery-1.8.3.min.js" ></script>
    <script type="text/javascript" src="/resources/js/index.js" ></script>
    <script type="text/javascript" src="/resources/js/login.js" ></script>
    <script type="text/javascript" src="/resources/js/review.js" ></script>
</head>
<body>
<div class="nav">
    <div class="nav_left">
        <img src="" />
    </div>

    <div class="nav_right">
        <span><a href="javascript:showDialog();">编辑</a></span>
        <span>|</span>
        <span><a href="javascript:showDialog1();">审核</a></span>
    </div>
</div>

<div class="ui-mask" id="mask" onselectstart="return false"></div>

<div class="ui-dialog" id="dialogMove" onselectstart='return false;'>
    <div class="ui-dialog-title" id="dialogDrag"  onselectstart="return false;" >

        登录

        <a class="ui-dialog-closebutton" href="javascript:hideDialog();">
            <img src="/resources/img/close_hov.png">
        </a>

    </div>
    <div class="ui-dialog-content">
        <form action="/editor/login" method="post" >
        <div class="ui-dialog-l40 ui-dialog-pt15">
            <input class="ui-dialog-input ui-dialog-input-username" name="username" type="input" placeholder="姓名" value="" />
        </div>
        <div class="ui-dialog-l40 ui-dialog-pt15">
            <input class="ui-dialog-input ui-dialog-input-password" name="password" type="input" placeholder="工号" value="" />
        </div>
        <div class="ui-dialog-l40">

        </div>
        <div>
            <input class="ui-dialog-submit" type="submit" value="登  录 " />
        </div>
        <div class="ui-dialog-l40">
            
        </div>
        </form>
    </div>
</div>


<div class="ui-mask" id="mask1" onselectstart="return false"></div>

<div class="ui-dialog" id="dialogMove1" onselectstart='return false;'>
    <div class="ui-dialog-title" id="dialogDrag1"  onselectstart="return false;" >

        登录

        <a class="ui-dialog-closebutton" href="javascript:hideDialog1();">
            <img src="/resources/img/close_hov.png">
        </a>

    </div>
    <div class="ui-dialog-content">
        <form action="/review/login" method="post" >
            <div class="ui-dialog-l40 ui-dialog-pt15">
                <input class="ui-dialog-input ui-dialog-input-username" name="username" type="input" placeholder="姓名" value="" />
            </div>
            <div class="ui-dialog-l40 ui-dialog-pt15">
                <input class="ui-dialog-input ui-dialog-input-password" name="password" type="input" placeholder="工号" value="" />
            </div>
            <div class="ui-dialog-l40">

            </div>
            <div>
                <input class="ui-dialog-submit" type="submit" value="登  录 " />
            </div>
            <div class="ui-dialog-l40">

            </div>
        </form>
    </div>
</div>





<div class="main">
    <div class="main_list">
        <div class="list_title"><p><s:property value="#request.listname" />新闻列表</p></div>
        <div class="content">
            <ul>
                <c:forEach items="${list}" var="news">
                    <li class="newsstyle"><div><a href="/news/detail?newsId=${news.newsId }">${news.newsTitle}</a></div><span>${news.newsDate}</span><span style="margin-right: 50px">${news.newsAuthor}</span></li>
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

    </div>
</div>
</body>
</html>

