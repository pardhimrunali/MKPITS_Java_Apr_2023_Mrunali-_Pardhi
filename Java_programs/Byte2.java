class Byte1{
	public byte addByte( byte number1, byte number2){
		return number1 + number2;
	}
}
class Byte2{
	public static void main(String[] args){
		Byte1 byte1 = new Byte1();
		byte ans = byte1.addByte(2,4);
		System.out.println(ans);
	}
}