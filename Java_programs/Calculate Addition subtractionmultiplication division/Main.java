// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters i
import calculate.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
calculatedata c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The choice 1:Addition 2:Subtraction");
int choice=sc.nextInt();
switch (choice){
    case 1:
            c=new Addition();
        System.out.println("Enter the two Numbers");
       int result=c.calculateDataOF(sc.nextInt(), sc.nextInt());
        System.out.println("Addition of two number is "+result);
        break;

            case 2:
                c=new Subtrcation();

                System.out.println("Enter the two Numbers");
                int r=c.calculateDataOF(sc.nextInt(), sc.nextInt());
                System.out.println("Addition of two number is "+r);
                break;

    case 3:
        c=new Multiplication();
        System.out.println("Enter the two Numbers");
        int multiplication=c.calculateDataOF(sc.nextInt(), sc.nextInt());
        System.out.println("Addition of two number is "+multiplication);
        break;

    case 4:
        c=new Division();
        System.out.println("Enter the two Numbers");
        int div=c.calculateDataOF(sc.nextInt(), sc.nextInt());
        System.out.println("Addition of two number is "+div);
        break;

    default:
        System.out.println("invalid");

            }

        }





    }