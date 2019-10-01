<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
	import="java.util.*,javabeans.*"%>

<html>
<head>
<title>libros</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
		<table border="1">
		    <tr><th>Titulo</th><th>Autor</th><th>Precio</th></tr>		    	
				<c:forEach var="libro" items="${requestScope.libros}">
		    		<tr>
		    			<td>${libro.titulo}</td>
						<td>${libro.autor}</td>
						<td>${libro.precio}</td>
					</tr>		    	
				</c:forEach>	
		</table>
<br/><br/>
<a href="Controller?op=doTemas">Otro tema</a>
</body>
</html>