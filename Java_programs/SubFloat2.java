class Floats{
	public float subFloat(float number1, float number2){
		return number1 - number2;
	}
}
class SubFloat2{
	public static void main(String[] args){
		Floats floats = new Floats();
		float ans = floats.subFloat(4.3f,2.3f);
		System.out.println(ans);
	}
}