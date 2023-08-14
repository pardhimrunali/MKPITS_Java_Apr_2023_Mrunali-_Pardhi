public class Student {
    //we can initialize static members in static block
    static int number;
    static{
        number=10;
        System.out.println("Welcome in our School");
    }
    static void display(){
        System.out.println(number);
        System.out.println("We are glad ");
    }
}
