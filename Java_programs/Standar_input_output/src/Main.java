// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
public class Main {
    public static void main(String[] args) {
        BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter Name");
       System.out.println("Enter Number");
        try {
            String d=a.readLine();
            String b=a.readLine();
            System.out.println("My name is "+" "+d);
            System.out.println("cube Of Number is"+" "+(Integer.parseInt(b))*(Integer.parseInt(b))*(Integer.parseInt(b)));
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        System.out.println();



    }
}