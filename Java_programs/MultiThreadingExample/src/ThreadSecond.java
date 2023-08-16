public class ThreadSecond implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<1000;i++)
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i%2!=0)
            {
                System.out.println("odd number"+" "+i);
            }
        }
    }
}
