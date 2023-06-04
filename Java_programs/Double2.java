class Double1{
	public double addDouble( double number1, double number2){
		return number1 + number2;
	}
}
class Double2{
	public static void main(String[] args){
		Double1 double1 = new Double1();
		double ans = double1.addDouble(20.3f,40.3f);
		System.out.println(ans);
	}
}