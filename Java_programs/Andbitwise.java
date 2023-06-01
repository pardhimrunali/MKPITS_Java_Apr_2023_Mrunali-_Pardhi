class Andbitwise{
  public static void main(String args[])
  {
  
     int first=20,second=30,third=40;

 System.out.println(first>second & third>second);// false && true->false
 System.out.println(third>second & second>first);// true && true->true
 System.out.println(third>second & first>second);//true && false->false
 System.out.println(first>second & third<first);// false && false->false
   }
  }
