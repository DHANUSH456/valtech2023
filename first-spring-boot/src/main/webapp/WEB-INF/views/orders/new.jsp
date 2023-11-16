<%@page import="com.valtech.training.firstspringboot.models.OrderModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%OrderModel order = (OrderModel) request.getAttribute("orders"); %>
<form method="post" action="save?id=<%= order.getId()%>">
	<table>
		<tr>
			<td>Id</td>
			<td><input type="text" disabled="disabled" name="id" value="<%= order.getId()%>"/></td>
		</tr>
		<tr>
			<td>Item</td>
			<td><input type="text" name="item" value="<%= order.getItem()%>"/></td>
		</tr>
		<tr>
			<td>ItemCount</td>
			<td><input type="text" name="itemCount" value="<%= order.getItemCount()%>"/></td>
		</tr>
		<tr>
			<td>Description</td>
			<td><input type="text" name="description" value="<%= order.getDescription()%>"/></td>
		</tr>
		<tr>
			<td>Date</td>
			<td><input type="text" name="orderDate" value="<%= order.getOrderDate()%>"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="submit" value="Create"/>
				<input type="submit" name ="cancel" value="Cancel"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>