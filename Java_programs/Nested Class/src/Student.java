public class Student {
   private final int roll_number=101;
    class StudentDetails{
        public void display(){
            System.out.println("My Roll Number is"+" "+ roll_number);

        }


    }
    public static void main(String[] args)
    {
        Student studentrollnumber=new Student();
        Student.StudentDetails printrollnumber=studentrollnumber.new StudentDetails();
        printrollnumber.display();
    }
}
