<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,beans.Producto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--
		recuperamos el carrito y si existe lo mostramos
	 --%>
	<%List<Producto> productos=(List<Producto>)session.getAttribute("carrito");
	if(productos==null){%>
		
		<h1>No hay carrito</h1>
	<%}else{%>
		<table border="1">
			<tr>
				<th></th><th>Nombre</th><th>Precio</th><th>Unidades</th>
			</tr>
			<%for(int i=0;i<productos.size();i++){ %>
				<tr>
					<td><a href="Eliminar?posicion=<%=i%>">Eliminar</a></td>
					<td><%=productos.get(i).getNombre() %></td>
					<td><%=productos.get(i).getPrecio() %></td>
					<td><%=productos.get(i).getUnidades() %></td>
				</tr>
			
			<%} %>
		
		</table>
			
	<%}%>
	<br/>
	
	<a href="inicio.html">Inicio</a>
</body>
</html>