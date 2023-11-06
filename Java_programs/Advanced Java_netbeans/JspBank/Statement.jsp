<%@ page import="com.example.managementofbankjspservices.ServiceStudent" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: as
  Date: 11/5/2023
  Time: 9:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="login" class="com.example.managementofbankjspservices.AccountUserRegister" scope="application"/>
<jsp:setProperty name="login" property="user_id" param="session.getAttribute(uid)"/>
<%
    ServiceStudent s=new ServiceStudent();
    ResultSet resultSet =s.statement(login);
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    while(resultSet.next())
    {
        %>
      <tr>
    <td><%=resultSet.getString(2)%></td>
<td><%=resultSet.getString(3)%></td>
<td><%=resultSet.getString(4)%></td>
</tr>
<%
    }

%>
</table>


</body>
</html>
