// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Thread t= new Thread(new ThreadFirst());
        t.start();
       
       Thread s=new Thread(new ThreadSecond());
       s.start();
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






    }
}