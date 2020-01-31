<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form>
姓名:<form:input path="name"/>
年纪:<form:input path="age"/>
性别:<form:checkbox path="sex"></form:checkbox>
    <input type="submit" value="提交">
</form:form>
</body>
</html>
