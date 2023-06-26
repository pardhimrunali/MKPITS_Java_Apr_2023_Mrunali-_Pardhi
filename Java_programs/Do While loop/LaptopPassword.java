import java.sql.SQLOutput;
import java.util.Scanner;
public class LaptopPassword {
    int pincount=3;
    int password;
    Scanner Password=new Scanner(System.in);

    public void Password() {
        do {
            System.out.println("Enter the password of Laptop");
            int pass=Password.nextInt();
            pincount++;


        } while (pincount<=3);
        System.out.println("Enter password after 30 seconds");

    }

}

