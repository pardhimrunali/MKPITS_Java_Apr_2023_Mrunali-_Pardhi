package BankCustomerDepositWithdraw;

public class Customer {
    private String customerName;
    private String accountNumber;
    private  double balance;

    public Customer(String customerName, String accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
   public  void display()
    {
        System.out.println("Customer Details:");
        System.out.println(getCustomerName());
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
