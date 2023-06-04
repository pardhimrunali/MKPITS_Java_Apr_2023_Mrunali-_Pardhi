class Doublem{
	public double MulDouble( double number1, double number2){
		return number1 * number2;
	}
}
class Doublemul{
	public static void main(String[] args){
		Doublem doublem = new Doublem();
		double ans = doublem.MulDouble(40.3f,20.3f);
		System.out.println(ans);
	}
}