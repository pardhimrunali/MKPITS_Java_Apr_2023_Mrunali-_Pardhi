import java.util.List;

public class Course {
   // String name_of_course;
    int hours;
    double grade;

    public Course(int hours, double grade) {
        this.hours = hours;
        this.grade = grade;
    }

    public int getHours() {
        return hours;
    }

    public double getGrade() {
        return grade;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "hours=" + hours +
                ", grade=" + grade +
                '}';
    }
}

