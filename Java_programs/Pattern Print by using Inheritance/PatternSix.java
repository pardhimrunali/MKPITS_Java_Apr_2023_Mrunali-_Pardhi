public class PatternSix {
    public int starPattern(int input){
        for (int row = 1; row <= input; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col <=input; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        return 0;
    }

}
