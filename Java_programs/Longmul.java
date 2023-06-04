class Longm{
	public long MulLong(long number1, long number2){
		return number1 * number2;
	}
}
class Longmul{
	public static void main(String[] args){
		Longm longm = new Longm();
		long ans = longm.MulLong(250,20);
		System.out.println(ans);
	}
}