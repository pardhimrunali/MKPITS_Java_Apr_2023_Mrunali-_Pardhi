
public class Main {
    static {
        System.out.println("hii");
    }
   public static void main(String[] args) {
        System.out.println("byeee");// it will automatically executes static block first then
  Student.display();

   }
   //we can execute multiple static block but sequence will first static block then second then main
static {
    System.out.println("Iam second static block ");
}

}