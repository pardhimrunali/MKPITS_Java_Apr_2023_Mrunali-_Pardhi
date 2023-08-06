package InterestCalculation;

 final public class Interest {
     private final int rate;
     public Interest(){
         rate=8;
     }

    public  final void  interestMethod(int  account_number,double amount ,int time){
        System.out.println(rate+account_number);

     }
}
