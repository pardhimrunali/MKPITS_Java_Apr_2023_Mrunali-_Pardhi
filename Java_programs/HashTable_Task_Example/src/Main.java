import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//Accept array value from user
        int number[]=new int[10];
        int value=0;
        for(int i=0;i<number.length;i++)
        {
            System.out.println("Enter the value:-");
            value=sc.nextInt();
            number[value%10]=value;

        }
        for(int count=0;count<number.length;count++)
        {
            System.out.println(number[count]);
        }


        int counter=0;
        for (int iterator=0;iterator<number.length;iterator++){
            if (number[iterator]!=0){
                counter++;
            }
        }
        double loadFactor=(double)counter/number.length;
        System.out.println("Load factor = " + loadFactor);

//Transfer value into new array
        int newnumber[]=new int[counter];

        for(int c=0,newcounter=0;c<number.length;c++)
        {
            if(number[c]!=0)
            {
                newnumber[newcounter]=number[c];
                newcounter++;
            }
        }
       for(int print=0;print<newnumber.length;print++){
           System.out.println(newnumber[print]);
       }

    }
}