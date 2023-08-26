import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentData {
    LinkedList<Student>StudentDataAll;

    Scanner sc;
    Student student;
    StudentData() {
        StudentDataAll= new LinkedList<Student>();
        sc=new Scanner(System.in);
    }

    public void show() {
        int choice;

        while (true) {
            System.out.println(" 1:Add Record \n 2:Display Record \n 3:Find Record \n 4:Modify Marks \n 5:Delete Record \n 6:Delete All \n 7:Exit");
            System.out.println("Enter Choice:-");
            choice = sc.nextInt();



            switch (choice) {
                case 1:
                    System.out.println("enter name and Marks ");
                    student=new Student(sc.next(),sc.nextInt());
                    StudentDataAll.add(student);
                    break;
                case 2:
                    for (Student show_record:StudentDataAll
                    ) {
                        System.out.println(show_record.getName()+" "+show_record.getMarks());
                    }
                    break;
                case 3://find
                    System.out.println("Enter the  data position which you want to find:-");
                    int n=sc.nextInt();
                    System.out.println(StudentDataAll.get(n));
                    break;



                case 4://modify
                    System.out.println("Enter the position and data where you want enter:-");
                    int counter=sc.nextInt();
                    Student modify_data=new Student(sc.next(),sc.nextInt());
                    StudentDataAll.set(counter,modify_data);
                    break;

                case 5://delete
                    System.out.println("Enter the Position of data which you want to delete:-");
                    int count=sc.nextInt();
                    StudentDataAll.remove(count);
                    break;


                case 6://delete_all
                    StudentDataAll.clear();
                    System.out.println("Data is cleared");
                    break;



                case 7:
                    return;


            }
        }
    }





}









