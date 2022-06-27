<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<th>UserName</th>
		<th>PassWord</th>
		<th>Mobile</th>
		<th>Email</th>
		<th>City</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	<c:forEach var="jnv" items="${jnv}">
	<tr>
		<td>${jnv.username}</td>
		<td>${jnv.password}</td>
		<td>${jnv.mobile}</td>
		<td>${jnv.email}</td>
		<td>${jnv.city}</td>
		<td><a href="delete?id=${jnv.id}">Delete</a></td>
		<td><a href="update?email=${jnv.email }">Update</a></td>
		
				
		
		
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>