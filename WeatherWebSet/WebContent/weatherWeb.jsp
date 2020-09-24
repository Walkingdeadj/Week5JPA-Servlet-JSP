<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Ames,IA weather record page</title>
</head>
<body>
	<h1> Hello! This is a page record weather in Ames </h1>
	<h1> Please record the new information </h1>
	<form action = "getInputServlet" method = "post">
	Please enter the day(Lower case please, web will transfer into upper case!):
	<input type="text" name="userDay" size="10">
	Please enter the degree:
	<input type="text" name="userDegree" size="10">
	<input type="submit" value= "Collect" />
	</form>
</body>
</html>