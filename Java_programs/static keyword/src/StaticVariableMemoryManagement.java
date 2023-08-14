public class StaticVariableMemoryManagement {

    String student_name;
    int roll_no;
    static String college_name="Gurdarshan College";

    public StaticVariableMemoryManagement(String student_name, int roll_no) {
        this.student_name = student_name;
        this.roll_no = roll_no;
    }
   public  void  collegeDetails(){
        System.out.println(student_name+" "+roll_no+" "+college_name);
    }
}
class Student{
    public static void main(String args[])
    {
        StaticVariableMemoryManagement studentFirst=new StaticVariableMemoryManagement("Ram Bajaj",201);
        studentFirst.collegeDetails();
        StaticVariableMemoryManagement studentSecond=new StaticVariableMemoryManagement("Priya Charan",2002);
        studentSecond.collegeDetails();
    }

}
