<%--
  Created by IntelliJ IDEA.
  User: 20614
  Date: 2020/11/10
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user" method="post">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="id" value="${user.uid}">
    <div>用户姓名：<input type="text" name="usrname" value="${user.uname}"> </div>
    <div>用户密码：<input type="text" name="usrpass" value="${user.upass}"> </div>
    <div>用户性别：<input type="text" name="usrgender" value="${user.ugender}"> </div>
    <div>用户邮箱：<input type="text" name="usremail" value="${user.uemail}"></div>
    <div><input type="submit" value="提交修改"></div>
</form>
</body>
</html>
