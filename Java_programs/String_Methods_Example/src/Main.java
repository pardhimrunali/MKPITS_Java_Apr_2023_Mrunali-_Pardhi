
public class Main {
    public static void main(String[] args) {

        String name="Mrunali";
        int  lengthOfString=name.length();
        String reverseOfName=" ";
        for(int count=lengthOfString-1;count>=0;count--)
        {
          reverseOfName=reverseOfName+name.charAt(count);
        }

        System.out.println("Reverse of string is :-" +reverseOfName);

    }
}