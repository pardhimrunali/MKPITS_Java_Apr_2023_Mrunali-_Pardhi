
import java .util.Scanner;
public class PatternOfStar{
public static void main(String[] args)

{
System.out.println("Enter the number of rows");
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();

for( int row=1;row<=rows;row++)
{
for( int col=1;col<=rows;col++)
{
System.out.print("*");
}
System.out.println();
}


}
}