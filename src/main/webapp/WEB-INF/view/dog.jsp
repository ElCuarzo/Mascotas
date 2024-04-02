<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Resultado Dog</title>
</head>
<body>
    <h1>Información del perro:</h1>
    <p>Nombre: <c:out value="${Animal.getName()}"/></p>
    <p>Raza: <c:out value="${Animal.getBreed()}"/></p>
    <p>Peso: <c:out value="${Animal.getWeight()}"/></p>
    <p>Afecto: <c:out value="${Animal.showAffection()}"/></p>
</body>
</html>