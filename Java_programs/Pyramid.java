
  //      * * * *
    //  * * * * * *
   // * * * * * * * *
  //* * * * * * * * * *
  //* * * * * * * * * *
   // * * * * * * * *
    //  * * * * * *
      //  * * * *
        //  * *
import java.util.Scanner;
public class Pyramid{
	
public static void main (String[] args)

{
for(int row=1;row<=5;row++)
{
	for(int col=5;col>=row;col--){
		
  System.out.print("  ");
}
		
for(int col=1;col<=row;col++)
{
  System.out.print("* ");
}
for(int col=1;col<row;col++)
{
System.out.print("* ");
}

System.out.println();
}


for(int row=1;row<=5;row++)
            {
                for(int col=1;col<=row;col++)
                {
                    System.out.print("  ");
                }
                for(int col=5;col>=row;col--)
                {
                    System.out.print("* ");
                }
                for(int col=5;col>row;col--)
                {
                    System.out.print("* ");
                }


                System.out.println();
            }


}
}