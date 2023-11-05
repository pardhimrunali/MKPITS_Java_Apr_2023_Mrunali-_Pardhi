package com.example.studentinsertusingjsp;
import java.sql.*;
public class StudentService {
    Connection con;
    public StudentService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "109Trupti@109");
            System.out.println("Connection estblishedd");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
        public int insertData(StudentData stud) {

            int rs = 0;
            try {

                PreparedStatement preparedStatement = con.prepareStatement("insert into student_detail values(?,?,?)");
                preparedStatement.setString(1, stud.getRollno());
                preparedStatement.setString(2, stud.getName());
                preparedStatement.setString(3, stud.getAddress());

                rs = preparedStatement.executeUpdate();


            } catch (Exception e) {
                System.out.println(e);
            }

            return rs;

        }

        public ResultSet getRecord() {

            ResultSet resultSet = null;
            try {

                Statement Con = con.createStatement();
                resultSet = Con.executeQuery("select * from student_detail");

            } catch (Exception e) {
                System.out.println(e);
            }
            return resultSet;
        }


}
