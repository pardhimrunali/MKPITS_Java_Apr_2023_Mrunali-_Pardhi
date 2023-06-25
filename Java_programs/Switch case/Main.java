import java.util.Scanner;

public class Main {
        public static void main(String args[]) {
                CheckFloatValueInSwitchCase operation=new CheckFloatValueInSwitchCase();
                operation.OperationOfArithematic(3.0f,3.0f,1.2f);
                operation.OperationOfArithematic(3.00f,1.2f,2.3f);
                int choice;
                System.out.println("Enter your choice");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();

                switch (choice) {


                        case 1:
                                System.out.println("You will get Iphone");
                                break;

                        default:
                                System.out.println("nothing");
                                break;
                        case 2:
                                System.out.println("You will not get car");
                                break;




                }
        }
}