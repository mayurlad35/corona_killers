<%--
  Created by IntelliJ IDEA.
  User: Sravya
  Date: 9/1/2020
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>vaccines</title>
    <style>
        .button {
            display: inline-block;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            color: #ffffff;
            background-color: #7aa8b7;
            border-radius: 6px;
            outline: none;
        }
    </style>
</head>
<body>
    <c:choose>
        <c:when test="${!empty vaccines}">
            <h3 style="color: green;text-align: center">Available Vaccines on ${date}</h3><br>
            <table border="1" align="center">
                <tr>
                    <th><b>Vaccine Id</b></th><th><b>Vaccine Name</b></th><th><b>Price/unit</b></th><th><b>Quantity</b></th>
                </tr>
                <c:forEach var="vaccine" items="${vaccines}">
                    <tr>
                        <td align="center">${vaccine.vaccineId}</td>
                        <td>${vaccine.name}</td>
                        <td align="center">${vaccine.price}</td>
                        <td align="center">${vaccine.quantity}</td>
                        <td><a class="button" href="#">BUY NOW</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h3 style="color:red;text-align: center">No Vaccine is Available till ${date}</h3>
        </c:otherwise>
    </c:choose>
</body>
</html>
