import InterestCalculation.Interest;
import loan.Loan;
public class Main {
    public static void main(String[] args) {

        Loan l=new Loan();
        l.setAccount_number(200000);
        l.setAmount(200);
        l.setTime(2);

        Interest i=new Interest();
        i.interestMethod(l.getAccount_number(),l.getAmount(),l.getTime());




    }
}