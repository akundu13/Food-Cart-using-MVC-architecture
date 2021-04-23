<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<style>
			body {
 	 			background-color:#d1b3ff;
				}
			h1 {
 	 			color:red;
 	  			text-shadow: 2px 2px White;
 	 			margin-left: 40px;
				}
			table, th, td {
 	 			border: 2px solid #cc7a00;
				}
			th {
				color:#000066;
 		 		height: 50px;
				}
		</style>
		<meta charset="ISO-8859-1">
		<title>MENU</title>
	</head>
	
	<body >
		<h1 align="center">MENU</h1>
		<table  cellpadding="20%" align="center" >
				<tr>
					<th>FOOD CODE</th>
					<th>FOOD ITEMS</th>
					<th>FOOD PRICE</th>
				</tr>
			<c:forEach items="${foodItems}" var="items" >
				<tr>
		   
					<td align="center"><c:out value="${items.id}"/></td>
					<td align="center"><c:out value="${items.item}"/></td>
					<td align="center"><c:out value="${items.price}"/></td>
		
				</tr>
			</c:forEach>
		</table>
	</body>
</html>