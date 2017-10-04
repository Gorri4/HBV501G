<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Valmynd</title>
</head>
<style>
body{
	margin-left: 50px;
	margin-right: 50px;
}

h1{
	text-align: center;
}

button{
	box-shadow: 1px 1px 1px 1px;
	border: none;
	background-color: #FFD700;
	width: 50%;
	height: 50%;
	font-size: 25px;
	font-style: italic;
	font-weight: bold;
	margin-right: 15px;
	margin-left: 15px;
}

form{
	width: 100%;
	height: 800px;
	display: flex;
	flex-direction: row;
}

/*
asdfasdf
*/
</style>
<body>
<div class = "Valmynd">
<div class ="header">
	<h1>Veljið æfingu</h1>
</div>
<div class = "form">
<form method="POST" action="valmynd">
    <button type="submit" name="button" value="button1">Æfing 1</button>
    <button type="submit" name="button" value="button2">Æfing 2</button>
</form>
</div>
</div>

</body>

</html>