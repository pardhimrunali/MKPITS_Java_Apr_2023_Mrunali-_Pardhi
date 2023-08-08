// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       double firstNumber=20;
       double secondNumber=4;

        System.out.println("1.Maximum of two numbers is  "+Math.max(firstNumber,secondNumber));
        System.out.println("2.Minimum of two numbers is  "+Math.min(firstNumber,secondNumber));
        System.out.println("3.Squareroot of numbers is  "+Math.sqrt(secondNumber));
        //power of method 20*20*20*20 return 160000
        System.out.println("4. Power of firstnumber and secondnumber is  "+Math.pow(firstNumber,secondNumber));
        System.out.println("5.Logarithmic value of secondnumber is  "+Math.log(secondNumber));
		//ceil method static double
//ceil(double a)
//Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
	double third=4.4;
	System.out.println("6. "+Math.ceil(third));

    }
}