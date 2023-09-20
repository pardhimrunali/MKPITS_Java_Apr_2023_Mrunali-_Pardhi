import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;

    List<Course> data_of_student;

    public Student(String name, List<Course> data_of_student) {
        this.name = name;
        this.data_of_student = data_of_student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData_of_student(List<Course> data_of_student) {
        this.data_of_student = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getData_of_student() {
        return data_of_student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", data_of_student=" + data_of_student +
                '}';
    }

    public double calGpi(Course c)
    {
        int hours=0;
        double grade=0.0;
        double gpa=c.getHours()*c.getGrade()*10;
        return gpa;

    }



}
