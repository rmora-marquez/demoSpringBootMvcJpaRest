<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Productos</h1>
<table>
	<thead>
		<th>ID</th>	
		<th>Nombre</th>
		<th>Cantidad</th>
		<th>Precio</th>		
	</thead>
	</tbody>
		<c:forEach items="${productos}" var="p">
			<tr>
				<td><c:out value="${p.id}"></c:out></td>
				<td><c:out value="${p.nombre}"></c:out></td>
				<td><c:out value="${p.cantidad}"></c:out></td>
				<td><c:out value="${p.precio}"></c:out></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>