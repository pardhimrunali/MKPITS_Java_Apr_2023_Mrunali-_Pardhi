public class PatternFourRightAngleTriangle {
    public int starPattern(int input){
        for(int row=1;row<=input;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }


            System.out.println();
        }
        for(int row=2;row<=input;row++)
        {
            for(int col=input;col>=row;col--)
            {
                System.out.print("* ");
            }


            System.out.println();
        }
        return 0;
    }
}
