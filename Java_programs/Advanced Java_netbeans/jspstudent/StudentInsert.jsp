<%--
  Created by IntelliJ IDEA.
  User: as
  Date: 03-11-2023
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="com.example.studentinsertusingjsp.StudentService" %>
<jsp:useBean id="s"   class="com.example.studentinsertusingjsp.StudentData" scope="application"/>
<jsp:setProperty name="s" property="rollno" param="roll"></jsp:setProperty>
    <jsp:setProperty name="s" property="name" param="n"></jsp:setProperty>
    <jsp:setProperty name="s" property="address" param="add"></jsp:setProperty>

<%--    <jsp:getProperty name="s" property="rollno"/>--%>
<%--    <jsp:getProperty name="s" property="name"/>--%>
<%--    <jsp:getProperty name="s" property="address"/>--%>

<%
    StudentService servicestud=new StudentService();

    if(servicestud.insertData(s)!=0)
    {
        out.println("data inserted");
    }
    else {
        out.println("not inserted");
    }
%>
<a href="Ystudent.jsp">Display</a>




