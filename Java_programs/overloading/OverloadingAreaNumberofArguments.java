//Method overloading changing number of  arguments area and perimeter

public class  OverloadingAreaNumberofArguments {
    public int  ShapeFirst(int length,int breadth)
    {
        return length*breadth;
    }
    public int   ShapeFirst(int side1,int side2,int side3)
    {
        return side1+side2+side3;
    }
}
