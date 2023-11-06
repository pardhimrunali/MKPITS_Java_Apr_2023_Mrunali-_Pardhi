<%--
  Created by IntelliJ IDEA.
  User: as
  Date: 04-11-2023
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" scope="application" class="com.example.managementofbankjspservices.AccountUserRegister" />
<jsp:setProperty name="login" property="user_id" param="session.getAttribute(uid)"/>
<%
    session.setAttribute("user_id",null);
    String userId =(String) session.getAttribute("user_id");
    if(userId == null) {
//        response.sendRedirect("index.jsp");
        RequestDispatcher sendrequest=request.getRequestDispatcher("index.jsp");
        sendrequest.forward(request, response);
    }


    out.println("You are Succesfully logged out!!!");


    }
    catch (Exception e){

    out.println(e);


    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
