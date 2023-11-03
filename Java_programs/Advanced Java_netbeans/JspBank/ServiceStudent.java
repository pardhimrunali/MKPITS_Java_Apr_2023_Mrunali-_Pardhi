package com.example.managementofbankjspservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ServiceStudent {
    Connection con;
    public ServiceStudent() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManegement", "root", "109Trupti@109");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public int insertdata(AccountUserRegister datauser) {
        int rs = 0;
        try {
            PreparedStatement ps = con.prepareStatement("insert into account values(?,?,?,?,?,?,?)");

            ps.setString(1, datauser.getUser_id());
            ps.setString(2, datauser.getUser_password());
            ps.setString(3, datauser.getName());
            ps.setString(4, datauser.getAddress());
            ps.setString(5, datauser.getCity());
            ps.setString(6, datauser.getEmail());
            ps.setDouble(7, datauser.getBalance());
            rs = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("e");
        }
        return rs;
    }
}
