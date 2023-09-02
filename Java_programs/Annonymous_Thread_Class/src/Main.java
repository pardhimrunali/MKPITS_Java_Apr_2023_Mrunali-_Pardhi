public class Main extends  Thread
{
    public static void main(String[] args) {
  Thread t=new Thread(new Runnable() {
      @Override
      public void run() {

          System.out.println("hiiiiii shreyu");

      }
  });
t.start();

    }
}