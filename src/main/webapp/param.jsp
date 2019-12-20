<%--
  Created by IntelliJ IDEA.
  User: 16190
  Date: 2019/11/28
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
<!--[1]-->
<a href="param/testParam?username=sollan&password=123">请求参数的绑定</a>
<br>

<!--[2]会根据name来寻找ParamController类中属性的Set方法，进行值匹配-->
<form action="param/saveAccount" method="post">
    <!--普通属性-->
    昵称：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    金额：<input type="text" name="money"><br>
    <!--对象类型数据-->
    用户姓名：<input type="text" name="user.uname"><br>
    用户年龄：<input type="text" name="user.age"><br>
    <!--集合类型[List]-->
    用户姓名：<input type="text" name="list[0].uname"><br>
    用户年龄：<input type="text" name="list[0].age"><br>
    <!--集合类型[Map]-->
    用户姓名：<input type="text" name="map['key'].uname"><br>
    用户年龄：<input type="text" name="map['key'].age"><br>
    <input type="submit" value="提交">

</form>

<br/>
<hr/>
<br/>

<!--[3]自定义类型转换 字符串19-11-29转换为时间格式-->
<form action="param/saveUser" method="post">
    用户姓名：<input type="text" name="uname"/><br>
    用户年龄：<input type="text" name="age"/><br>
    用户生日：<input type="text" name="date"/><br>
    <input type="submit" value="提交">
</form>

<br/>
<hr/>
<br/>

<!--[4]-->
<a href="/param/testServlet">获取Servlet原生对象</a>

</body>
</html>
