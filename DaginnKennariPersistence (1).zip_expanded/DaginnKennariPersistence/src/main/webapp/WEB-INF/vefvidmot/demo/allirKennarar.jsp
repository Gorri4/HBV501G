<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Allir kennarar </title>  
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/daginn.css"/>"/>
</head>
<body>
    <c:choose>
        <c:when test="${not empty kennarar}">
            <table class="kennarar">
                <thead>
                    <tr>
                        <th>Nafn</th>
                        <th>Heimilisfang</th>
                    </tr>
                </thead>
                <c:forEach var ="kennari" items="${kennarar}">
                    <tr>
                        <td>${kennari.nafn} </td>
                        <td>${kennari.heimilisfang}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h3> Engir kennarar></h3>
        </c:otherwise>
    </c:choose>
</body>
</html>