<%--&lt;%&ndash;<%@ page import="com.nlu.service.ProductService" %>&ndash;%&gt;--%>
<%--&lt;%&ndash;<%@ page import="com.nlu.model.Product" %>&ndash;%&gt;--%>
<%--&lt;%&ndash;<%@ page import="java.util.List" %>&ndash;%&gt;--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <form action="login" method="post" class="form1" >
        <p class="text-danger"style="color: red;font-size: 16px;margin-left: 75px">${mess}</p>
        <input class="un " type="text" align="center" required placeholder="Tên người dùng" name="username"/>
        <input class="pass" type="password" align="center" required placeholder="Mật khẩu" name="password"/>
        <input value="login" type="submit" class="submit" ></input>
        <a class="forgot" align="center" href="">Forgot <i class = "fas fa-key"></i> </a>
        <a class="signup" align="center" href="">Sign up  </a>
        <p class="hotline" align="center" >Hotline 0927007791<a href="#"></a> </p>
    </form>


</div>
</body>
</html>