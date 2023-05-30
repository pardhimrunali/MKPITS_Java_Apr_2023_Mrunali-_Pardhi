class Integer{
    public int AddInt(int numberfirst,int numbersecond)
	{	
				 return (numberfirst+numbersecond);
	}
}
	class Integer1{
    public static void main(String[] args)
		  {
		    Integer integer=new Integer();
			int add=integer.AddInt(10,20);
			System.out.println(add);
		  }
}
	