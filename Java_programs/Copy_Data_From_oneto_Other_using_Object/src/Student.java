import java.io.Serializable;

public class Student implements Serializable {
   private String student_name;
   private int mark;

    public Student(String student_name, int mark) {
        this.student_name = student_name;
        this.mark = mark;
    }

    public String getStudent_name() {
        return student_name;
    }

    public int getMark() {
        return mark;
    }
}
