import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> showdata=new LinkedList<Student>();
        Student[] students=new Student[4];
        students[0]=new Student(5048,"Mrunali");
        students[1]=new Student(5512,"Trupti");
        students[2]=new Student(1369,"Pradnya");
        students[3]=new Student(2569,"Radha");
        showdata.addAll(Arrays.asList(students));
        for (Student print:showdata
             ) {
            System.out.println("Unsorted data:-");
            System.out.println(print.getErp_id()+" "+print.getName());

        }

        Comparator<Student> sortData=( o1, o2)->{

            if(o1.getErp_id()==o2.getErp_id())
                return 0;

                //> for descending < for ascending
            else if ((o1.getErp_id()>o2.getErp_id())) {
                return -1;
            }
            else{
                return 1;
            }


        };
        Collections.sort(showdata,sortData);
        System.out.println(showdata);

        Collections.sort(showdata, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("Sorted name by using Annonymous class:-");
        System.out.println(showdata);
    }
}