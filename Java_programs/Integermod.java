class Modulusint{
public int Modint(int firstnumber,int secondnumber)
{
  return firstnumber%secondnumber;
}
}
class Integermod{
  public static void main(String args[])
  {
    Modulusint mod=new Modulusint();
	int answer=mod.Modint(15,4);
	System.out.println(answer);
	}
}