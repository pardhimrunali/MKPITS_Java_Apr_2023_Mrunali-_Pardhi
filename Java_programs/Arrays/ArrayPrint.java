class ArrayPrint
{
public static void main(String args[]){
 int []array={7,5,5,6};
 for( int count=0;count<array.length;count++)//when we write the array.length lesss than equal to it will show an error like ArrayIndexOutOfBoundsException wheich means an index that is less than 0, or equal to or greater than the length of the array.
 {
 System.out.println(array[count]);
 }
 }
}