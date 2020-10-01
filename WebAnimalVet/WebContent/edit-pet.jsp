<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Files Change</title>
</head>
<body>
	<h1 style="font-size:40px">Choose which section you want to change and type in new info</h1>
	<form action = "editPetServlet" method = "post">
	Type: <input type ="text" name = "type" value ="${petToEdit.type}">
	Name: <input type = "text" name = "name" value = "${petToEdit.name}">
	Owner: <input type = "text" name = "owner" value = "${petToEdit.owner}">
	<input type = "hidden" name = "id" value = "${petToEdit.id}">
	<input type = "submit" value = "Save Edited Item">
	</form>
</body>
</html>