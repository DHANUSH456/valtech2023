<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 20px;
}

h1 {
	text-align: center;
	color: #333;
}

form {
	max-width: 400px;
	margin: 0 auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

table {
	width: 100%;
}

td {
	padding: 10px;
}

input[type="text"], input[type="password"], input[type="submit"], input[type="reset"]
	{
	width: 100%;
	padding: 8px;
	margin-bottom: 10px;
	border-radius: 4px;
	border: 1px solid #ccc;
}

input[type="submit"], input[type="reset"] {
	background-color: #4CAF50;
	color: white;
	border: none;
	cursor: pointer;
}

input[type="submit"]:hover, input[type="reset"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<h1>Login Page</h1>
	<form action="login" method="post">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="sumbit"
					value="submit" /> <input type="reset" name="reset" value="clear" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>