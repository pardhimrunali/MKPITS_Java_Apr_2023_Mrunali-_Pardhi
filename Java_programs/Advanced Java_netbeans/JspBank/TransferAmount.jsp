<%--
  Created by IntelliJ IDEA.
  User: as
  Date: 11/5/2023
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.Date" %>
<%@ page import="com.example.managementofbankjspservices.ServiceStudent" %>


<jsp:useBean id="transferamt" class="com.example.managementofbankjspservices.Transaction" scope="application"></jsp:useBean>

<%
    String iduser= session.getAttribute("uid").toString();
    long date=session.getCreationTime();
    Date transferdate=new Date(date);
%>


<jsp:setProperty name="transferamt" property="transactionType2" value="transfer_out"/>
<jsp:setProperty name="transferamt" property="userId" param="transferid"/>
<jsp:setProperty name="transferamt" property="depositAmount" param="transferamount"/>
<jsp:setProperty name="transferamt" property="transactionDate" value="<%=transferdate%>"/>
<jsp:setProperty name="transferamt" property="logInUserId" value="<%=iduser%>"/>
<jsp:setProperty name="transferamt" property="transactionType" value="transfer_in"/>







<%

    ServiceStudent amttransfer=new ServiceStudent();
    amttransfer.transfer(transferamt);


%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h1>Amount Transfered Successful</h1></center>
</body>
</html>
