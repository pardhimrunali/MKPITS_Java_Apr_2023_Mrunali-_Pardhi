public class MultipleInheritance extends College,college2{
    public static void main(String[] args) {


        college2 col=new college2();  /* multiple inheritance not possible it will show error*/
        col.start();

    }

}
 class College{

  public   void department(){
        System.out.println("Department list");
    }
}
 class college2 {
    public void start(){
        System.out.println("start at 10 pm");

    }
    public void department(){
        System.out.println("Library department");
    }

}

