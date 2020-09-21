<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        a {
    position: absolute;
            top: 110px;
            right:260px;
        }
    </style>
</head>
<body>
<h1>Existing address</h1>
<a href="delivery" >Add New AdddressForm</a>

<center>
<table border="1px">

    <tr>
        <th>firstname</th>
        <th>addressLine1</th>
        <th>postcode</th>
        <th>Use Existing address</th>
    </tr>
    <c:forEach var="data" items="${list}">
         <form action="" method="post">
             <tr>
                 <td>${data.firstName} </td>
                 <td>${data.addressLine1}</td>
                 <td>${data.postcode}</td>
                 <td><input type="radio" value=""></td>
             </tr>
        </form>

    </c:forEach>
</table>
</center>

</body>
</html>
