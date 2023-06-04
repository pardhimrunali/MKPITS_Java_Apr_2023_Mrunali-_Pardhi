class Modfloat{
public float Modufloat(float firstnumber,float secondnumber)
{
  return firstnumber%secondnumber;
}
}
class FloatMod{
  public static void main(String args[])
  {
    Modfloat mod=new Modfloat();
	float answer=mod.Modufloat(7.0f,2.3f);
	System.out.println(answer);
	}
}