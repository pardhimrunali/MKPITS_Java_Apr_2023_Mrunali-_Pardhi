import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {





        //Exception handling
        Scanner sc=new Scanner(System.in);
        System.out.println("enter First number");
        int numberfirst=sc.nextInt();
        System.out.println("ENter the secojnd number");
        int numbersecond=sc.nextInt();
        try{
            System.out.println(numberfirst/numbersecond);
        }
        catch(Exception e)
        {
            System.out.println("cannot divisible");
        }
        System.out.println("hii");
    }
}