<%--&lt;%&ndash;<%@ page import="com.nlu.service.ProductService" %>&ndash;%&gt;--%>
<%--&lt;%&ndash;<%@ page import="com.nlu.model.Product" %>&ndash;%&gt;--%>
<%--&lt;%&ndash;<%@ page import="java.util.List" %>&ndash;%&gt;--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/LoginPage.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <title>Sign in</title>
</head>
<body>
<div class="main">
    <div class="sign"> <i class="fas fa-user"></i> </div>
    <form class="form1">
        <input class="un " type="text" align="center" placeholder="Tên người dùng"/>
        <input class="pass" type="password" align="center" placeholder="Mật khẩu"/>
        <a class="submit" align="center"  href="store/storePage.jsp">Sign in </a>
        <a class="forgot" align="center" href="admin-page/quanlihoadon.jsp">Forgot <i class = "fas fa-key"></i> </a>
        <a class="signup" align="center" href="admin-page/chitiethoadon.jsp">Sign up  </a>
        <p class="hotline" align="center" >Hotline 0927007791<a href="#"></a> </p>
    </form>


</div>
</body>
</html>