public class PatternOneDiamond {
    public int starPattern(int input) {

        for (int row = 0; row <= input; row++) {
            for (int space = input; space > row; space--) {
                System.out.print(" ");

            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }


}
