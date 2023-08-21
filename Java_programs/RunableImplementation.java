class RunableImplementation implements Runnable{
public void run(){
System.out.println("Thraed Implementation using Runnable interface");

}
public static void main(String [] args)
{
//RunableImplementation pr=new RunableImplementation();
//pr.start();
pr.run();

Thread p=new Thread(new RunableImplementation());//anonymous call
p.start();


}
}