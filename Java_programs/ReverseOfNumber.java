import java.util.*;
public class ReverseOfNumber
{
public static void main(String args[])
{
int number,temporary;                                                             ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
number=sc.nextInt();
while(number>0)
{
	 temporary=number%10;
	System.out.print(temporary);
	number=number/10;

}

}
}