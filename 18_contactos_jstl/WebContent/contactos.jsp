<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="daos.DaoContactosImp,java.util.List,model.Contacto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar contactos</title>
</head>
<body>
<table border=1>
<tr>
<th width="100">Accion</th>
<th width="200">Nombre</th>
<th width="200">Email</th>
<th width="200">Edad</th>
</tr>
<c:set var="lista" value="${requestScope.contactos}"/>

<c:forEach var="contacto" items="${lista}}">
	<tr><td><a href="Controller?op=doEliminar&id=${contacto.idContacto}%>">Eliminar</a>	
	</td><td>
	%{contacto.nombre}
	</td><td>
	%{contacto.email}
	</td><td>
	%{contacto.edad}
	</td></tr>
</c:forEach>
</table>

<a type="button" href='Controller?op=toEntrada'>Volver</a>
</body>
</html>