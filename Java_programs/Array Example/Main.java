import java.util.Arrays;

public class Main {
    public static void main(String[] args)   {

        int[] num={1,2,3,4,5};
        System.out.println(Arrays.toString(num));


        int[] number=new int[3];

       number[0]=1;
        number[1]=10;
        number[2]=17;
        number[3]=20;
       for(int count=0;count<number.length;count++)
       {
           System.out.println(number[count]);
       }

    }
}