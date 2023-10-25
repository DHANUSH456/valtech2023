<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<%
firstWeb.Employee emp = (firstWeb.Employee) request.getAttribute("emp");
%>
<table>
	<tr>
		<td>Employee_ID</td>
		<td><%= emp.getEid() %></td>
	</tr>
		<tr>
		<td>Employee_Name</td>
		<td><%= emp.getName() %></td>
	</tr>
		<tr>
		<td>Age</td>
		<td><%= emp.getAge() %></td>
	</tr>
		<tr>
		<td>Experience</td>
		<td><%= emp.getExperience() %></td>
	</tr>
		<tr>
		<td>Seniority</td>
		<td><%= emp.getSeniority() %></td>
	</tr>
		<tr>
		<td>Salary</td>
		<td><%= emp.getSalary() %></td>
	</tr>
	<tr>
		<td>Department_ID</td>
		<td><%= emp.getDid() %></td>
	</tr>
	<tr>
		<td colspan = "2">
		<form action="EmployeeServlet" method="post">
			<input type="submit" name="submit" value="First" />
			<input type="submit" name="submit" value="Previous" />
			<input type="submit" name="submit" value="Next" />
			<input type="submit" name="submit" value="Last" />
		</form>
		</td>
	</tr>
</table>
</body>
</html>