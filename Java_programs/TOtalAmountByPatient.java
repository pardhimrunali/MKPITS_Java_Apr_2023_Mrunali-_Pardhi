import java.util.*;
public class TOtalAmountByPatient
{
public static void main(String args[])
{
	int sum=0,temp=0,age;
	int count;
int myArray[] = new int[20];
Scanner sc=new Scanner(System.in);
for( count=0;count<myArray.length;count++)
{
	System.out.println("Enter age of patient:-");
         myArray[count]=sc.nextInt();
		 if(myArray[count]<0 && myArray[count]>120)
		 {
			 System.out.println("Invalid age")
		 }
		 if(myArray[count]<20)
		 {
			 sum=sum+300;
		 }
		 
		if(myArray[count]>17 && myArray[count]<40)
		 {
			 sum=sum+400;
		 }
		 if(myArray[count]>60)
			 {
			 sum=sum+200;
		 }
	   
}

System.out.println(sum);

}
}