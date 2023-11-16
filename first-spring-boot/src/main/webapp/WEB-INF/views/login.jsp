<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="login" method="post">
	<table>
	<tr>
		<td>UserName</td>
		<td><input type="text" name="username"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" name="sumbit" value="submit"/>
			<input type="reset" name="reset" value="clear"/>
		</td>
	</tr>
	</table>
	</form>
</body>
</html>