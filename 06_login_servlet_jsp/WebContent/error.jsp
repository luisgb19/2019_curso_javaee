<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Error el usuario <%=request.getParameter("user")%> con contrase�a
<%=request.getParameter("pwd")%> no est� registrado</h1>
<br>
<a href='formulario.html'>volver</a>
</body>
</html>