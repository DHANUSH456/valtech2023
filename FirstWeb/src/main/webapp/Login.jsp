<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="login-container">
    	<div class="login-header">
        <h2>Login</h2>
        </div>
		<form action="login" method="post">
            <div class="input-container">
                <label for="username">Username:</label>
                <input type="text" name="username" id="username" required>
            </div>
            
            <div class="input-container">
                <label for="password">Password:</label>
                <input type="password" name="password" id="password" required>
            </div>
            
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>