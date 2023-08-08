import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StringBuffer name=new StringBuffer("Mrunali ");
        System.out.println(name);//prints Mrunali
        name.insert(7," Pardhi");//now original string is changed
        System.out.println(name);//prints Mrunali

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        StringBuffer fathername=new StringBuffer(str);
        fathername.reverse();
        if(str.equals(fathername.toString()))
            System.out.println("String is palindrome");
        else System.out.println("String is not palindrome");


    }
}