interface Interface{
  public void print();
  
  default void xerox(){
	  System.out.println("xerox the Copy");
  }
	 
  
}
class Test2 implements Interface{

    public void print(){
System.out.println("Print the book");

	}
 
   

}


class Test {
	public static void main(String args[])
{
	Test2 test=new Test2();
	test.print();
      test.xerox();
}
} 