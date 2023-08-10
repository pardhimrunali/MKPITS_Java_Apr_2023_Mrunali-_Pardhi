// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bank b=new Bank(20000);
        System.out.println( b.getBalance());
        try {
            b.deposit(4);
        } catch (InvalidAmount e) {
            System.out.println(e.getMessage());

        }
        System.out.println("Total Amount after deposit is "+b.getBalance());


        try{
        b.withdraw(200000);
        }
        catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }System.out.println(b.getBalance());
    }
}