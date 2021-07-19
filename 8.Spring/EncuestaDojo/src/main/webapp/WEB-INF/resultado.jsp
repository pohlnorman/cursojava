<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
<div id="container">
		<h2>Información enviada</h2>
		<h2 class="push">Nombre: <c:out value="${name}"/></h2>
		<h2 class="push">Ubicación Dojo: <c:out value="${location}"/></h2>
		<h2 class="push">Leguaje favorito: <c:out value="${language}"/></h2>
		<h2 class="push">Comentario: <c:out value="${comment}"/></h2>
	</div>
</body>
</html>