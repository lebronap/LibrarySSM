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

    <title>Library System</title>
    <link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css'/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="Simple Login Form,Login Forms,Sign up Forms,Registration Forms,News latter Forms,Elements" ./>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
</head>

<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700'
      rel='stylesheet' type='text/css'>


<body>

<h1>Library System</h1>
<div class="login">
    <div class="ribbon-wrapper h2 ribbon-red">
        <div class="ribbon-front">
            <h2>User Login</h2>
        </div>
        <div class="ribbon-edge-topleft2"></div>
        <div class="ribbon-edge-bottomleft"></div>
    </div>
    <form action="login" method="post" enctype="multipart/form-data">
        <ul>
            <li>
                <input type="text" class="text" value="Number" name="number" onfocus="this.value = '';"
                       onblur="if (this.value == '') {this.value = 'Number';}"><a href="#" class=" icon user"></a>
            </li>
            <li>
                <input type="password" value="Password" name="password" onfocus="this.value = '';"
                       onblur="if (this.value == '') {this.value = 'Password';}"><a href="#" class=" icon lock"></a>
            </li>
        </ul>



        <div class="submit">
            <input type="submit" value="Login">
        </div>
    </form>
</div>
<!--start-copyright-->
<div class="copy-right">
    <p>Created by AP</p>
</div>
<!--//end-copyright-->
</body>
</html>