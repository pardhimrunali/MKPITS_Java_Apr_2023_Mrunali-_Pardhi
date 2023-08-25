import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList student=new LinkedList();
        Scanner sc=new Scanner(System.in);


         String name,choice;

        do {

            System.out.println("Enter name :- ");
            name=sc.next();
            student.add(name);
            System.out.println("Do you want to add another name :- ");
            choice=sc.next();


        }while (choice.equalsIgnoreCase("yes"));
        System.out.println(student);
    }
}