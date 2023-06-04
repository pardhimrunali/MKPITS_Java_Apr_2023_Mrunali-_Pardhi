class Doubles{
	public double subDouble( double number1, double number2){
		return number1 - number2;
	}
}
class Doublesub2{
	public static void main(String[] args){
		Doubles doubles = new Doubles();
		double ans = doubles.subDouble(40.3f,20.3f);
		System.out.println(ans);
	}
}