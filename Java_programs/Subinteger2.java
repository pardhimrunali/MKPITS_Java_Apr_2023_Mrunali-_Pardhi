class Subint{
public int subint(int firstnumber,int secondnumber)
{
  return firstnumber-secondnumber;
}
}
class Subinteger2{
  public static void main(String args[])
  {
    Subint sum=new Subint();
	int answer=sum.subint(30,20);
	System.out.println(answer);
	}
}