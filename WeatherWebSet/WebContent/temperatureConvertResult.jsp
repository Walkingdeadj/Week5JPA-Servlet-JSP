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
	You have enter a temperature ${userConvertPouch.getDegree()} <br />
	${userConvertPouch.getDegree()} celsius convert to ${userConvertPouch.getKelvin()} kelvin <br />
	${userConvertPouch.getDegree()} kelvin convert to ${userConvertPouch.getCelsius()} celsius <br />
	<p>
	<a href = "temperatureConvert.jsp">Type in another information</a>
</body>
</html>