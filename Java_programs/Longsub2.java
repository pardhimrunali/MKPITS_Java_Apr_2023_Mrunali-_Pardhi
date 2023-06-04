class Longs{
	public long subLong(long number1, long number2){
		return number1 - number2;
	}
}
class Longsub2{
	public static void main(String[] args){
		Longs longs = new Longs();
		long ans = longs.subLong(254,20);
		System.out.println(ans);
	}
}