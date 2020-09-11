<%--
  Created by IntelliJ IDEA.
  User: shirisha
  Date: 09/03/2020
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
    body{
        background-color: aliceblue;
    }
</style>
<head>
    <title>Title</title>
</head>
<body>
<h2 align="center">Corona Daily Status in World</h2>
<table align="center" cellspacing="0" style="border: brown" border="5" border="2" width="70%" cellpadding="2">
    <tr>
        <th>Date</th>
        <th>Active Cases</th>
        <th>Total Recovered</th>
        <th>Total Deaths</th>
        <th>New Cases</th>
        <th>Total Cases</th>
    </tr>
    <c:forEach items="${dailyStatus}" var="status">
        <tr>
            <td>${status.date}</td>
            <td>${status.activeCases}</td>
            <td>${status.totalRecovered}</td>
            <td>${status.totalDeaths}</td>
            <td>${status.newCases}</td>
            <td>${status.totalCases}</td>
        </tr>
    </c:forEach>
</table>
<br><br><br>
<h2 align="center">Closest current date Entry Details </h2>
<table align="center" cellspacing="0" style="border: brown" border="5" border="2" width="70%" cellpadding="2">
    <tr>
        <th>Date</th>
        <th>Active Cases</th>
        <th>Total Recovered</th>
        <th>Total Deaths</th>
        <th>New Cases</th>
        <th>Total Cases</th>
    </tr>
        <tr>
            <td>${closestData.date}</td>
            <td>${closestData.activeCases}</td>
            <td>${closestData.totalRecovered}</td>
            <td>${closestData.totalDeaths}</td>
            <td>${closestData.newCases}</td>
            <td>${closestData.totalCases}</td>
        </tr>
</table>
</body>
</html>
