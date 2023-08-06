public class Rectangle  extends ShapeArea{
    int length;
    int breadth=10;

     Rectangle(int length) {
        this.length = length;
    }
    void calculateArea(){
        int areaOfRectangle=length*breadth;
        System.out.println("Area of rectangle is "+areaOfRectangle);
    }


}
