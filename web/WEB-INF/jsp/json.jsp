<%--
  Created by IntelliJ IDEA.
  User: Coder
  Date: 2019/11/23
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
</head>
<body>
<input type="button" value="json转bean" id="btn_json">
</body>
<script src="static/js/jquery-3.1.1.min.js"></script>
<script>

    $(document).ready(function(){
            //通过ajax请求
            var param='{"classId":2,"stuName":"xxx","stuNo":1}';
            $.ajax({
                url: "toBean.do",
                type: "POST",
                contentType: "application/json;charset=UTF-8",
                data:param,
                success: function(data){
                    console.log("success");
                    console.log(data)
                },
                dataType: "json",
                error: function(msg){
                    console.log(msg)
                }
            });
        });
</script>
</html>
