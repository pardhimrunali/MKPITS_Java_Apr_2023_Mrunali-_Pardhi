public class ThreadFirst implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<1000;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if( i%2==0) {
                   System.out.println("Even number are" + " " + i);
               }
        }
    }
}
