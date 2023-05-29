/**
 * @param  int  datatype is used  to store the variable value variable is numberfirst and numbersecond
*@result to store the rseult answer variable is used

*/



 public class Subtraction{
	            public int Subinteger(int numberfirst,int numbersecond)
				{
					return numberfirst-numbersecond;
				}
	
             
			 
			 
          
		  public static void main(String[] args)
		  {
		    Subtraction subtraction=new Subtraction();
			int answer=subtraction.Subinteger(40,20);
			System.out.println(answer);
		  }
}