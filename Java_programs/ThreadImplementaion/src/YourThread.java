public class YourThread extends Thread{



    @Override
    public void run() {while (true) {
        System.out.println("My name is Mrunali");


        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
    }
}
