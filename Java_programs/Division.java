class DivDouble{
  public double Divdouble(double numberfirst,double numbersecond){
    return numberfirst/numbersecond;
	}
}
class Division{
 public static void main(String args[])
 {
   DivDouble div=new DivDouble();
   double answer=div.Divdouble(90.2,20.3);
   System.out.println(answer);
  }
}