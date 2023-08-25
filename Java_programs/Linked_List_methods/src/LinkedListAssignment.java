import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssignment {
    public static void main(String args[])
    {
        System.out.println("-------append the specified element to the end of a linked list.----");
        LinkedList number=new LinkedList();
        number.add(45);
        number.add(78);
        number.add(98);
        number.add(65);
        number.addLast(36);
        Iterator num=number.iterator();
        while(num.hasNext())
        {
            System.out.println("value of the number are:-"+num.next());
        }

        System.out.println("append the element at last is 36 "+" "+number);

        System.out.println("----iterate through all elements in a linked list----");
        number.listIterator();
        System.out.println(number);

        System.out.println("---------iterate through all elements in a linked list starting at the specified position.------------");
        Iterator print=number.listIterator(2);
        while(print.hasNext()){
            System.out.println(print.next());

    }


        System.out.println(number);

        System.out.println("--------------iterate a linked list in reverse order.-----------------");
        Iterator reversenumber=number.descendingIterator();
        while(reversenumber.hasNext())
        {
            System.out.println("Reverse of the number is :-"+" "+reversenumber.next());
        }

        System.out.println("---------insert the specified element at the specified position in the linked list.------------");
        number.add(2,99);
        System.out.println(number);

        System.out.println("-----------insert elements into the linked list at the first and last positions.--------------");
        number.addFirst(101);
        number.addLast(546);
        System.out.println(number);

        System.out.println("---------insert the specified element at the front of a linked list.----------");
        number.offerFirst(87);




    }
}
