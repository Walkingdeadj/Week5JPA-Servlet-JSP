<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
	You have entered a new information: <br />
	Day: ${userWeatherPouch.getDay()} <br />
	The degree is: ${userWeatherPouch.getDegree()} celsius <br />
	<p>
	<a href = "weatherWeb.jsp">Type in another information</a>
</body>
</html>