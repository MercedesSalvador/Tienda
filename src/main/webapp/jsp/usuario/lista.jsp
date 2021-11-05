<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@page import="curso.java.tienda.model.Producto" %>
<%@page import="curso.java.tienda.model.Usuario" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/usuario">
		<table border class = "default" >
		<tr>
			<th>Nombre</th>
			<th>Primer Apellido</th>
			<th>Segundo Apellido</th>
			<th>Email</th>
			<th>Clave</th>
		</tr>
		<tr>
			<%
			ArrayList<Usuario> listado_Usuarios = (ArrayList<Usuario>) request.getAttribute("listadoUsuarios");
	
			if(listado_Usuarios!=null) {
		
			for(int i=0; i<listado_Usuarios.size(); i++)  {
				out.println("<tr>");
				out.println("<td>"+ listado_Usuarios.get(i).getNombre() + "</td>");
				out.println("<td>" + listado_Usuarios.get(i).getApellido1()+"</td>");
				out.println("<td>" + listado_Usuarios.get(i).getApellido2()+ "</td>");
				out.println("<td>"+ listado_Usuarios.get(i).getEmail()+ "</td>");
				out.println("<td>"+ listado_Usuarios.get(i).getClave()+ "</td>");
				out.println("<tr>");
				}
			}
	%>
		</tr>
	</table>		
</form>

</body>
</html>