<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Usted a visitado <a href="http://localhost:8080/">http://localhost:8080/</a> <c:out value="${count}"/> vez/veces.</h1>
	<a href="http://localhost:8080/"><h1>quieres hacer otra visita?</h1></a>
	<a href="/reset"><button>Restablecer contador</button></a>
</body>
</html>