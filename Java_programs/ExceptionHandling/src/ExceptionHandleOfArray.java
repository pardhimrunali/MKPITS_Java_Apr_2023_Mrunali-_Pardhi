public class ExceptionHandleOfArray {
public static void main(String[] args) {
    int array[] = {4, 6, 8, 7};
    try {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    catch(Exception e){
        System.out.println("Array limit is over");
    }
    finally{
        System.out.println("Array value are 4,6,8,7");
    }
}

}
