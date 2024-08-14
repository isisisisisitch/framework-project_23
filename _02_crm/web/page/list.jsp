<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>$Title$</title>
    <style>
        th,td{
            border: 1px solid black;
        }

    </style>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>name</th>
        <th>age</th>
        <th>height</th>
    </tr>

    </thead>
    <tbody>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.age}</td>
            <td>${customer.height}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>


</body>
</html>
