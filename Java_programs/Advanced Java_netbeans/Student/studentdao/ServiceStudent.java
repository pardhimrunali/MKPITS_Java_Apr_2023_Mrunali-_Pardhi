/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author as
 */
public class ServiceStudent {
    Connection con;
    int result=0;
  public ServiceStudent(){
  
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","109Trupti@109");
          
      } catch (Exception ex) {
          System.out.println(ex);
      }
  
  }
  
  public int insertRecord(Student stud){
        try {
            PreparedStatement  ps=con.prepareStatement("insert into student_detail values(?,?,?)");
            ps.setString(1,stud.getRoll_no());
            ps.setString(2,stud.getName());
            ps.setString(3,stud.getAddress());
           result= ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;

  }
}
