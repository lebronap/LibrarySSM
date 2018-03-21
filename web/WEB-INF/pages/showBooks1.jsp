<%--
  Created by IntelliJ IDEA.
  User: ap
  Date: 2018/3/17
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
		/*System.out.println(basePath);*/
    %>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add Book</title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <!--
    Visual Admin Template
    http://www.templatemo.com/preview/templatemo_455_visual_admin
    -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet'
          type='text/css'>
    <link href="<%=basePath%>/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath%>/css/templatemo-style.css" rel="stylesheet">

    <title>BookInfo</title>
</head>
<body>

<div class="templatemo-content-container">
    <div class="templatemo-content-widget no-padding">
        <div class="panel panel-default table-responsive">
            <table class="table table-striped table-bordered templatemo-user-table">
                <thead>
                <tr>
                    <td><a href="" class="white-text templatemo-sort-by"># <span class="caret"></span></a></td>
                    <td><a href="" class="white-text templatemo-sort-by">BookTitle <span
                            class="caret"></span></a></td>
                    <td><a href="" class="white-text templatemo-sort-by">BookNum <span class="caret"></span></a>
                    </td>
                    <td><a href="" class="white-text templatemo-sort-by">Author <span class="caret"></span></a>
                    </td>
                    <td><a href="" class="white-text templatemo-sort-by">Press <span class="caret"></span></a>
                    </td>
                    <td><a href="" class="white-text templatemo-sort-by">Address <span class="caret"></span></a>
                    </td>
                    <td><a href="" class="white-text templatemo-sort-by">Type <span class="caret"></span></a>
                    </td>
                </tr>
                </thead>

                <tbody>
                <c:forEach items="${books}" var="book">

                    <tr>
                        <td>${book.id}</td>
                        <td>${book.bookTitle}</td>
                        <td>${book.bookNum}</td>
                        <td>${book.author}</td>
                        <td>${book.press}</td>
                        <td>${book.address}</td>
                        <td>${book.typeX}</td>
                    </tr>

                </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
</div>

</body>
</html>
