import java.util.Scanner;
public class PatternSix {
    public void patternShape(){
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col <= rows; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for(int row=rows-1;row>=1;row--)
        {
            for(int space=1;space<=row;space++)
            {
                System.out.print(" ");
            }
            for  (int col=row;col<=rows;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
