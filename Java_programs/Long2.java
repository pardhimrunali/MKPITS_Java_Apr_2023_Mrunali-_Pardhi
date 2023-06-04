class Long1{
	public long addLong(long number1, long number2){
		return number1 + number2;
	}
}
class Long2{
	public static void main(String[] args){
		Long1 long1 = new Long1();
		long ans = long1.addLong(254,20);
		System.out.println(ans);
	}
}