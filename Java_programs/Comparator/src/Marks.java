import javax.swing.*;
import java.util.Comparator;

public class Marks implements Comparator<Student> {




    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks()==o2.getMarks())
            return 0;

        //> for descending < for ascending
        else if ((o1.getMarks()>o2.getMarks())) {
            return -1;
        }
            else{
                return 1;
            }
        }
        //return o1.marks-o2.marks;
    }

