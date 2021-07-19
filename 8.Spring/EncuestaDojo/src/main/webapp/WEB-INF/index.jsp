<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
<div id="container">
		<form action="/resultado" method="post">
			<h2>Nombre: <input class="formfields" type="text" name="name"></h2>
			<h2>Ubicación Dojo: <select class="formfields" name="location"></h2>
				  <option value="Berkley">Santiago</option>
				  <option value="Boise">Concepcion</option>
				  <option value="Chicgao">Los angeles</option>
				  <option value="Dallas">Temuco</option>
  				  <option value="Los Angeles">Valdivia</option>
				  <option value="Seattle">Arica</option>
				  <option value="Silicon Valley">Viña del mar</option>
				  <option value="Tulsa">Talca</option>
  				  <option value="Tyson's Corner">Chiloe</option>
				  </select>
			<h2>Lenguaje favorito: <select class="formfields" name="language"></h2>
				  <option value="Java">Java</option>
				  <option value="Python">Python</option>
				  <option value="C#/.NET">C#/.NET</option>
				  <option value="MEAN">MEAN</option>
				  <option value="Ruby">Ruby</option>
				  <option value="iOS/Swift">iOS/Swift</option>
				  </select>
				<h2>Comentario (optional):</h2>
			<h2><input class="formfieldscomment" type="textarea" name="comment"></h2>
			<h2><input class="formfieldsbutton" type="submit" value="Enviar"></h2>
		</form>
	</div>
</body>
</html>