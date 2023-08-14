public class ExampleFirst {

    static String  name="Ram";
    String nameSecond="Priya";
    void namePrint(){
        System.out.println("Mrunali Pardhi");
    }
    static void rollNumber(){
        System.out.println(name);//static method can access only static data
      //  System.out.println(nameSecond);//error will show  non-static variable nameSecond cannot be referenced from a static context
        System.out.println("102");
    }
    static void display()
    {
        rollNumber();//we can call static method directly inside only in the same class
        System.out.println("hii ");
    }


}
class MainStaticMethod{
    public static void main(String args[])
    {




        ExampleFirst print=new ExampleFirst();
        print.namePrint();
        //we can call the static method directly without creating object of that class instead of that we can call it using classname.methodName()
        ExampleFirst.display();
    }
}
