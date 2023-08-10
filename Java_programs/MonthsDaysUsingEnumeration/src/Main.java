import java.time.Month;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    enum Months{January, February, March, April, May, June, July,  August, September, October, November,  December}
    public static void main(String[] args) {
     //   Scanner sc=new Scanner(System.in);
     //   System.out.println("Enter choice ");
     //   int ch=sc.nextInt();
        Month ch= Month.JANUARY;
        switch (ch)
        {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER: System.out.println("MOnths contain 31 days");
            break;

            case FEBRUARY:
                System.out.println("Feb contains 28 or 29 days");
            case JUNE:
            case NOVEMBER:
            case APRIL:
            case SEPTEMBER:
                System.out.println("months contain 30 days");
                 break;

        }


    }
}