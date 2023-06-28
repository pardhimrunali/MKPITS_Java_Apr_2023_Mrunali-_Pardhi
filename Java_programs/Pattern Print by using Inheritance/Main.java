import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the pattern number (like-1/2/3/4/5/6) : ");
       int pattern = scanner.nextInt();
      System.out.println("Enter the number of rows to print Design : ");
      int number = scanner.nextInt();


        ServiceStarPattern service=new ServiceStarPattern();
        service.serviceStarPattern(pattern,number);


    }
}