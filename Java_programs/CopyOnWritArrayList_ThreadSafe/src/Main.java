import java.util.ArrayList;

public class Main extends Thread {

  static  ArrayList<String> name=new ArrayList<String>();

    @Override
    public void run() {
       name.add("mru");
       name.add("trupti");
       name.add("neha");
       name.add("radha");
    }

    public static void main(String[] args) {
Main m=new Main();


     }
}