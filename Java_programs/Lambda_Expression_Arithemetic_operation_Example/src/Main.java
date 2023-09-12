
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5:Modulor");
        System.out.println("Enter Choice:-");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ArithmeticOperation additionOfNumber = (int numberFirst, int numberSecond) ->
                {
                    System.out.println("Addition of Number is:-" + " " + (numberFirst + numberSecond));
                };
                additionOfNumber.Operation(42, 25);
                break;
            case 2:
                ArithmeticOperation subtractionOfNumber = (int numberFirst, int numberSecond) ->
                {
                    System.out.println("Subtraction of two number is:-" + " " + (numberFirst - numberSecond));
                };
                subtractionOfNumber.Operation(800,69);
                break;

            case 3:
                ArithmeticOperation multiplicationOfNumber=(int numberFirst,int numberSecond)->
                {
                    System.out.println("Multiplication of number is:-"+" "+(numberFirst*numberSecond));
                };
                multiplicationOfNumber.Operation(25,36);
                break;

            case 4:
                ArithmeticOperation divisionOfNumber=(int numberFirst,int numberSecond)->
            {
                System.out.println("Division of Number is:-"+" "+(numberFirst/numberSecond));
            };
                divisionOfNumber.Operation(33,11);
                break;

            case 5:
                ArithmeticOperation modulor=(int numberFirst,int numberSecond)->
                {
                    System.out.println("Modulor Value is:-"+" "+(numberFirst%numberSecond));
                };
                modulor.Operation(25,3);
                break;

            default:
                System.out.println("Choice Incorrect");
        }
    }
}