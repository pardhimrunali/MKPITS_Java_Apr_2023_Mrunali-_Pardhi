/**
 * @param  int  datatype is used  to store the variable value variable is numberfirst and numbersecond
*@result to store the rseult answer variable is used

**/
 class Subtraction1{
	            public byte Subbyte(byte numberfirst,byte numbersecond)
				{
					return numberfirst - numbersecond;
				}
static void main(String[] args)
		  {
		    Subtraction1 subtraction=new Subtraction1();
			byte answer=subtraction.Subbyte(40,20);
			System.out.println(answer);
		  }
}