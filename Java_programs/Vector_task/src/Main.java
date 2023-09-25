import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> number=new Vector<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
        Scanner sc=new Scanner(System.in);
        int i;

        int value;
        for( i=0;i<10;i++)
        {
            System.out.println("Add the elements:-");
            value=sc.nextInt();
            number.set(value%10,value);
        }
        System.out.println(number);


        //copy non zero element in new vector

        Vector<Integer> newNumbers=new Vector<>();
        for(int counter=0;counter<number.size();counter++)
        {
            if(newNumbers.elementAt(counter)!=0)
            {
                counter++;
            }
            System.out.println(newNumbers.add(counter));
        }

    }
}