interface Area{
     void calArea(int length,int breadth);
}
public class Main {
    public static void main(String[] args) {
    Area areaOfRectangle=((length, breadth) -> {
        System.out.println("Area of Rectangle is :-" +" "+(length*breadth));
    });
    areaOfRectangle.calArea(12,20);
    }
    }
