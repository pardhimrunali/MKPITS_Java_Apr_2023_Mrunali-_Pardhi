import BankCustomerDepositWithdraw.Customer;
import BankCustomerDepositWithdraw.CustomerForMoneyTransfer;
import BankCustomerDepositWithdraw.Transaction;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer c=new Customer("Pranali Rathod","12345SB58794",80000);
        c.display();
       // c.setCustomerName("Pranali Rathod");
       // c.setAccountNumber("2103456987B");
       // c.setBalance(50000);
c.display();
        Transaction t=new Transaction();
        t.deposit(c,5000);
        //System.out.println(c.getBalance());
         c.display();

        t.withdraw(c,2000);
        c.display();


        //add new customer
        CustomerForMoneyTransfer detailofcustomer=new CustomerForMoneyTransfer("Ram Bajaj","45617SB01478",70000);
        detailofcustomer.displayDetailsOfCustomer();

//transfer of money
        t.transfer(c,detailofcustomer,500);
        detailofcustomer.displayDetailsOfCustomer();


    }
}