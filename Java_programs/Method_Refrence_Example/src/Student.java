public class Student {
    int roll_number;
    int marks;

    public Student() {
        System.out.println("Hii Iam FullStack Developer");
    }

    public Student(int roll_number, int marks) {
        this.roll_number = roll_number;
        this.marks = marks;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public int getMarks() {
        return marks;
    }

}
