import java.io.*;

public class ReadLneWord {
public static void readLineWordCharacter() throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

//Read data from file
    try {
        System.out.println("Enter File Name");
        File file = new File(read.readLine());

        int wordCount=0;
        int characterCount=0;
        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = br.readLine();
            while (str != null) {

                String [] array=str.split(" ");
                wordCount=wordCount+array.length;
                for(int number=0;number<array.length;number++){


                }
                System.out.println(str);
                str = br.readLine();

            }

            System.out.println("Number of Words in file are"+" "+wordCount);
            System.out.println("Number of character in file are"+" "+characterCount);
        } else
            System.out.println("File not Found");
    } catch (IOException e) {
        System.out.println(e);
    } catch (Exception e) {
        System.out.println(e);
    }

}
}
