<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Login</title>
</head>
<body>

<h1>Login</h1>

<form method="POST" action="/demo/Login">
	Username: <input name="loginInfo" type="text" placeholder="Username" />
	Password: <input name="loginInfo" type="password" placeholder="password" />
	<input type="submit" value="Submit" />
</form>

<span style="color: red">Wrong login credentials</span>

</body>

</html>