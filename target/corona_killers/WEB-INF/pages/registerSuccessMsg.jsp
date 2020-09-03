<%--
  Created by IntelliJ IDEA.
  User: Saurav
  Date: 01-09-2020
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Register Success Msg</title>
</head>
<body>
<!--------------------add here your header page-------------------------------->
<br>
<br>
<br>
<br>
<h4> <c:if test="${reg==true}"><spring:message code="insertSuccessMsg"></spring:message></c:if></h4>
<br>
<br>
<br>

<h3><a href="${pageContext.request.contextPath}/login">Login here!!!!</a></h3>
</body>
</html>
