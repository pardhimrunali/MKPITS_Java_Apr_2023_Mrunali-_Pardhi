class Short{
	short number1;
	short number2;
	
	public short Addition(){
		short result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Short assign= new Short();
		assign.number1=1;
		assign.number2=1;
		assign.Addition();
		System.out.println(assign.number1);
	}
}