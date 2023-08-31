public class StringMethods {
    public static void main(String [] args){


    String second=new String("Ramesh");
    String name=new String("mrunali");
    String namesecond=new String("mrunali");
    String namethird=new String("mrunlai");
        System.out.println("1. "+ second);
        System.out.println( "2. "+ second.charAt(2));
        System.out.println( "3. "+second.length());
        System.out.println( "4. "+second.substring(2));//it prints the string from the given index position
        System.out.println("5. "+second.compareTo(name));// return integer
        System.out.println( "6. "+second.compareToIgnoreCase(name));
        System.out.println("7. "+second.concat(name));
        System.out.println("8. "+name.contains("ml"));//return false
        System.out.println("9."+name.contains("mru"));//return true
        System.out.println("10."+name.contains("mh"));//return false
        System.out.println("11. "+second.replace("R","G"));
        System.out.println("12. "+second.equals(name));// return boolean false
        System.out.println("13."+name.equals(namesecond));//return true
        System.out.println("14. "+name.equals(namethird));//return false

        String clgname="sarasawati vidyalaya arjuni/mor gondiya";

        System.out.println("15.the code point value of the character at the index:-"+" "+clgname.codePointAt(1));
char[] wish={'G','o','o','d','M','o','r','n','i','n','g'};
String copy=" ";
copy=copy.copyValueOf(wish,0,11);
        System.out.println("Returned String :-"+copy);



    }}
