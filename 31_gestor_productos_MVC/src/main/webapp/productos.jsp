<%@page import="model.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="model.Producto, java.util.List"%>
 <%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" >
</head>
<body>
	<h2>Productos de <%=request.getParameter("categoria") %> </h2>
	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Precio</th>
		</tr>
		<%List<Producto> listProductos=(List<Producto>)request.getAttribute("productos");
		for (Producto producto : listProductos) { %>
			<tr>
				<td><%=producto.getNombre()%></td>
				<td><%=producto.getPrecio()%></td>
			</tr>
	<%} %>
	</table>
	<a href="FrontController?operation=toInicio">Volver a home</a>
</body>
</html> 

