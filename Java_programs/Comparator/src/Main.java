import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
// Creating an empty ArrayList of Student type
        LinkedList<Student> data=new LinkedList<Student>();
        Student[] students=new Student[4];
        students[0]=new Student("bru",50);
        students[1]=new Student("arun",55);
        students[2]=new Student("crunal",10);
        students[3]=new Student("pk",80);

        data.addAll(Arrays.asList(students));

        for (Student p:data
        ) {
            System.out.println("Unsorted Data:-"+" "+p.getName()+" "+p.getMarks());

        }

        Collections.sort(data,new Marks());

        for (Student p:data
        ) {
            System.out.println("Sorted Data by marks:-"+" "+p.getName()+" "+p.getMarks());

        }

        Collections.sort(data,new Name());

        for (Student p:data
        ) {
            System.out.println("Sorted Data by Name:-"+"  "+p.getName()+" "+p.getMarks());

        }


    }
}