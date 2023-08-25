import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------linked list content display----------");
        List num=new LinkedList();
        num.add("rmpk");
        num.add("radha");
        System.out.println(num);

        System.out.println("-----------linked list content display using iterator---------");
        LinkedList number=new LinkedList();
        number.add(58);
        number.add(87);
        Iterator iterator=number.iterator();
        while (iterator.hasNext()){
            System.out.println("Value of number are"+" "+iterator.next());
        }

        System.out.println("-----addFirst() --------");
        System.out.println();
         number.addFirst(8);
        System.out.println(number);

        System.out.println("-----addLast() --------");
        System.out.println();
        number.addLast(88);
        System.out.println(number);


        System.out.println("-----get() --------");
        System.out.println("value of position 2 is :"+" "+number.get(2));

        System.out.println("-----set() set the value  --------");
        System.out.println("value of added element is:-"+" "+number.set(2,45));
        System.out.println(number);

        System.out.println("----------size of list");
        System.out.println("size of the list is"+" "+number.size());

        System.out.println("--------show different type of data using for each loop------------------");
        LinkedList chochlate=new LinkedList();
        chochlate.add("Apple");
        chochlate.add(5);
        for(Object it:chochlate){
            System.out.println(it);

        }









    }
}