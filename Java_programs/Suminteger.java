class Sumint{
public int sumint(int firstnumber,int secondnumber)
{
  return firstnumber+secondnumber;
}
}
class Suminteger{
  public static void main(String args[])
  {
    Sumint sum=new Sumint();
	int answer=sum.sumint(30,20);
	System.out.println(answer);
	}
}