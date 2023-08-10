public class ArrayExceptionHandle {
    public static void main(String args[])
    {
        int array[]={1,2,4,5,8};
try {
    for (int i = 0; i <=8; i++) {
        System.out.println(array[i]);
    }
}
//catch (Exception e)
//{
   // System.out.println("Array is complete");
//}
catch(ArrayIndexOutOfBoundsException e ){
    System.out.println("Array is complete");
}
finally {
    System.out.println("");
}
    }
}
