import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("************Array list*******************");
        List student=new java.util.ArrayList();
        student.add("Mrunali Pardhi");
        student.add("Math");
        student.add(45);
        System.out.println("Student Name ,subject name,marks:- "+student);



        System.out.println("**************show data using for each loop**********");
List <String>color=new ArrayList();
color.add("Pink");
color.add("Yellow");
color.add("Blue");
color.add("Green");
for(String color_name:color){
    System.out.println("Name of colors is:-"+color_name);
}

        System.out.println("**********show data using iterator");



        System.out.println("-----aslist() method-------------");
        List number=Arrays.asList(12,48,78);
        System.out.println(number);






    }
}