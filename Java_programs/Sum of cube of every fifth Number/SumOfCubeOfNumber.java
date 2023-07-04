public class SumOfCubeOfNumber implements SumOfCubeOfFifthNumber {
    public void sumOfCubeOfNumber() {
        /**create an array
         *
         */
        int array[] = {45, 78, 69, 36, 1, 98, 78, 47, 63, 7,8, 78, 47, 63, 1,2,3,4,7,5};
        /*** declare variable and initialize it
         * */

        int addition = 0;
        System.out.println("Sum of cube of every fifth number Addition and subtraction is "+ addition);

 for (int element = 4; element < array.length; element += 5) {




                if (element % 2 != 0) {

                    System.out.print(array[element] + "*" + array[element] + "*" + array[element]);
                    System.out.print(" + ");
                    addition = addition +( (array[element] * array[element] * array[element]));


                } else {

                    System.out.print(array[element] + "*" + array[element] + "*" + array[element]);
                    System.out.print(" - ");
                    addition = addition -( (array[element] * array[element] * array[element]));

                }
            }


        }
    }

