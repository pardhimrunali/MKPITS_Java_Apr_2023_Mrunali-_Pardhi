import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Course> data_of_student=new LinkedList<Course>();
        Student s=new Student("ram",data_of_student);
        System.out.println("Ram Data:-"+s);
        double result=s.calGpi(new Course(7,5));
        System.out.println(result);

    }
}