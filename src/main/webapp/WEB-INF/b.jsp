<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/4 0004
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--<c:forEach items="${data.lists}" var="s">--%>
<c:forEach items="${data.lists}" var="s">
    <tr>
        <td>${s.id}</td>
        <td>${s.name}</td>
        <td>${s.age}</td>
        <td><img src="${s.img}" width="40px" height="40px"> </td>
        <td>${s.address}</td>
        <td>${s.unit}</td>
        <td>${s.rank}</td>
        <td><a href="delete?id=${s.id}">删除</a> </td>
        <td><a href="update?id=${s.id}">修改</a> </td>
    </tr>
</c:forEach>
</tbody>
</body>
</html>
