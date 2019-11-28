<%--
  Created by IntelliJ IDEA.
  User: Coder
  Date: 2019/11/28
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>restful</title>
</head>
<body>
<input type="button" name="btn1" id="add" value="增加">
<input type="button" name="btn2" id="del" value="删除">
<input type="button" name="btn3" id="edit" value="修改" >
<input type="button" name="btn4" id="search" value="查询">
</body>
<script src="static/js/jquery-3.1.1.min.js"></script>
<script>
    $(function () {
        $("#search").click(
            function () {
                $.get("users/1",null,function (data) {
                    alert(data.success+":"+data.msg);
                },"json")
            });

        $("#add").click(
            function () {
                $.post("users",{id:1},function (data) {
                    alert(data.success+":"+data.msg);
                },"json")
            });


        $("#edit").click(
            function () {
                $.post("users/1",{id:1,"_method":"PUT"},function (data) {
                    alert(data.success+":"+data.msg);
                },"json")
            });



        $("#del").click(
            function () {
                $.post("users/1",{"_method":"DELETE"},function (data) {
                    alert(data.success+":"+data.msg);
                },"json")
            });



    })
</script>
</html>
