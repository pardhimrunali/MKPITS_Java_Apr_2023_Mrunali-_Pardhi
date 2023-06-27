public class Service {
    void pattern(String patternName)
    {
        switch(patternName){
            case "patternOne":
                PatternFirst pyramid=new PatternFirst();
                pyramid.pyramidPattern();
                break;
            case"patternSecond":
                PatternSecond patternsecond=new PatternSecond();
                patternsecond.rightAngleTriangle();
                break;
            case"patternThird":
                PatternThird lowerTriangle=new PatternThird();
                lowerTriangle.reverseTriangle();
                break;
            case"patternFour":
                    PatternFour patternfour=new PatternFour();
                    patternfour.patterStairs();
            case"patternFive":
                PatternFive timerPattern=new PatternFive();
                timerPattern.patternTimer();

        }
    }
}
