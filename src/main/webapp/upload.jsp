<%--
  Created by IntelliJ IDEA.
  User: dx
  Date: 2022/10/24
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="UploadServlet1" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="text" name="username">
    <input type="submit" value="upload">
</form>
</body>
</html>
