<%--
  Created by IntelliJ IDEA.
  User: Coder
  Date: 2019/11/19
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册页面</title>
</head>
<body>
<form action="/data/model" method="post">
学号：<input type="text" name="stuno" value=""><br>
姓名：<input type="text" name="stuName" value=""><br>
班级：<input type="text" name="classId" value=""><br>
    <input type="submit" value="注册" name="sub">
</form>
</body>
</html>
