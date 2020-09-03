<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign In</title>
    <style>
        table
        {
            height:380px;
            width:300px;
            border-radius: 20px;
        }

        input
        {
            height:40px;
            width: 300px;
            background-color:#F2F4F4 ;
            border-color:#0000;
            margin-top: 8px;
            margin-right: 20px;

        }

        #sign
        {
            margin-top: 12px;
            margin-left: 85px;
            font-size: 30px;
            align:center;
            color:#010911;
        }
        #save
        {
            width:300px;
            background-color: #3366ff;
            color:white;
            margin-left:35px;
            font-size: 20px;
            margin-right: 35px;
        }

        #not
        {
            margin-left: 60px;
        }

       a{
           text-decoration: none;
       }

        #email
        {
            margin-left: 35px;
        }
        #password
        {
            margin-left: 35px;
        }

    </style>

</head>

<body bgcolor="#3366ff">
<!--------------------add here your header page-------------------------------->
<br>
<br>
<br>
<br>
<br>


<c:if test="${not empty msg}">
    <font color="red">${msg} </font></c:if>
<form name='loginForm'  action="${pageContext.request.contextPath}/j_spring_security_check" method='POST'>

<center>

   <table bgcolor="#BBC4CD">

       <tr>
           <td> <b id="sign">---- Sign in ---- </b></td>

       </tr>

       <tr>

               <td>
                   <input type='text' name='email' value='' placeholder="Email" id="email">
               </td>
           </tr>
       <br>
       <br>

           <tr>
               <td>
                   <input type='password' name='password' placeholder="Password" id="password"/>
               </td>
           </tr>

           <tr>

               <td><input name="submit" type="submit" value="Sign In" id="save"/>


           <br>
                   <br>
             <b id="not"> Not registered?</b> &nbsp;<a href="${pageContext.request.contextPath}/register" id="reg">Sign Up here</a>
           </td>
       </tr>

       </table>
</center>

</form>
</body>
</html>
