class Double{
    public double addDouble(double number1,double number2)
	{
	return number1 + number2;
	}
		   
}
class Double1{
    public static void main(String[] args)
	{
	Double double2 = new Double();
	double ans = double2.addDouble(4.56345, 2.45345);
	System.out.println(ans);
	}
}