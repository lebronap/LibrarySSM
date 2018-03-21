<%--
  Created by IntelliJ IDEA.
  User: ap
  Date: 2018/3/9
  Time: 11:07
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

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Member</title>

    <!--
    Visual Admin Template
    http://www.templatemo.com/preview/templatemo_455_visual_admin
    -->

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet'
          type='text/css'>
    <link href="<%=basePath%>/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath%>/css/templatemo-style.css" rel="stylesheet">


</head>
<body>
<!-- Left column -->
<div class="templatemo-flex-row">
    <div class="templatemo-sidebar">
        <header class="templatemo-site-header">
            <div class="square"></div>
            <h1>${member.trueName}</h1>
        </header>
        <div class="profile-photo-container">
            <img src="<%=basePath%>/images/profile-photo.png" alt="Profile Photo" class="img-responsive">
            <div class="profile-photo-overlay"></div>
        </div>
        <!-- Search box -->
        <form class="templatemo-search-form" role="search">
            <div class="input-group">
                <a href="${pageContext.request.contextPath}/user/selectBookInfo1">
                    <button class="fa fa-search"></button>
                </a></div>
        </form>
        <div class="mobile-menu-icon">
            <i class="fa fa-bars"></i>
        </div>
        <nav class="templatemo-left-nav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/user/member" class="active"><i class="fa fa-users fa-fw"></i>Show Books</a></li>
                <li><a href="${pageContext.request.contextPath}/user/selectBookInfo1"><i class="fa fa-database fa-fw"></i>SELECT BOOKS</a></li>
            </ul>
        </nav>
    </div>
    <!-- Main content -->
    <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
            <div class="row">
                <nav class="templatemo-top-nav col-lg-12 col-md-12">
                    <ul class="text-uppercase">
                        <li><a href="" class="active">姓名：${member.trueName}</a></li>
                        <li><a href="" class="active">学号：${member.number}</a></li>
                        <li><a href="" class="active">借阅${member.borrowNum}次</a></li>
                    </ul>
                </nav>
            </div>
        </div>
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
    </div>
</div>

</body>
</html>
