class Orbitwise{
 public static void main(String args[])
  {
  
    int first=12,second=25,third=28;
	
    System.out.println(first<second | second>third);//true || false->true
	System.out.println(second>third | third>second);//true || true->true
	System.out.println(second>third | first<second);// false || true->true
	System.out.println(first>second | second>third);// false || false->false
  }
}