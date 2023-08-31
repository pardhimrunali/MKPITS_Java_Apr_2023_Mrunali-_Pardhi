import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
       List<Integer> number=new ArrayList<Integer>();
       number.add(520);
       number.add(800);
       number.add(990);
       number.add(1770);


        ListIterator num=number.listIterator();
        System.out.println("----------Forward Travers---------");
        while(num.hasNext())
        {
            System.out.println("Forward Traversing:-"+" "+num.next());
        }

        System.out.println("------------Backward Traversing------------");
        while(num.hasPrevious())
        {
            System.out.println("Backward Traverse:-"+" "+num.previous());
        }
    }
}