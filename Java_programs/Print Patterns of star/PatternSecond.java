import java.util.Scanner;
public class PatternSecond {
 public void rightAngleTriangle()
 {
     System.out.println("Enter the number of rows");
     Scanner sc=new Scanner(System.in);
     int rows=sc.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int col = rows; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
