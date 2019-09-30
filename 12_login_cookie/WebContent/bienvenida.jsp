<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.Persona"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Bienvenido <%=request.getParameter("user")%> a mi página</h1><br>

<%
model.Persona per = (model.Persona)session.getAttribute("persona");
//Persona per = (Persona)request.getAttribute("persona");
%>

		<h2>Email= <%=per.getEmail() %></h2><br>
		
		<h2>Cargo= <%=per.getCargo() %></h2><br>
		
		<h2>Edad= <%=per.getEdad() %></h2><br>
<br>
<a href='Inicio'>volver</a>
</body>
</html>