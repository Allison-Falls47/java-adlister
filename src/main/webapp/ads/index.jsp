<%--
  Created by IntelliJ IDEA.
  User: allison.falls
  Date: 9/7/21
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Showing Ads</title>
</head>
<body>

<c:forEach var="ad" items="${ads}">
<div class="item">
    <h3>${ad.name}</h3>
    <p>${ad.description}</p>
</div>
    </c:forEach>


</body>
</html>
