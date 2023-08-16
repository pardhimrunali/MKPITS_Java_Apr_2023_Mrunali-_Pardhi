// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());//to check priority of thred
        System.out.println(Thread.currentThread().getName());
        System.out.println("hey");

        MYThred t=new MYThred("Second");

//t.setName("First");//to set the thred name
        t.start();
        System.out.println("byee");
        System.out.println(t.getPriority());

        //it will print hey
        //then byee then hii because main thread has maximumpriority
        System.out.println(t.getName());//by using object we can find out thred name

   //---------------Runnable interface------------------
        //YourThread y=new YourThread();
        Thread th=new Thread(new YourThread(),"RunnableGhost");
        Thread ty=new Thread(new YourThread(),"Raja");//one resource by multiple thread

        th.setPriority(8      );
        ty.setPriority(5);
        //th.start();
       // ty.start();
        //System.out.println(" Thread counts"+" "+Thread.activeCount());

        Thread print=new Thread(new Example());
        print.start();
    }
}