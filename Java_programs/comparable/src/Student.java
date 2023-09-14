public class Student  implements Comparable<Student> {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {

        return name + marks;
    }

    @Override
    public int compareTo(Student o) {
        if(marks==o.marks)

            return 0;
                    else if(marks<o.marks)
                    return -1;
                    else{
            return 1;
        }

    }
}

