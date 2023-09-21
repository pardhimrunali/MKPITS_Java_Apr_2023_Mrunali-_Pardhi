import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[]=new int[5];
        for (int counter=0;counter<number.length;counter++)
        {
            //get value from user
            System.out.println("Enter the Value:-");
            number[counter]=sc.nextInt();
        }

        //print value of array
        for (int printData:number
             ) {
            System.out.println(printData);

        }

        

    }
}
