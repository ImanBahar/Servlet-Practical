<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome
<%= request.getParameter("password")%>
</title>
</head>

<body>
	<h1>Welcome
<%= request.getParameter("userID")%>
</h1>

	<table border="1">
		
		<h2>Add Student?</h2>
		<form method="get" action="addStudent">
			<label for="name">Name</label> <br>
			<input type = "text" id = "name" name = "name"><br>
			
			<label for="password">Password:</label><br>
			<input type="text" id="password" name="password"> <br> <br>
			
			<input type="submit" value="Submit">
		</form>
		
		<br><br>
		
		<h2>Get your marks or insert <%= request.getParameter("name")%>!</h2>
		<form method="get" action="getMarks">
			
			<input type="submit" value="Get Marks">
		</form>
</html>