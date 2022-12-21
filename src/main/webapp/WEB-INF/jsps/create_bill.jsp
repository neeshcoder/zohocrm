<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bill</title>
</head>
<body>
<h2> Create New Bill</h2>

<form action ="generateBill" >
<pre>
Firstname:<input type="text" name="firstName" value="${contact.firstName}"/>

Lastname:<input type="text" name="lastName" value="${contact.lastName}" />
Email Id:<input type="text" name="email" value="${contact.email}" />
Mobile:<input type="text" name="mobile"  value="${contact.mobile}" />
Product: <input type="text" name="product"/>
Amount:<input type="text" name="amount"/>

<input type="submit" value="Generate Bill"/>

</pre>
</form>

</body>
</html>