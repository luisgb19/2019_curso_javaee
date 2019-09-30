<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="daos.DaoContactos,java.util.List,model.Contacto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar contactos</title>
</head>
<body>
<table>
<tr>
<th>Nombre</th>
<th>Email</th>
<th>Edad</th>
</tr>
<%
	DaoContactosImp dao=new DaoContactosImp();

List<Contacto> lista = dao.mostrarContactos();

	for(Contacto contacto: lista){
%>
	<tr><td>	
	<%=contacto.getNombre()%>
	</td><td>
	<%=contacto.getEmail()%>
	</td><td>
	<%=contacto.getEdad()%>
	</td></tr>
<% 	
	}
%>

</table>


</body>
</html>