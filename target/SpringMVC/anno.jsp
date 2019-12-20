<%--
  Created by IntelliJ IDEA.
  User: 16190
  Date: 2019/11/29
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解</title>
</head>
<body>

<!-- 常用注解@RequestParam -->
<a href="anno/testRequestParam?name=sollan">RequestParam-请求参数</a>

<br>

<!-- 常用注解@RequestBody -->
<form action="anno/testRequestBody" method="post">
    姓名：<input type="text" name="username"/><br>
    年龄：<input type="text" name="age"/><br>
    <input type="submit" value="提交"/>
</form>

<br>

<!-- 常用注解@PathVariable -->
<a href="anno/testPathVariable/10">PathVariable-路径变量</a>

<br>

<!-- 不常用注解@RequestHeader -->
<a href="anno/testRequestHeader">RequestHeader-获取请求头信息</a>

<br>

<!-- 不常用注解@CookieValue -->
<a href="anno/testCookieValue">CookieValue-获取cookie信息</a>

<br>

<!--常用注解@ModelAttribute-->
<form action="anno/testSessionAttributes" method="post">
    姓名：<input type="text" name="uname"/><br>
    年龄：<input type="text" name="age"/><br>
    日期：<input type="text" name="date"><br>
    <input type="submit" value="提交"/>
</form>

<br>

<!--常用注解@SessionAttributes-->
<a href="anno/testSessionAttributes?arg=难上加难">SessionAttributes注解</a>

</body>
</html>
