// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Sender t=new Sender();
       ThreadSend t1=new ThreadSend("hello",t);
       ThreadSend t2=new ThreadSend("Byee",t);
       t1.start();
       t2.start();


        //annonyomus class
        Thread tr= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hii teju byee DJ Hopeless ");
            }
        });
        tr.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hii teju byee DJ Hopeless ");
            }
        }).start();

        System.out.println("--------wait notify------------");
   Thread a=new Thread(new WaitMethod());
   Thread b=new Thread(new WaitMethod());
   a.start();
   b.start();
    }
}