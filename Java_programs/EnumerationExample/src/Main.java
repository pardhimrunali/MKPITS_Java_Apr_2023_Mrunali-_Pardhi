import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    enum Cities{Nagpur,Vardha,Pune,Arjuni};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice ");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                Cities city=Cities.Arjuni;
                System.out.println(city);
                break;
            case 2:
                 city=Cities.Nagpur;
                System.out.println(city);
                break;

            case 3:
                city=Cities.Pune;
                System.out.println(city);
                break;

            case 4:
                city=Cities.Vardha;
                System.out.println(city);
                break;
            default:
                System.out.println("Invalid choice");
        }



    }
}