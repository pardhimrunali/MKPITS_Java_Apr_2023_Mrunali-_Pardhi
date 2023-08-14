public class StaticVariableExample {
    int marks;
    static String subject="Math";

    public StaticVariableExample(int marks) {
        this.marks = marks;
    }

    public void display (){
        System.out.println(marks+" "+subject);
    }
}
