public class PrintFibonacci {

	public static void printFibonacciSequence(int counter) {
		int numberone = 0;
		int numbersecond= 1;
		int numberthird= 1;

		for (int count = 1; count <= counter; count++) {
			System.out.print(numberone + ", ");

            numberone = numbersecond;
			numbersecond = numberthird;
			numberthird = numberone + numbersecond;
		}
	}

	public static void main(String[] args) {
    	printFibonacciSequence(10);
	}

}