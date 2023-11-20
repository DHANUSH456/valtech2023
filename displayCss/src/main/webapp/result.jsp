<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>CSS Viewer</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <%-- Display CSS class and converted attribute mappings --%>
        <%
        Map<String, String> cssMap = (Map<String, String>) request.getAttribute("cssMap");
        if (cssMap != null) {
            for (String cssClass : cssMap.keySet()) {
        %>
            <div class="card mb-3">
                <div class="card-header">
                    <h5 class="card-title">Class: <%= cssClass.replace("{", "") %></h5>
                </div>
                <div class="card-body">
                    <h6 class="card-subtitle mb-2 text-muted">Attribute:</h6>
                    <ul class="list-group">
                        <%
                        String attributes = cssMap.get(cssClass);
                        attributes = attributes.replace("}", "").trim();
                        String[] attributeArray = attributes.split(";");
                        for (String attribute : attributeArray) {
                            if (!attribute.trim().isEmpty()) {
                        %>
                            <li class="list-group-item"><%= attribute.trim() %></li>
                        <%
                            }
                        }
                        %>
                    </ul>
                </div>
            </div>
        <%
            }
        } else {
        %>
            <p class="alert alert-warning">cssMap is null</p>
        <%
        }
        %>
    </div>
 
</body>
</html>
 