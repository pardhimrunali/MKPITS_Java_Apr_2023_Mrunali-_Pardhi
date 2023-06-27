import java.util.Scanner;
public class FirstPat{
public static void main(String args[])
{

        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
   for (int row=1;row>=rows;row--)
   {
   for( int space=row;space>row;space--){
                System.out.print(" ");

            }
            for (int col=rows;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
}
}