<%@ page import="com.example.managementofbankjspservices.ServiceStudent" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: as
  Date: 03-11-2023
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transferamt" class="com.example.managementofbankjspservices.Transaction" scope="application"/>
<%
    String id= (String) session.getAttribute("uid");
    long datet=session.getCreationTime();
    Date depositdate=new Date(datet);
%>
<jsp:setProperty name="transferamt" property="logInUserId" value="<%=id%>"/>
<jsp:setProperty name="transferamt" property="transactionDate" value="<%=depositdate%>"/>
<jsp:setProperty name="transferamt" property="depositAmount" param="amt"/>
<jsp:setProperty name="transferamt" property="transactionType" value="deposit"/>




<%
// session.getAttribute("uid");
    ServiceStudent stud=new ServiceStudent();
stud.depositAmount(transferamt);


%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Amount Deposited</h1>
</body>
</html>
