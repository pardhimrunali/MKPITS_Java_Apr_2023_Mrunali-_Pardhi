public class PatternSixDown extends PatternSix{
    public int starPattern(int input){
        for(int row=input-1;row>=1;row--)
        {
            for(int space=1;space<=row;space++)
            {
                System.out.print(" ");
            }
            for  (int col=row;col<=input;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        return 0;
    }
}
