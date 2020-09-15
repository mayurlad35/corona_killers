<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Custom login</title>
    <style type="text/css">
        .error {
            color: #ff0000;
            font-weight: bold;
        }
        .msg {
            color: #008000;
            font-weight: bold;
        }
    </style>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<c:if test="${not empty msg}">
    <font color="red">${msg} </font></c:if><span class="error">${error}</span>
<form name='loginForm'  action="${pageContext.request.contextPath}/j_spring_security_check" method='POST'>
    <center>
        <h2><u>Sign In here....</u></h2>
        <table>
            <tr>
                <th>UserName:</th>
                <td>
                    <input type='text' name='email' value='' placeholder="email">
                </td>
            </tr>
            <tr><td></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>
            <tr>
                <th>
                    Password:
                </th>
                <td>
                    <input type='password' name='password' placeholder="Password"/>
                </td>
            </tr>
            <tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>
            <tr>
                <td></td>
            </tr><tr><td></td>
                    <td>
                        <button name="submit" type="submit" value="Sign In" id="save">Sign In</button>
                    </td>
                </tr>
            <br>
            <tr></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>
            <tr colspan="2">
                <td></td>
                <td>
                    <b id="not"> Not registered?</b> &nbsp;<a href="${pageContext.request.contextPath}/signUp" id="signUp">Sign Up</a>
                </td>
            </tr>

        </table>
    </center>

</form>
</body>
</html>