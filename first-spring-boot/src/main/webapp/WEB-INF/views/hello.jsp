<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
<style type="text/css">
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 20px;
    background-color: #f4f4f4;
}

h1, h2 {
    text-align: center;
    color: #333;
}

a {
    display: block;
    text-align: center;
    margin-top: 20px;
    text-decoration: none;
    padding: 10px 20px;
    background-color: #4CAF50;
    color: #fff;
    border-radius: 5px;
    transition: background-color 0.3s ease;
}

a:hover {
    background-color: #45a049;
}
</style>
</head>
<body>
	<h1>Hello guys i am here . . .</h1>
	<h2>${name}</h2>
	<a href="changePassword">Change Password</a>
</body>
</html>