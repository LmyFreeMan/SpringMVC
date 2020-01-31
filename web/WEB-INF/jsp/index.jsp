<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>第一个Spring-MVC</title>
</head>
<body>
这是我的第一个Spring—MVC
我从servlet拿到的第一个数据：${requestScope.key1}
我又拿到了数据：${username} ${user},${student}

<fmt:message key="resoure.welecome"></fmt:message>
<fmt:message key="resoure.exit"></fmt:message>
</body>
</html>
