public class ThreadNamePrint extends Thread{
    @Override
    public void run() {

        for(int i=1;i<6;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }


}
