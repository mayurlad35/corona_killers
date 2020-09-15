<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fomr" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>

    <style>
        .error {
            color: red;
        }
    table{
         height:450px;width:440px;border-collapse: collapse;border-radius: 15px;
         }
        input
        {   border-color:#0000;background-color: whitesmoke;
            align:center;margin-left:30px;margin-top: 8px;height:40px;width: 380px;}

        #s{
            padding-left:30px;font-size:30px;padding-top:10px;
        }
        #login
        {
            color: darkcyan;font-size: 20px;margin-left: 600px;
        }
        a{
            text-decoration: none;color: #808B96;font-size: 20px;
        }
        .button2
        {
        background-color: #008CBA;border-radius: 30px;margin-left: 150px;
         border-color:#0000;color:white;height:50px;width:100px;}
    </style>

</head>
<body>
<!----------------------add here your header page--------------------------------->
<center>
    <br><br><br><br><br><br>
    <c:url var="loginUrl" value="/saveAction"/>
    <form:form modelAttribute="custom" action="${loginUrl}" method="post">
    <table bgcolor="#D1D9DC">

        <tr>
            <td id="s">
                <b>
                Sign UP </b>
            </td>

        </tr>
        <tr>
            <td style="border-bottom: 2px solid #808B96; width:500px;" colspan="2">

            </td>
        </tr>
        <tr>
            <td>
                <form:input path="firstName" placeholder="First Name" id="f"/>
                <form:errors path="firstName" cssClass="error" />
            </td></tr>
         <tr>   <td>
              <form:input path="lastName" placeholder="Last Name" id="l"/>
                <form:errors path="lastName" cssClass="error" />
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <form:input path="email" placeholder="Email" id="email"/>
                <form:errors path="email" cssClass="error" />
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <form:input path="password" type="password" placeholder="Password" id="password"/>
                <form:errors path="password" cssClass="error" />
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <form:input path="re_password"  type="password" placeholder="Confirm Password" id="confirmpassword"/>
                <form:errors path="re_password" cssClass="error" />
            </td>
        </tr>
        <tr>

        </tr>
        <tr>
            <td colspan="2">
                <form:input path="age" placeholder="Age"  id="age" />
                <form:errors path="age" cssClass="error"/>

            </td>
        </tr>

        <tr>
            <td colspan="2">
                <form:input path="contact" placeholder="contact" minlength="10" maxlength="10" id="contact"/>
                <form:errors path="contact" cssClass="error" />
            </td>
        </tr>
        <tr>
        <tr>
            <td style="border-bottom: 2px solid #808B96; width:500px;" colspan="2">

            </td>
        </tr>
      <tr></tr>
        <br>
        <tr><td></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>
        <tr>
            <td colspan="2"><button type="submit" class="button2">Submit</button></td> </tr>
        <tr><td></td></tr><tr><td></td></tr>
    </table>
</form:form>
</center>

<span id="login">Already Have an account ?&nbsp;<a href="${pageContext.request.contextPath}/login">Login Here..</a> </span>

</body>
</html>
