<%--
  Created by IntelliJ IDEA.
  User: Coder
  Date: 2019/11/27
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<form action="login.do" name="loginForm" method="post">
    用户名称:<input type="text" name="username" value=""><br/>
    用户密码:<input type="password" value="password" name="password">
    登陆<input type="submit" value="登陆" name="sub">
</form>
</body>
</html>
