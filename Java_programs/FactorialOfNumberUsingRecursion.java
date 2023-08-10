import java.util.Scanner;
class FactorialOfNumberUsingRecursion{
public static void main(String args[])
{
Factorial();
System.out.println("Factorial of Number "+ " is "+ f);	
}
//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Number");
		//int number=sc.nextInt();
		static int   count=1;
		 static int  f=1;
public  static void Factorial(){
if(count<5)
{
			   count++;
			   f=count*f;
			   
			Factorial();
				
		
		}
		

		
}

}