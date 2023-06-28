public class ServiceStarPattern {
    public int serviceStarPattern(int patternChoice,int numberOfLine){
        switch(patternChoice){

            case 1:
                PatternOneDiamond firstPattern=new PatternOneDiamond();
                firstPattern.starPattern(numberOfLine);
                PatternOneDiamondDown firstPatternMerge=new PatternOneDiamondDown();
                firstPatternMerge.starPattern(numberOfLine);
                break;

            case 2:
                PatternSecond patternSecond=new PatternSecond();
                patternSecond.starPattern(numberOfLine);
                break;
            case 3:
                PatternThird patternThird=new PatternThird();
                patternThird.starPattern(numberOfLine);
            case 4:
                PatternFourRightAngleTriangle patternFour=new PatternFourRightAngleTriangle();
                patternFour.starPattern(numberOfLine);
            case 5:
                PatternThird patternThirdOfTimer=new PatternThird();
                patternThirdOfTimer.starPattern(numberOfLine);
                PatternFive patternFive=new PatternFive();
                patternFive.starPattern(numberOfLine);
            case 6:
                PatternSix patternSix=new PatternSix();
                patternSix.starPattern(numberOfLine);
                PatternSixDown patternDown=new PatternSixDown();
                patternDown.starPattern(numberOfLine);
        }
        return 0;
    }



}
