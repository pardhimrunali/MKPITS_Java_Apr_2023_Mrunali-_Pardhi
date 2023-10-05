import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Student s=new Student("160","Tejas","Mumbai");
ConnectivityOfDatabase.insertData(s);
ConnectivityOfDatabase.displaydata();
    }
}