public class Example implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
        double d=Math.random();
            System.out.println(d);
        }

    }
}
