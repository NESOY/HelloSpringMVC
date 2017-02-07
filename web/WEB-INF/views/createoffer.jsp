<%--
  Created by IntelliJ IDEA.
  User: NESOY
  Date: 2017-02-05
  Time: 오후 2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
    <title>createOffer</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/docreate">
<table class="formtable">
    <tr>
        <td class="label">Name:</td>
         <td><input class ="control" name="name" type="text"/></td>
    </tr>
    <tr>
        <td class="label">Email:</td>
        <td><input class ="control"name="email" type="text"/></td>
    </tr>
    <tr>
        <td class="label">Text:</td>
        <td><textarea class ="control" rows="10" cols="10" name="text"></textarea></td>
    </tr>
    <tr>
        <td class="label"></td>
        <td><input class ="control" value="Create Offer" type="submit"></td>
    </tr>
</table>
</form>
</body>
</html>
