public class PatternOneDiamondDown  extends PatternOneDiamond{

    public int starPattern(int input){
        for(int row=1; row<=input-1 ; row++)
        {
            for (int space=1; space<=row; space++)
            {
                System.out.print(" ");
            }
            for (int col=0; col<=input-1-row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
return 0;
    }
}
