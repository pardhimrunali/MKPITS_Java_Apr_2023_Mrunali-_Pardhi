import java.sql.PreparedStatement;
import java.sql.*;
import java.io.*;
class AddImage
{
public static void main(String args[])
{

try{

Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManegement", "root", "109Trupti@109");
                
                   PreparedStatement preparedStatement =connection.prepareStatement("insert into image values(?,?)");
            preparedStatement.setString(1,"101");
			
			FileInputStream fs=new FileInputStream("mrunali.png");
			preparedStatement.setBinaryStream(2,fs,fs.available());
            preparedStatement.executeUpdate();

}
catch(Exception e)
{
	
	
}

}

}