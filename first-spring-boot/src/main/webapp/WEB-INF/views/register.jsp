<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Register Form</title>
</head>
<body>
<h5><style="color:red">${message}</style></h5>
	<h1>Registration Form</h1>
	<form method="post" action="register">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirmPassword" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit"
					value="submit" /> <input type="reset" name="reset" value="clear" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>