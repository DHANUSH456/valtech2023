<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
</head>
<body>
<h5><style="color:red">${message}</style></h5>
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