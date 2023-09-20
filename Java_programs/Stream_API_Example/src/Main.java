import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Create a list of string use stream to group them by their length and count the number of string in each group.

        List<String> name=new ArrayList<>(Arrays.asList("Mrunali","Shreyash","Pradnya","Neha","Teju","Pranay","Ashutosh"));
       // name=Arrays.asList("Mrunali,Shreyash,Pradnya,Neha,Teju,Pranay,Ashutosh");
        System.out.println(name);
        Map<Integer,Long> map=name.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));

        map.forEach((key,value)-> System.out.println("String of length"+" "+key+" "+"are"+" "+value));

//create al list of objects (custom object like name and age ) and use a stream to find oldest and youngest object based on age.
        List<Student> showData=new ArrayList<Student>();
        showData.add(new Student("Mrunali",21));
        showData.add(new Student("Trupti",25));
        showData.add(new Student("teju",36));
        showData.add(new Student("Pranay",27));
        Student minimunage=showData.stream().min(Comparator.comparingInt(Student::getAge)).get();
        System.out.println(minimunage);
        Student maximumage=showData.stream().max(Comparator.comparingInt(Student::getAge)).get();
        System.out.println("Maximum age of student is:-"+maximumage);

        



        }
    }
