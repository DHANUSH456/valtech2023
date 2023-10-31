<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>CSS Converter</title>
</head>
<body>
    <h1>CSS Converter</h1>
    <ul>
        <c:forEach var="entry" items="${cssMap}">
            <li>
                Class: ${entry.key}<br>
                Attributes:
                <ul>
                    <c:forEach var="attribute" items="${entry.value.split(';')}">
                        <li>${attribute}</li>
                    </c:forEach>
                </ul>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
