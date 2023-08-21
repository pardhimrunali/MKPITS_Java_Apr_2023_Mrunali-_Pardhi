

public class MYThred extends Thread{
    public MYThred(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("hii");
    }
}
