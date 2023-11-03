<%@ page import="com.example.managementofbankjspservices.ServiceStudent" %><%--
  Created by IntelliJ IDEA.
  User: as
  Date: 03-11-2023
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="userdata" class="com.example.managementofbankjspservices.AccountUserRegister" scope="application"></jsp:useBean>
<jsp:setProperty name="userdata" property="user_id" param="user_name" ></jsp:setProperty>
<jsp:setProperty name="userdata" property="user_password" param="p_name" ></jsp:setProperty>
<jsp:setProperty name="userdata" property="name" param="name" ></jsp:setProperty>
<jsp:setProperty name="userdata" property="address" param="addr" ></jsp:setProperty>
<jsp:setProperty name="userdata" property="city" param="city" ></jsp:setProperty>

<jsp:setProperty name="userdata" property="email" param="mail" ></jsp:setProperty>
<jsp:setProperty name="userdata" property="balance" param="balance" ></jsp:setProperty>

<%--<jsp:getProperty name="userdata" property="user_id"/>--%>
<%--<jsp:getProperty name="userdata" property="user_password"/>--%>
<%--<jsp:getProperty name="userdata" property="name"/>--%>
<%--<jsp:getProperty name="userdata" property="address"/>--%>
<%--<jsp:getProperty name="userdata" property="city"/>--%>
<%--<jsp:getProperty name="userdata" property="email"/>--%>
<%--<jsp:getProperty name="userdata" property="balance"/>--%>
<%
    ServiceStudent dataadd=new ServiceStudent();
    if(dataadd.insertdata(userdata)!=0)
    {
        out.println("data Inserted");

                
    }
    else {
        out.println("Not Inserted");
    }
%>
<html>
<head>


</head>
<body>

</body>
</html>
