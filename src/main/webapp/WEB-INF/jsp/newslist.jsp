<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻列表</title>
</head>
<body>
<ul>
    <c:forEach items="${list}" var="news">
        <li>${news.newsTitle}</li>
    </c:forEach>
</ul>



</body>
</html>
