<%@ page import="com.example.studentinsertusingjsp.StudentService" %><%--
  Created by IntelliJ IDEA.
  User: as
  Date: 04-11-2023
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.studentinsertusingjsp.StudentService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.studentinsertusingjsp.StudentData" %>
<jsp:useBean id="s"   class="com.example.studentinsertusingjsp.StudentData" scope="application"/>
<%
    StudentService st=new StudentService();
    ResultSet result =st.getRecord();
    ArrayList<StudentData> stu=new ArrayList<StudentData>();
    while(result.next())
    {

        stu.add(new StudentData(result.getString(1),result.getString(2),result.getString(3)));

    }
    request.setAttribute("display",stu);
    RequestDispatcher rq=request.getRequestDispatcher("Display.jsp");
    rq.forward(request,response);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
