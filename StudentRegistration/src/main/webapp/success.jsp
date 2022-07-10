<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.mthree.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h3>Registered successfully!!!</h3>
	
	<%
		Student s = (Student)request.getAttribute("student");
	%>
	
	<p>Your details are Name: <%=s.getUsername()%></p>
	<p>Age is: <%=s.getUserage()%></p>
	<p>Mobile is: <%=s.getUsermobile()%></p>
	<p>Address is: <%=s.getUseraddress()%></p>
	
</body>
</html>