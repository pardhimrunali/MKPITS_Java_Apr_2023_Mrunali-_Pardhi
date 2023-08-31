import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> number=new CopyOnWriteArrayList<>();

        // add(E e)
        // Appends the specified element to the end of this list.
        number.add(50);
        number.add(150);
        number.add(520);
        number.add(530);
        number.add(500);
        number.add(507);
        number.add(597);


        //add(int index, E element)
        //Inserts the specified element at the specified position in this list.

         number.add(2,800);
         System.out.println(number);


        //addAll(int index, Collection<? extends E> c)
        //Inserts all of the elements in the specified collection into this list, starting at the specified position.

        CopyOnWriteArrayList<Integer> c=new CopyOnWriteArrayList<>();
        c.addAll(0,number);
        System.out.println(c);


        //  addIfAbsent(E e)
      //  Appends the element, if not present.
        System.out.println(number.addIfAbsent(45));
        System.out.println(number);

//Sorted array
        Collections.sort(number);
        System.out.println("Sorted Value of number:-"+" "+number);


         //clone()
         //Returns a shallow copy of this list.

        System.out.println("Copy of Array is:-"+number.clone());


    }
}