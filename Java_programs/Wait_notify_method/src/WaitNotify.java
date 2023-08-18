public class WaitNotify extends Thread{
    int total=0;

    @Override
    public void run(){ synchronized(this) {
        for(int i=0;i<200;i++)
        {
            total +=i;

        }
        this.notify();

    }
}}
