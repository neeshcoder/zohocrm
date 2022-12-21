<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Bills</title>
</head>
<body>
<h2> List Of All Bills </h2>
<table>
	<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>Product</th>
		<th>Amount</th>
		</tr>
		
<c:forEach var="list" items="${list}">
	<tr>
		<td>${list.firstName}</td>
		<td>${list.lastName}</td>
		<td>${list.email}</td>
		<td>${list.mobile}</td>
		<td>${list.product}</td>
		<td>${list.amount}</td>
	</tr>
</c:forEach>
	
</table>
</body>
</html>