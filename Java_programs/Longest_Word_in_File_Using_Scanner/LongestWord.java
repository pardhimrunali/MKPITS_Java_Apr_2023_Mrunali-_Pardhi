import java.util.Scanner;
import java.io.*;

public class LongestWord {
    public static void FindLongestWord(String textFile) throws IOException {

        Scanner scanner = new Scanner(new File(textFile));

        String longestWord=new String();

        while(scanner.hasNext()){
            String word=scanner.next();

            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("Longest Word="+longestWord);

    }
}