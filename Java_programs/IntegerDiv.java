class Divisionint{
public int Divint(int firstnumber,int secondnumber)
{
  return firstnumber/secondnumber;
}
}
class IntegerDiv{
  public static void main(String args[])
  {
    Divisionint division=new Divisionint();
	int answer=division.Divint(15,3);
	System.out.println(answer);
	}
}