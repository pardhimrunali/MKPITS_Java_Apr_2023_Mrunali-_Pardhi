import calculatedata.Addition;
import calculatedata.Division;
import calculatedata.Multiplication;
import calculatedata.Subtraction;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The choice 1:Addition 2:Subtraction 3.Multiplication 4.Division");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Addition a = new Addition();

                System.out.println("Enter the two Numbers");
                int result = a.Cal(sc.nextInt(), sc.nextInt());
                System.out.println("Addition of two number is " + result);
                break;

            case 2:
                Subtraction s = new Subtraction();

                System.out.println("Enter the two Numbers");
                int subResult = s.Cal(sc.nextInt(), sc.nextInt());
                System.out.println("Subtraction  of two number is " + subResult);
                break;

            case 3:
                Multiplication m=new Multiplication();
                System.out.println("Enter two numbers ");
                int resultOfMultiplication=m.Cal(sc.nextInt(),sc.nextInt());
                System.out.println("\"Subtraction  of two number is "+resultOfMultiplication);
            case 4:
                Division d=new Division();
                System.out.println("Enter two numbers ");
                int resultOfMD=d.Cal(sc.nextInt(),sc.nextInt());
                System.out.println("\"Subtraction  of two number is "+resultOfMD);

        }
    }}