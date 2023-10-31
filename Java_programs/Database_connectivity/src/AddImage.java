import java.io.*;
import java.sql.*;

public class AddImage {
    public static void main(String args[])
    {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManegement", "root", "109Trupti@109");

            PreparedStatement preparedStatement =connection.prepareStatement("insert into image values(?,?)");
            preparedStatement.setString(1,"101");

            FileInputStream fs=new FileInputStream("E:/MKPITS/MKPITS_Java_Apr_2023_Mrunali-_Pardhi/Java_programs/Database_connectivity/src/mrupi-imresizer.jpg");
            preparedStatement.setBinaryStream(2,fs,fs.available());
            preparedStatement.executeUpdate();
            System.out.println("Image loaded");
        }
        catch(Exception e)
        {
            System.out.println(e);

        }

    }

}
