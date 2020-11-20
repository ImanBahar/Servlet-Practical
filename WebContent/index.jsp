<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Database</title>
</head>
<body>

	<h1>Welcome to STUDENTS MARKS DATABASE</h1>
	<p>Please enter your name and password
	<form action = "login" method = "post">
		<label for="id">Name:</label> <br>
		<input type = "text" id = "name" name = "name"><br>
		
		<label for="password">Password:</label><br>
		<input type="text" id="password" name="password"> <br> <br>
		
		<input type="submit" value="Submit">
	</form>
	
	


</body>
</html>