<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: as
  Date: 02-11-2023
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "109Trupti@109");
  Statement statement=con.createStatement();
  ResultSet resultSet=statement.executeQuery("select * from student_detail");
  ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
  %>








<html>
<head>
    <title>Display Data</title>
</head>
<body>

<table border="2" align="center">

  <tr>
    <%
      for(int columnIndex=1;columnIndex<=resultSetMetaData.getColumnCount();columnIndex++)
      {
    %>

    <th> <%= resultSetMetaData.getColumnName(columnIndex)%> </th>

    <%
      }
    %>

  </tr>



  <%
    while (resultSet.next())
    {
  %>
  <tr>
    <td> <%= resultSet.getString(1)%></td>
    <td> <%= resultSet.getString(2)%></td>
    <td> <%= resultSet.getString(3)%></td>
  </tr>
  <%

    }
  %>

</table>

</body>
</html>
