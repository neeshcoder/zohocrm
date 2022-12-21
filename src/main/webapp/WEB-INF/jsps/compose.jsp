<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Email</title>
</head>
<body>
	<form action="sendEmail" method="post"/>
	<pre>
	To<input type="text" name="to" value="${email}"/>
	Subject <input type="text" name="subject"/>
	Message <textarea name="message" rows="5" cols="10">
	</textarea>
	<input type="submit" value="send"/>
		
	</pre>
	${msg}
</body>
</html>