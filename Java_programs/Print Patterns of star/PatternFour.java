import java.util.Scanner;
public class PatternFour {
    public void patterStairs(){
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int row=1;row<=rows;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }


            System.out.println();
        }
        for(int row=2;row<=rows;row++)
        {
            for(int col=rows;col>=row;col--)
            {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
