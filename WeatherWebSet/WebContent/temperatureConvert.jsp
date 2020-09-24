<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temperature convert web</title>
</head>
<body>
	<h1> Hello! This is the page help convert a temperature to Kelvin or Celsius </h1>
	<h1>Please type in temperature</h1>
	<form action = "getTempServlet" method = "post">
	Please enter the temperature: 
	<input type="text" name="userDegree" size="10">
	<input type="submit" value= "convert" />
	</form>
</body>
</html>