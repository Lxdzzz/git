<%--
  Created by IntelliJ IDEA.
  User: 20614
  Date: 2020/11/9
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    
    <table border="1">
        <tr>
            <th>用户id</th>
            <th>用户姓名</th>
            <th>用户性别</th>
            <th>用户密码</th>
            <th>用户邮箱</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${ulist}" var="user">
            <tr>
                <th>${user.uid}</th>
                <th>${user.uname}</th>
                <th>${user.ugender}</th>
                <th>${user.upass}</th>
                <th>${user.uemail}</th>
                <th><a href="user?action=FindById&id=${user.uid}">修改</a> <a href="user?action=UserDelete&id=${user.uid}">删除</a> <a href="update.jsp">新增</a></th>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
