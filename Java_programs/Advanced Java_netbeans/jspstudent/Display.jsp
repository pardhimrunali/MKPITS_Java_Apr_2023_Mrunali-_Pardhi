<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.studentinsertusingjsp.StudentData" %><%--
  Created by IntelliJ IDEA.
  User: as
  Date: 04-11-2023
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table>


    <%
        ArrayList<StudentData> di=(ArrayList<StudentData>)request.getAttribute("display");
        for (StudentData p:di) {
%>
    <tr>
    <td><%=p.getRollno()%></td>
        <td><%=p.getName()%></td>
     <td><%=p.getAddress()%></td>
    </tr>
    <%
        }

    %>
    <tr>

    </tr>
</table>
</body>
</html>
