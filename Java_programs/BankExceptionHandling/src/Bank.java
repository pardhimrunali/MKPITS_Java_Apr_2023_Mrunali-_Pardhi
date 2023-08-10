public class Bank {
   int balance;

     Bank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int deposit)throws InvalidAmount
    {
        if(deposit<100)
throw new InvalidAmount();
        balance=balance+deposit;
        return balance;
    }
public void withdraw(int withdraw) throws InsufficientBalance{
         if(balance<withdraw)
             throw new InsufficientBalance();
        balance=balance-withdraw;

}


    }

