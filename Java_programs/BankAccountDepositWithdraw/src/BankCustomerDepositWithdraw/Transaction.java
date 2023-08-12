package BankCustomerDepositWithdraw;

public class Transaction {
    public double deposit(Customer c, double amount) {
        c.setBalance(c.getBalance() + amount);
        return c.getBalance();
    }

    public double withdraw(Customer c, double withdraw) {
        c.setBalance(c.getBalance() - withdraw);
        return c.getBalance();
    }

    public void transfer( Customer c,CustomerForMoneyTransfer t,double amount_transfer)
    {
        c.setBalance(c.getBalance()-amount_transfer);
        t.setBalance(t.getBalance()+amount_transfer);
    }

}
