import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String first=new String();// default string


        Scanner sc=new Scanner(System.in);
        String password="mru";

        System.out.println("Enter the password");
        String p=sc.nextLine();

       if(password.equals(p))
        {
            System.out.println("Password is Correct ");
        }
else
        {
            System.out.println("Password is Incorrect");
        }








        char  array[]={'m','b'};
        String arrayprint=new String (array);
        System.out.println(arrayprint);

        System.out.println("Shreyu");
        String third="Pradnya";
        System.out.println("Shreyu"+third);



    }
}