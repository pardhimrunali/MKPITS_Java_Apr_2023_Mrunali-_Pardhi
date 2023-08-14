public class ExampleSecond {

    void Surname(){
        System.out.println("Pardhi");
    }
     static void  SurnameOfRam()
     {
         System.out.println("Pardhi" );
     }
    static void Name(){
        System.out.println("Ram");
        SurnameOfRam();
     // Surname();//error will show non-static method Surname() cannot be referenced from a static context

    }

}
class MainExampleSecond{
    public  static void main(String args[])
    {
        ExampleSecond.Name();
    }
}

