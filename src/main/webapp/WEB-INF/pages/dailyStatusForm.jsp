<%--
  Created by IntelliJ IDEA.
  User: shirisha
  Date: 09/02/2020
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style type="text/css">
    .error {
        color: red;
    }
    body{
        background-image: url("https://thumbs.dreamstime.com/z/virus-covid-ncp-corona-background-cell-illustration-176356575.jpg");
        background-repeat: no-repeat;
        background-size: 1350px 650px;
    }
    .required{
        color: red;
    }
    .reg{

        color: black;
        text-align: center;
    }
    a:link, a:visited {
        background-color: white;
        color: black;
        padding: 10px 22px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
    }

    a:hover, a:active {
        background-color: white;
    }
</style>

<c:url value="/saveStatus" var="formUrl"/>
<form:form modelAttribute="status" action="${formUrl}" method="post">
    <h2 class="reg">Corona Daily Status Update Here !!!</h2>
    <table align="center">

        <tr>
            <td>Date:</td>
            <td><form:input type="date" path="date"/></td>
        </tr>
        <tr>
            <td>Active Cases:</td>
            <td><form:input path="activeCases" placeholder="Enter active cases"/></td>
            <td><form:errors path="activeCases" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Total Recovered:</td>
            <td><form:input path="totalRecovered" placeholder="Enter total recovered"/></td>
            <td><form:errors path="totalRecovered" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Total Deaths:</td>
            <td><form:input path="totalDeaths" placeholder="Enter total deaths"/></td>
            <td><form:errors path="totalDeaths" cssClass="error" /></td>
        </tr>

        <tr>
            <td>New Cases:</td>
            <td><form:input path="newCases" placeholder="enter new cases"/></td>
            <td><form:errors path="newCases" cssClass="error" /></td>
        </tr>

        <tr>
            <td><input type="submit" value="Add Status"></td>
        </tr>
    </table>
</form:form>

