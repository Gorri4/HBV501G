<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Góğan daginn </title>
</head>
<body>

<h1>Góğan daginn ${kennari.getNafn()}</h1>
<h1>Allar upplısingar ${kennari} </h> 
<form method="get" action="/demo/listiKennara">
 <input type="submit" value="Allir"/>
</form>

<form method="get" action="/demo/spyrjaNotanda">
 <input type="submit" value="Nır kennari"/>
</form>

</body>
<!-- method="POST" action="/demo/listiKennara" -->
</html>