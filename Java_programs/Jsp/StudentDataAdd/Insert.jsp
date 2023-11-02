<%--
  Created by IntelliJ IDEA.
  User: as
  Date: 02-11-2023
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"  %>

<%@ page import="java.sql.DriverManager" %>

<%

    String rollNo = request.getParameter("roll");
    String name = request.getParameter("n");
    String address = request.getParameter("add");

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "109Trupti@109");
    PreparedStatement preparedStatement = con.prepareStatement("insert into student_detail values(?,?,?)");
    preparedStatement.setString(1, rollNo);
    preparedStatement.setString(2, name);
    preparedStatement.setString(3, address);

    int rs= preparedStatement.executeUpdate();


    if (rs!= 0)
        out.println("Inserted");
    else
        out.println("Not Inserted");


%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="Display.jsp"> Student Details Table Display</a>
</body>
</html>
