<%--
  Created by IntelliJ IDEA.
  User: ap
  Date: 2018/3/8
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyLogin</title>
</head>
<body>
<form action="login" method="post" enctype="multipart/form-data">
    number : <input name = "number"/> <br/>
    password : <input type="password" name = "password"/><br/>


    <%--age : <input name = "age"/> <br/>--%>
    <%--File : <input type="file" name="file"/><br/>
    File : <input type="file" name="file"/><br/>
    File : <input type="file" name="file"/><br/>
    File : <input type="file" name="file"/><br/>--%>


    <input type="submit" value="Login"/>
</form>
</body>
</html>
