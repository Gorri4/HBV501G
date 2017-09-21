<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Krossar</title>
</head>
<body>

<h1>Krossar</h1>

<form method="POST" action="eyduFyllingar">
<p>${spurningin}</p>
<br>

<input type="radio" name="answers" id="1" value=${valmog1}>
<label for="1">${valmog1}</label>

<input type="radio" name="answers" id="2" value=${valmog2}>
<label for="2">${valmog2}</label>

<input type="radio" name="answers" id="3" value=${valmog3}>
<label for="3">${valmog3}</label>

<input type="radio" name="answers" id="4" value=${valmog4}>
<label for="4">${valmog4}</label>

<br>

<input type="submit" value="Submit" />

</form>

<p>Rangt Svar!</p>

</body>

</html>