public class CalculateSumOfSquareOfFourthNumber  implements sumOfSquareOfFourthNumber{

    public void calculateSumOfSquareOfFourthNumber() {
        //Create an array
        int array[] = {  13, 64, 79, 4, 14, 79, 46, 8, 76, 47,13, 64, 79, 74, 214, 779, 46, 8, 176, 4,13, 684, 79, 4, 14, 79, 78, 8, 376, 4,13, 64, 79, 744, 14, 79, 46, 8, 76, 478};
        int addition = 0;

        for (int element = 3; element < array.length; element += 4) {

            System.out.print(array[element] + "*" + array[element]);
            System.out.print(" + ");
            addition += array[element] * array[element];
        }

        System.out.println(  addition);


    }
}
