import java.util.*; 
class LinearSearch{
	public static void main(String args[]){
	int array[]={4,6,7,8,2};
	int count;
	Scanner num= new Scanner(System.in); //System.in is a standard input stream  
      System.out.println("Enter the number: " );
	 int n = num.nextInt();  
for(  count=0;count<array.length;count++){
	if(n==array[count]){
		System.out.println("Number is found");
		break;
	}
		
}	 
	
	if( count==array.length)
		{
		  System.out.println("Number is not found");
	    }
	}

}