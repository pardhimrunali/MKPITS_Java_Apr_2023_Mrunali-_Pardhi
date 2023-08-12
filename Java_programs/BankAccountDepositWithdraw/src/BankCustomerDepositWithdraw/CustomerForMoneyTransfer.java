package BankCustomerDepositWithdraw;

public class CustomerForMoneyTransfer {
  final   private String customer_name;
     final private String account_number;

    final  private double balance;

    public CustomerForMoneyTransfer(String customer_name, String account_number, double balance) {
        this.customer_name = customer_name;
        this.account_number = account_number;
        this.balance = balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetailsOfCustomer(){
        System.out.println("Customer Details Of New Customer:");
        System.out.println(getCustomer_name());
        System.out.println(getAccount_number());
        System.out.println(getBalance());

    }
}
