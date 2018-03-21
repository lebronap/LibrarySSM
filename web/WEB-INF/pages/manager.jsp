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

    <%--<%!
        private String trueName;
    %>--%>

    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
		/*System.out.println(basePath);*/
    %>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Manager</title>

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
            <h1>${manager.trueName}</h1>


            <%--trueName =${manager.trueName}
            <%
                session.setAttribute("trueName",trueName);
            %>--%>


        </header>
        <div class="profile-photo-container">
            <img src="<%=basePath%>/images/profile-photo.png" alt="Profile Photo" class="img-responsive">
            <div class="profile-photo-overlay"></div>
        </div>
        <!-- Search box -->

        <form class="templatemo-search-form" role="search">
            <div class="input-group">
                <a href="${pageContext.request.contextPath}/user/selectBookInfo">
                    <button class="fa fa-search"></button>
                </a>
            </div>
        </form>
        <%--<form class="templatemo-search-form" role="search">
            <div class="input-group">
                <button type="submit" class="fa fa-search"></button>
                <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
            </div>
        </form>--%>
        <div class="mobile-menu-icon">
            <i class="fa fa-bars"></i>
        </div>
        <nav class="templatemo-left-nav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/user/manager" class="active"><i class="fa fa-users fa-fw"></i>Manage Books</a></li>
                <li><a href="${pageContext.request.contextPath}/user/addBookInfo"><i class="fa fa-home fa-fw"></i>Add
                    Book</a></li>
                <li><a href="${pageContext.request.contextPath}/user/addMember"><i class="fa fa-bar-chart fa-fw"></i>ADD MEMBER</a></li>
                <li><a href="${pageContext.request.contextPath}/user/selectBookInfo"><i class="fa fa-database fa-fw"></i>SELECT BOOKS</a></li>
                <li><a href="${pageContext.request.contextPath}/user/updateBookInfo"><i class="fa fa-map-marker fa-fw"></i>UPDATE BOOK</a></li>
                <li><a href="${pageContext.request.contextPath}/user/deleteBookInfo"><i class="fa fa-sliders fa-fw"></i>DELETE BOOK</a></li>
                <li><a href="login.html"><i class="fa fa-eject fa-fw"></i>Sign Out</a></li>
            </ul>
        </nav>
    </div>
    <!-- Main content -->
    <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
            <div class="row">
                <nav class="templatemo-top-nav col-lg-12 col-md-12">
                    <ul class="text-uppercase">
                        <li><a href="" class="active">图书类别</a></li>
                        <li><a href="" class="active">IT</a></li>
                        <li><a href="">医学</a></li>
                        <li><a href="">外语</a></li>
                        <li><a href="login.html">Sign in form</a></li>
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
                            <%--<td>Edit</td>
                            <td>Delete</td>--%>
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
