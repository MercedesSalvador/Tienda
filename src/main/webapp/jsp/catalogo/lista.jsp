<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@page import="curso.java.tienda.model.Producto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
		<table border class = "default" >
		<tr>
			<th>Nombre</th>
			<th>Descripción</th>
			<th>Precio</th>
			<th>Stock</th>
		</tr>
		<tr>
			<%
			ArrayList<Producto> listado_Productos = (ArrayList<Producto>) request.getAttribute("listadoProductos");
	
			if(listado_Productos!=null) {
		
			for(int i=0; i<listado_Productos.size(); i++)  {
				out.println("<tr>");
				out.println("<td>"+ listado_Productos.get(i).getNombre() + "</td>");
				out.println("<td>" + listado_Productos.get(i).getDescripcion()+"</td>");
				out.println("<td>" + listado_Productos.get(i).getPrecio()+ "</td>");
				out.println("<td>"+ listado_Productos.get(i).getStock()+ "</td>");
				out.println("<tr>");
				}
			}
	%>
		</tr>
	</table>		
</form>

</body>
</html>