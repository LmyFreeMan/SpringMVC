<%--
  Created by IntelliJ IDEA.
  User: Coder
  Date: 2020/1/26
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="static/css/bootstrap.min.css">
</head>
<body>
<form class="form-horizontal" action="/SpringMVC/data/findById">
    <fieldset>
        <div id="legend" class="">
            <legend class="">学生表</legend>
        </div>
        <div class="control-group">
            <!-- Text input-->
            <label class="control-label" >学号</label>
            <div class="controls">
                <input type="text" value="2016512981" class="input-xlarge" id="stuNo" name="stuNo">
                <p class="help-block">请输入您的学号</p>
            </div>
        </div>
        <div class="control-group">
            <!-- Text input-->
            <label class="control-label" >姓名</label>
            <div class="controls">
                <input type="text" value="ls" class="input-xlarge" id="stuName" name="stuName">
                <p class="help-block">请输入您的姓名</p>
            </div>
        </div>
        <div class="control-group">
            <!-- Text input-->
            <label class="control-label" >专业</label>
            <div class="controls">
                <input type="text" value=1 class="input-xlarge" id="classId" name="classId">
                <p class="help-block">请输入您的专业</p>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">提交</label>
            <!-- Button -->
            <div class="controls">
                <button class="btn btn-info" type="submit">提交</button>
            </div>
        </div>
    </fieldset>
</form>
</body>
</html>