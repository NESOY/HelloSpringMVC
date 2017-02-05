<%--
  Created by IntelliJ IDEA.
  User: NESOY
  Date: 2017-02-05
  Time: 오후 2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Offers</title>
</head>
<body>

<c:forEach var="offer" items="${offers}">
    <p>
        <c:out value="${offer}"></c:out>
    </p>
</c:forEach>


</body>
</html>
