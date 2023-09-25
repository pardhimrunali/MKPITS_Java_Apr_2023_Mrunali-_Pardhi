interface Area{
     void calArea(int length,int breadth);
}
interface Circle{

    void  CalculateArea(int r);
}
public class Main {
    public static void main(String[] args) {
        Area areaOfRectangle = ((length, breadth) -> {
            System.out.println("Area of Rectangle is :-" + " " + (length * breadth));
        });
        areaOfRectangle.calArea(12, 20);


        //Calculate Area of Circle

        Circle circle = (r -> {

            System.out.println("Area of Circle:-"+(3.14*r*r));

        });

        circle.CalculateArea(5);


    }
}