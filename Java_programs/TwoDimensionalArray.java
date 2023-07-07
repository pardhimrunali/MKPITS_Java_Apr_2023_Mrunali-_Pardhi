import java.util.Scanner;
class TwoDimensionalArray{
public static void main(String args[]){

 Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of rows");
 int row=sc.nextInt();
 System.out.println("Enter the number of coloumn");
  int coloumn=sc.nextInt();
 
int array[][]=new int[row][coloumn];
for(int count=0;count<row;count++){
	for(int countcol=0;countcol<coloumn;countcol++){
		// System.out.println("Enter the value in   rows and column");
		 array[count][countcol]=sc.nextInt();
		
	}
}

for(int count=0;count<row;count++){
	for(int countcol=0;countcol<coloumn;countcol++){
		System.out.print(array[count][countcol] + " ");
		 
		
	
}
System.out.println();

} 

}

}