<%--
  Created by IntelliJ IDEA.
  User: 20614
  Date: 2020/11/9
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>用户id</th>
        <th>用户姓名</th>
        <th>用户性别</th>
        <th>用户密码</th>
        <th>用户邮箱</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${ulist}" var="list">
        <tr> 
            <th>${list.uid}</th>
            <th>${list.uname}</th>
            <th>${list.ugender}</th>
            <th>${list.upass}</th>
            <th>${list.uemail}</th>
            <th><a href="">修改</a> <a href="">删除</a><a href="">新增</a> </th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
