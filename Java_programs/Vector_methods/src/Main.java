import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> student=new Vector<>();
        //using add method
        student.add(45);
        student.add(785);
        student.add(479);
        student.add(635);
        student.add(987);

        System.out.println("Student Roll Numbers are:-"+" "+student);

        //capacity()
        //Returns the current capacity of this vector.
        System.out.println("Current capacity of this vector:-"+" "+student.capacity());
//add(int index, E element)
//Inserts the specified element at the specified position in this Vector.
        student.add(2,89);
        for (Integer num:student
             ) {
            System.out.println("Elements added in position 2 is :-"+" "+num);

        }

        //copyInto(Object[] anArray)
        //Copies the components of this vector into the specified array
        //String student_mark=new String();
        Integer mark_student[]=new Integer[10];
        student.copyInto(mark_student);
        for(int count=0;count<student.size();count++)
        {
            System.out.println("Copied element are:-"+" "+mark_student[count]);
        }

        //contains(Object o)
        //Returns true if this vector contains the specified element.
        System.out.println("Element is present in vector :-"+" "+student.contains(52));

    }
}