import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> mark = new PriorityQueue(20);
        mark.add(78);
        mark.add(97);
        mark.add(63);
        mark.add(21);
        mark.add(64);
        mark.add(54);
        mark.add(54);

        PriorityQueue mark_science=new PriorityQueue();
        mark_science.add(54);
        mark_science.add(74);
        mark_science.add(40);
        mark_science.add(35);

        //display content using foreach loop
        for (Integer number : mark) {
            System.out.println(number);
        }

        //display content using iterator
        Iterator marks_math = mark.iterator();
        while (marks_math.hasNext()) {
            System.out.println(marks_math.next());
        }



        // offer(E e)
        // Inserts the specified element into this priority queue.
        mark.offer(66);
        mark.offer(55);
        System.out.println(mark);

        //peek()
        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println(mark.peek());


        // poll()
       // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(mark.poll());
        System.out.println(mark);


        //  retainAll(Collection<?> c)
      //  Retains only the elements in this collection that are contained in the specified collection (optional operation).
        System.out.println(mark.retainAll(mark_science));


    }
}
