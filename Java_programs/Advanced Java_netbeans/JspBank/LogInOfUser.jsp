<%@ page import="com.example.managementofbankjspservices.ServiceStudent" %>

<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: as
  Date: 03-11-2023
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" scope="application" class="com.example.managementofbankjspservices.AccountUserRegister" />
<jsp:useBean id="transferamt" scope="application" class="com.example.managementofbankjspservices.Transaction"/>
<jsp:setProperty name="login" property="user_id" param="user"/>
    <jsp:setProperty name="login" property="user_password" param="pass"/>


<%

    try{
        ResultSet result;
        ServiceStudent login_of_user=new ServiceStudent();

        result=login_of_user.login(login);



        if(result.next()){



            request.getSession(true);
            session.setAttribute("uid",login.getUser_id());




            RequestDispatcher sendrequest=request.getRequestDispatcher("HomePage.html");
            sendrequest.forward(request, response);



        }else{
            System.out.println("Unsuccessfully login.");

            System.out.println("<H2><a href='index.jsp'>Log In</a></h2>");
        }
    }
    catch (Exception ex) {
        System.out.println(ex);
    }


%>

