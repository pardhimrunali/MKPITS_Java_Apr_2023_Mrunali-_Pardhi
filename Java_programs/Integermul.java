class Multiplyint{
public int multiint(int firstnumber,int secondnumber)
{
  return firstnumber*secondnumber;
}
}
class Integermul{
  public static void main(String args[])
  {
    Multiplyint multiply=new Multiplyint();
	int answer=multiply.multiint(15,21);
	System.out.println(answer);
	}
}