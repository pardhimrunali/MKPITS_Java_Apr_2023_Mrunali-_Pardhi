package loan;

public class Loan {
    private int account_number;
    private double amount;
    private int time;
    //  public Loan(){
    //   account_number=234598965;
    //   amount=200000;
    //    time=2;

    // }

    public int getAccount_number() {
        return account_number;
    }

    public double getAmount() {
        return amount;
    }

    public int getTime() {
        return time;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTime(int time) {
        this.time = time;
    }


}
