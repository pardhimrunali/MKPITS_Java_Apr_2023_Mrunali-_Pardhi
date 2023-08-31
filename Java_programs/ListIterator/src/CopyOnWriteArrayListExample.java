import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String args[])
    {

        CopyOnWriteArrayList<Integer> number=new CopyOnWriteArrayList<>();
        number.add(50);
        number.add(150);
        number.add(520);
        number.add(530);
        number.add(500);
        number.add(507);
        number.add(597);
        System.out.println(number);

    }
}
