<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2> Create New Lead</h2>
<pre>
<form action ="save" method="post">
Firstname:<input type="text" name="firstName"/>
lastname:<input type="text" name="lastName"/>
Email Id:<input type="text" name="email"/>
Mobile:<input type="text" name="mobile"/>
Source:
<select name="source">
<option value ="radio">Radio</option>
<option value="newspaper">Newspaper</option>
<option value="tradeshow">Trade Show</option>
<option value="website">Website</option>
</select>
<input type="submit" value="savelead"/>
</pre>
</form>
</body>
</html>