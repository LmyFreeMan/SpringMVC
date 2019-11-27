<%--
  Created by IntelliJ IDEA.
  User: Coder
  Date: 2019/11/26
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form commandName="user">
    <form:errors path="username" />
    <form:errors path="phone" />
</form:form>
</body>
</html>
