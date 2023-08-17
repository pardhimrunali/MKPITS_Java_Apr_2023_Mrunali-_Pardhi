public class ThreadSend extends Thread{
    private String msg;
    Sender sender;
    ThreadSend(String m,Sender obj){
       this.msg=m;
       this.sender=obj;
    }

    @Override
    public void run() {
        synchronized (sender){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sender.send(msg);}
    }
}
