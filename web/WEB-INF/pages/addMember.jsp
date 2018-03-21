<%--
  Created by IntelliJ IDEA.
  User: ap
  Date: 2018/3/13
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
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
    <title>Add Member</title>
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


</head>
<body>
<!-- Left column -->
<div class="templatemo-flex-row">
    <div class="templatemo-sidebar">
        <header class="templatemo-site-header">
            <div class="square"></div>
            <h1>Add Member</h1>
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
        <div class="mobile-menu-icon">
            <i class="fa fa-bars"></i>
        </div>
        <nav class="templatemo-left-nav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/user/manager"><i class="fa fa-users fa-fw"></i>Manage
                    Books</a></li>
                <li><a href="${pageContext.request.contextPath}/user/addBookInfo"><i
                        class="fa fa-home fa-fw"></i>Add Book</a></li>
                <li><a href="${pageContext.request.contextPath}/user/addMember" class="active"><i
                        class="fa fa-bar-chart fa-fw"></i>ADD MEMBER</a></li>
                <li><a href="${pageContext.request.contextPath}/user/selectBookInfo"><i class="fa fa-database fa-fw"></i>SELECT BOOKS</a></li>
                <li><a href="${pageContext.request.contextPath}/user/updateBookInfo"><i class="fa fa-map-marker fa-fw"></i>UPDATE BOOK</a></li>
                <li><a href="${pageContext.request.contextPath}/user/deleteBookInfo"><i class="fa fa-sliders fa-fw"></i>DELETE BOOK</a></li>
                <li><a href="login.html"><i class="fa fa-eject fa-fw"></i>Sign Out</a></li>
            </ul>
        </nav>
    </div>
    <!-- Main content -->
    <div class="templatemo-content col-1 light-gray-bg">

        <div class="templatemo-content-container">
            <div class="templatemo-content-widget white-bg">
                <h2 class="margin-bottom-10">添加会员</h2>

                <%-- <c:if test="${message}">
                     return showMessage();
                 </c:if>--%>

                <form action="addMember" class="templatemo-login-form" method="post" enctype="multipart/form-data">

                    <div class="row form-group">
                        <div class="col-lg-6 col-md-6 form-group">
                            <label>Number</label>
                            <input type="number" class="form-control" name="number">
                        </div>
                        <div class="col-lg-6 col-md-6 form-group">
                            <label>TrueName</label>
                            <input type="text" class="form-control" name="trueName">
                        </div>
                    </div>


                    <%--下拉框
                       <div class="row form-group">
                           <div class="col-lg-6 col-md-6 form-group">
                               <label class="control-label templatemo-block">Single Selection Control</label>
                               <select class="form-control">
                                   <option value="html">HTML</option>
                                   <option value="plain">Plain Text</option>
                               </select>
                           </div>
                       </div>--%>


                    <%--添加文件--%>
                    <%--<div class="row form-group">
                        <div class="col-lg-12">
                            <label class="control-label templatemo-block">File Input</label>
                            <!-- <input type="file" name="fileToUpload" id="fileToUpload" class="margin-bottom-10"> -->
                            <input type="file" name="fileToUpload" id="fileToUpload" class="filestyle" data-buttonName="btn-primary" data-buttonBefore="true" data-icon="false">
                            <p>Maximum upload size is 5 MB.</p>
                        </div>
                    </div>--%>

                    <div class="form-group text-right">
                        <button class="templatemo-blue-button" value="member" onClick="return fun()">Add
                        </button>
                        <button type="reset" class="templatemo-white-button">Reset</button>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>


<script>
    function fun() {
        if (confirm("Are you sure to add it ？")) {
            this.form.submit();
            alert("add successful")
            return true;
        } else {
            return false;
        }
    }
</script>

<%--<script>
    function showMessage() {
        alert("add successful")
    }
</script>--%>

</body>
</html>

