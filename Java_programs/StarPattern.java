public class StarPattern {
    public static void main(String[] args) {
		//create an array 
        int array[][]=new int[5][5];
	   

        int middle = array.length/ 2;
// for loop for row
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                if (row <= middle) {
                    if (col == middle - row || col == middle + row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (col == middle - (array.length- 1 - row) || col == middle + (array.length - 1 - row)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}