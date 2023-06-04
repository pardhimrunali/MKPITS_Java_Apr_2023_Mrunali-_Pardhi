class Multiplyfloat{
public float Multifloat(float firstnumber,float secondnumber)
{
  return firstnumber*secondnumber;
}
}
class Floatmul{
  public static void main(String args[])
  {
    Multiplyfloat mul=new Multiplyfloat();
	float answer=mul.Multifloat(4.3f,2.3f);
	System.out.println(answer);
	}
}