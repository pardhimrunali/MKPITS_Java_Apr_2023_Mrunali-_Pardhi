public class ReverseOfSentence{
public static void main(String[] args)
{

String fullName="Pardhi Arunkumar Mrunali";
int length=fullName.length();
String reverse=" ";
for(int count=length-1;count>=0;count--){

reverse=reverse+fullName.charAt(count);

}
System.out.println(reverse);
}
}