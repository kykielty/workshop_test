<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,com.workshop.rest.*, com.workshop.client.*, com.workshop.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REST WebService Test page</title>
</head>
<body>
	<%
		RestServiceClient client = new RestServiceClient();
	%>
	<p>
		Display message from RESTful WebService <br>
		<%= client.getMessage()%>


</body>
</html>