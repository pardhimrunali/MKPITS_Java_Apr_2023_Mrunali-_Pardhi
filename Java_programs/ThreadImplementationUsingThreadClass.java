public class ThreadImplementationUsingThreadClass extends Thread{

public void run(){
System.out.println("Thraed Implementation using Thread class");

}
public static void main(String [] args)
{


ThreadImplementationUsingThreadClass print=new ThreadImplementationUsingThreadClass();
print.run();
print.start();

}

}