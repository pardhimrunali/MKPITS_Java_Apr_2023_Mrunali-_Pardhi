package CalArea;

public class Square implements CalculateArea
{

int side;

    public void Square(int side) {
        this.side = side;
    }



    @Override
    public void  calArea() {
        int Area=side*side;
        System.out.println("Area of Square is " +Area);


    }
}
