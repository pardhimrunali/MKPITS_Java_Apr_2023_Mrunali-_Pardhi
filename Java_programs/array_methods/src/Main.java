import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[]={4,8,12,87};
        System.out.println(Arrays.binarySearch(array,8));
        int arrayFirst[]={8,78,94,79,1};
        Arrays.sort(arrayFirst);
        System.out.println(Arrays.binarySearch(arrayFirst,1));
        System.out.println(Arrays.binarySearch(arrayFirst,0,5,8));
       Arrays.fill(arrayFirst,10);
       for(int count=0;count<arrayFirst.length;count++){
            System.out.println(arrayFirst[count]);

        }


        Arrays.fill(array,0,2,7);
        for(int number:array){
            System.out.println(number);
        }




    }
}