/**<h1> Print the elements</h1>
*FixedSizeStaticArray program print the value of array  elements as a output.
@author Mrunali Pardhi
@since 05/07/23
*/

/**
*Algorithm to print an array elements
*step 1- declare datatype of an array 
*step 2- give the size to an array
*step 3- enetr the data in array position
*step 4- use for loop to print multiple value
*step 5- write the print statement to print values
**/
class FixedSizeStaticArray{

public static void main(String code[])
{

// declare datatype and name of an variable and size of the array
   int array[]=new int[4];
   
// enter data in array 
array[0]=20;
array[1]=40;
array[2]=80;
array[3]=70;
// for loop to print the values of array
for(int count=0;count<4;count++){
System.out.println(array[count]);

}
   

}

}