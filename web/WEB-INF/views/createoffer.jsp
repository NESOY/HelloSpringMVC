<%--
  Created by IntelliJ IDEA.
  User: NESOY
  Date: 2017-02-05
  Time: 오후 2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
    <title>createOffer</title>
</head>
<body>
<sf:form method="get" action="${pageContext.request.contextPath}/docreate" modelAttribute="offer">
<table class="formtable">
    <tr>
        <td class="label">Name:</td>
         <td><sf:input class ="control" path="name" type="text"/><br/>
        <sf:errors cssClass="error" path="name"></sf:errors>
         </td>
    </tr>
    <tr>
        <td class="label">Email:</td>
        <td><sf:input class ="control" path="email" type="text"/><br>
        <sf:errors cssClass="error" path="email"></sf:errors>
        </td>
    </tr>
    <tr>
        <td class="label">Your Offer:</td>
        <td><sf:textarea class ="control" rows="10" cols="10" path="text"></sf:textarea><br>
        <sf:errors cssClass="error" path="text"></sf:errors>
        </td>
    </tr>
    <tr>
        <td class="label"></td>
        <td><input class ="control" value="Create Offer" type="submit"></td>
    </tr>
</table>
</sf:form>
</body>
</html>
