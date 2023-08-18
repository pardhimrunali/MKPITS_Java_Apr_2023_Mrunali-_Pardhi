// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WaitNotify w=new WaitNotify();
        w.start();
        synchronized (w){
            w.wait();
        }
        System.out.println(w.total);

    }
}