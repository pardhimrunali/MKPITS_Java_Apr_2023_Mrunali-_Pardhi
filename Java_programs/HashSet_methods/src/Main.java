import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet mark=new HashSet();
        mark.add(700);
        mark.add(456);
        mark.add(70);
        mark.add(50);//duplicates not allowed
        mark.add(150);
        mark.add(520);
        System.out.println(mark);

        //contains(Object o)
        //Returns true if this set contains the specified element.
        System.out.println("Element is present in List :-"+" "+mark.contains(150));


        //boolean
        //isEmpty()
       //Returns true if this set contains no elements.
        System.out.println("List is empty:-"+""+mark.isEmpty());


     //   iterator()
     //   Returns an iterator over the elements in this set.
        Iterator i=mark.iterator();
        while (i.hasNext()){
        System.out.println("Marks of student are:"+" "+i.next());}

        Integer [] markmath={45,87,99,78};
        Integer [] markscience={405,807,909,78};

        HashSet hs1=new HashSet(Arrays.asList(markmath));
        HashSet hs2=new HashSet(Arrays.asList(markscience));
        System.out.println(hs1);
        System.out.println(hs2);
        HashSet union=new HashSet();
        union.addAll(hs1);
        union.addAll(hs2);
        System.out.println("union of set:-"+" "+union);

        HashSet intersection=new HashSet(hs1);
        intersection.retainAll(hs2);
        System.out.println("Intersection Value is:-"+" "+intersection);


        HashSet difference=new HashSet(hs1);
        difference.removeAll(hs2);
        System.out.println("Diffrence of set is:-"+" "+difference);

        HashSet<Integer> list1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> list2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Using removeAll() method (for Lists and Sets)
        HashSet<Integer> difference1 = new HashSet(list1);
        difference1.removeAll(list2);
        System.out.println("Difference using removeAll: " + difference1);





    }
}