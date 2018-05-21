<%--
  Created by IntelliJ IDEA.
  User: private
  Date: 11.05.2018
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Hello

<form action="/saveUserWithAvatarAndSendEmail" method="post" enctype="multipart/form-data">
    <label for="email">Email</label>
    <input id="email" type="email" name="email" placeholder="email">
    <label for="file">Avatar</label>
    <input id="file" type="file" name="file" placeholder="">
    <input type="submit" name="" placeholder="">


    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

</form>

</body>
</html>
