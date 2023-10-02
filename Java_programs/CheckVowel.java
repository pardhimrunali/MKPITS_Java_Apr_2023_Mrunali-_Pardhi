import java.util.*;
public class CheckVowel
{
	public static boolean stringContainsVowels(String word)
	{
		
		return word.toLowerCase().matches(".*[aeiou].*");
	}	
public static void main(String args[])
{
System.out.println(stringContainsVowels("Java"));
System.out.println(stringContainsVowels("TV"));
}
}