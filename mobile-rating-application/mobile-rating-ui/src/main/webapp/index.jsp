<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fancy Phone Number Ranker</title>
</head>
<body>
    <h1>Fancy Phone Number Ranker</h1>
    <form action="MobileRankerServlet" method="post">
        <p>Enter ten 10-digit phone numbers, one per line:</p>
        <textarea name="phoneNumbers" rows="10" cols="30"></textarea>
        <br>
        <input type="submit" value="Rank Numbers">
    </form>
</body>
</html>
