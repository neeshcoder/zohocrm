<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All billings </title>
</head>
<body>
<h2> List Of billing </h2>
<table>
	<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>Product</th>
		<th>Amount</th>
		<th>
		</th>
		</tr>
		
		<form action="calculategst" >
		<input type="submit" value="Add GST"/>
		</form>
		

	<tr>
		<td>${billed.firstName}</td>
		<td>${billed.lastName}</td>
		<td>${billed.email}</td>
		<td>${billed.mobile}</td>
		<td>${billed.product}</td>
		<td>${gst.amount}</td>
	
	</tr>

</table>
<form action="calculategst" >
		<input type="submit" value="Add GST"/>
		</form>
</body>
</html>