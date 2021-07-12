<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
        table{
            border:2px solid blue;
            border-collapse:collapse;
            margin-left:auto;
            margin-right:auto;
        }
        tr,th,td{
        border:2px solid blue;
        }
    </style>
<meta charset="ISO-8859-1">
<title>Show Cars</title>
</head>
<body>
 
<table>
    <tr>
        <th>Carmodel Name</th>
        <th>Year</th>
        <th>Kilometer Travelled</th>
        <th> Status</th>
    </tr>
    <c:forEach items="${list}" var="eachItem">
    <tr>
        <td><c:out value="${eachItem.carmodelname}"></c:out></td>
        <td><c:out value="${eachItem.year}"></c:out></td>
        <td><c:out value="${eachItem.kilometer}"></c:out></td>
        <td><c:out value="${eachItem.status}"></c:out></td>
      
    </tr>
    </c:forEach>
</table>
</body>
</html>