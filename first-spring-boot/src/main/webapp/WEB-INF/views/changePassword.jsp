<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 20px;
	background-color: #f4f4f4;
}

h1 {
	text-align: center;
	color: #333;
}

h5 {
	text-align: center;
	color: red;
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

input[type="text"], input[type="password"] {
	width: calc(100% - 10px);
	padding: 8px;
	margin-bottom: 10px;
	border-radius: 5px;
	border: 1px solid #ccc;
}

input[type="submit"], input[type="reset"] {
	padding: 8px 15px;
	border: none;
	border-radius: 5px;
	background-color: #4CAF50;
	color: #fff;
	cursor: pointer;
	font-size: 16px;
	margin-right: 10px;
}

input[type="submit"]:hover, input[type="reset"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<h5>
		<style="color:red">
${
message
}
</style>
	</h5>
	<h1>Change Password</h1>
	<form method="post" action="changePassword">
		<table>
			<tr>
				<td>Old Password</td>
				<td><input type="text" name="oldPassword" /></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><input type="password" name="newPassword" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirmPassword" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="Change Password"
					value="submit" /> <input type="reset" name="reset" value="Cancel" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>