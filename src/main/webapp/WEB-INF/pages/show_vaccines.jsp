<%--
  Created by IntelliJ IDEA.
  User: Sravya
  Date: 9/1/2020
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

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
                <th><b>Vaccine Id</b></th>
                <th><b>Vaccine Name</b></th>
                <th><b>Price/unit</b></th>
                <th><b>Quantity</b></th>
            </tr>
            <c:forEach var="vaccine" items="${vaccines}">
                <form:form method="post" action="${pageContext.request.contextPath}/vaccines" modelAttribute="command">
                    <tr>
                        <td align="center"><form:input path="vaccineId" value="${vaccine.vaccineId}"/></td>
                        <td><form:input path="name" value="${vaccine.name}"/></td>
                        <td align="center"><form:input path="price" value="${vaccine.price}"/></td>
                        <td align="center"><form:input path="quantity" value="${vaccine.quantity}"/></td>
                            <%--<td><a class="button" href="#">BUY NOW</a></td>--%>
                        <td><input type="submit" value="BUY NOW"/></td>
                    </tr>
                </form:form>
            </c:forEach>
        </table>

    </c:when>
    <c:otherwise>
        <h3 style="color:red;text-align: center">No Vaccine is Available till ${date}</h3>
    </c:otherwise>
</c:choose>
<br>
<c:choose>
    <c:when test="${!empty next}">
        <h2 style="color:blue;text-align: center">${next}</h2>
        <div style="text-align: center">
            <a class="button" href="#">NEXT</a>
        </div>
    </c:when>
</c:choose>

</body>
</html>
