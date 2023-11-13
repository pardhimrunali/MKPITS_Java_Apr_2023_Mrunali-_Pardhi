package com.example.sbibank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankService {
    Connection con;
    ResultSet resultSet;
    public BankService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManegement", "root", "admin");
//System.out.println("connection establish");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public int registrationOfUser(AccountRegister accountRegister){
        int result=0;
        try{
            PreparedStatement preparedStatement=con.prepareStatement("insert into account values(?,?,?,?,?,?,?)");
            preparedStatement.setString(1,accountRegister.getLogin_id());
            preparedStatement.setString(2,accountRegister.getUser_password());
            preparedStatement.setString(3,accountRegister.getUser_name());
            preparedStatement.setString(4,accountRegister.getUser_address());
            preparedStatement.setString(5,accountRegister.getUser_city());
            preparedStatement.setString(6,accountRegister.getUser_email());
            preparedStatement.setDouble(7,accountRegister.getUser_balance());
             result=preparedStatement.executeUpdate();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
           return result;
    }
    public ResultSet logInUser(AccountRegister accountRegister) {


        try {
            PreparedStatement preparedStatement = con.prepareStatement("select * from account where user_id=? and user_password=?");
            preparedStatement.setString(1, accountRegister.getLogin_id());
            preparedStatement.setString(2, accountRegister.getUser_password());
            resultSet= preparedStatement.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultSet;
    }

    public void depositAmount(Transaction transaction)
    {
        try{
            PreparedStatement preparedStatement=con.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1,transaction.getUser_login_id());
            preparedStatement.setDate(2,transaction.getTranscation_date());
            preparedStatement.setDouble(3,transaction.getAmount());
            preparedStatement.setString(4,transaction.getTransaction_type());
        preparedStatement.executeUpdate();

        PreparedStatement preparedStatement1=con.prepareStatement("update  account set balance=balance+? where user_id=?");
        preparedStatement1.setDouble(1,transaction.getAmount());
        preparedStatement1.setString(2,transaction.getUser_login_id());
        preparedStatement1.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public ResultSet statement(AccountRegister display) {
        ResultSet resultSet1 = null;
        try {

            PreparedStatement preparedStatement = con.prepareStatement("Select * from transactions where user_id=?");
            preparedStatement.setString(1, display.getLogin_id());
            resultSet1 = preparedStatement.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultSet1;
    }
}
