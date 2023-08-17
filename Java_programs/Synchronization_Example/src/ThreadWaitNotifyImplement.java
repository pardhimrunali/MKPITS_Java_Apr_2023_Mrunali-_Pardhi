public class ThreadWaitNotifyImplement {
    public static void main(String[] args) throws InterruptedException {
        WaitMethod b=new WaitMethod();
        b.start();

     synchronized (b) {
         try {
            b.wait();
         } catch (InterruptedException e) {
            // e.printStackTrace();
         }
         System.out.println("Total is " + b.total);

     }

    }
}
