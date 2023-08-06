public class Circle extends ShapeArea{
    int radius;
    double pi;
    Circle( int radius,double pi)
    {
        this.radius=radius;
        this.pi=pi;
    }

void calculateArea(){


    double a=2*pi*radius*radius;
    System.out.println("Area of circle is " + a);

}
}
