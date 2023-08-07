package CalArea;

public class Rectangle implements CalculateArea{

    int length;
  int breadth;

    public void Rectangle
            (int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }





    @Override
    public void calArea() {
        int CalArea=length*breadth;
        System.out.println("Area of Rectangle is " + CalArea);

    }
}
