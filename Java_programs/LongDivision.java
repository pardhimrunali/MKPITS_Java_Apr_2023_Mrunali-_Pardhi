class LongDiv{
	public long DivLong(long number1, long number2){
		return number1 / number2;
	}
}
class LongDivision{
	public static void main(String[] args){
		LongDiv longdiv = new LongDiv();
		long ans = longdiv.DivLong(2000,400);
		System.out.println(ans);
	}
}