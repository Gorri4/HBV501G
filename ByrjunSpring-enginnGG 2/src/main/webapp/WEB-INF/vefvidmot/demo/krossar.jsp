<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Krossar</title>
</head>
<body>

<h1>Krossar</h1>

<form method="POST" action="hvad">Choose the correct translation for "Horse"
<br>

<input type="radio" name="answers" id="1" value="Hestur">
<label for="1">Hestur</label>

<input type="radio" name="answers" id="2" value="�nd">
<label for="2">�nd</label>

<input type="radio" name="answers" id="3" value="Hundur">
<label for="3">Hundur</label>

<input type="radio" name="answers" id="4" value="K�ttur">
<label for="4">K�ttur</label>

<br>

<input type="submit" value="Submit" />

</form>

</body>

</html>