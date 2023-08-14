public class StaticVariable {
    static int num = 100; //static variable
    int number=10; //non static variable
}
class Demo{
    public static void main (String args[])
    {
        //static variable canbe access without object creating
        System.out.println(StaticVariable.num);//static variable belongs to the class not object


        //static variable number cannot be accessed in static
       // System.out.println(StaticVariable.number);// error will show non-static variable number cannot be referenced from a static context


        //if we want to access the non static variable  in static then we need to create the object
StaticVariable printNumber=new StaticVariable();
        System.out.println(printNumber.number);
    }
}
