<%@page import="ua.com.foxminded.db.DatabaseFacade"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here 1</title>
</head>
<body>

	<h1>List of books</h1>

	<%
	for (String name : DatabaseFacade.getBooks()) {
		out.print(name + "<br/>");
	}
	%>
	
	
</body>
</html>