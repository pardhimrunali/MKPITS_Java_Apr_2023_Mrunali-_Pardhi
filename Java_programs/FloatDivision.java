class Divisionfloat{
public float Divifloat(float firstnumber,float secondnumber)
{
  return firstnumber/secondnumber;
}
}
class FloatDivision{
  public static void main(String args[])
  {
    Divisionfloat division=new Divisionfloat();
	float answer=division.Divifloat(4.6f,2.3f);
	System.out.println(answer);
	}
}