import java.util.Scanner;
class FactorialOfNumber{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int f=1;
		
		for(int count=1;count<=number;count++)
		{
			
			  f=count*f;
			
			
		}System.out.println("Factorial of Number " + number + " is "+ f);
		
	}

}