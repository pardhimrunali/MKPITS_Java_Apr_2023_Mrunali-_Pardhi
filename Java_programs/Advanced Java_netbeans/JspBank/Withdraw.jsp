<%@ page import="com.example.managementofbankjspservices.ServiceStudent" %>
<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: as
  Date: 03-11-2023
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transferamt" class="com.example.managementofbankjspservices.Transaction" scope="application"/>


<%
    String userid= (String) session.getAttribute("uid");
    long datewithdraw= session.getCreationTime();
    Date withdrawdate=new Date(datewithdraw);
%>
<jsp:setProperty name="transferamt" property="logInUserId" value="<%=userid%>"/>
<jsp:setProperty name="transferamt" property="transactionDate" value="<%=withdrawdate%>"/>
<jsp:setProperty name="transferamt" property="depositAmount" param="amount"/>
<jsp:setProperty name="transferamt" property="transactionType" value="Withdraw"/>



<%
  ServiceStudent std=new ServiceStudent();
std.withdrawAmount(transferamt);


%>
<html>
<head>
    <title>withdraw</title>
</head>
<body>
<h1>Withdraw Successful</h1>
</body>
</html>
