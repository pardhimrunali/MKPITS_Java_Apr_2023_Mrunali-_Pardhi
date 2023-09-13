import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.addAll(Arrays.asList(25,45,78,98,63,54));
        //iterating by passing Lambda Expression
        number.forEach(numbers->System.out.println(numbers));


    }
}