<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Vector,model.Carrito"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contenido del carrito</title>
</head>
<body>
<table border=1>
<tr>
<td width="200">Producto</td>
<td width="200">Unidades</td>
<td width="200">Precio</td>
</tr>

<%
// bucle recorre la lista
int tamanyo = (Integer)session.getAttribute("vCarrito").size();
if(tamanyo > 0){
	// Hay carritos
	(Vector)vC = (Vector)session.getAttribute("vCarrito");
	
	for(int i=0;i<tamanyo;i++){
	%>
<td><%=(Carrito)vC[i].getProducto()%></td>
<td><%=(Carrito)vC[i].getUnidades()%></td>
<td><%=(Carrito)vC[i].getPrecio()%></td>
<%	}
}else{
	// No hay elementos
%>
	<td colspan="3">Carrito Vacío</td>
<%};%>

</table>


<table border=1>
<tr>
<td width="200"><a href="comprar">Comprar</a></td>
<td width="200"><a href="opciones.html">Volver</a></td>
</tr>
</table>
</body>
</html>