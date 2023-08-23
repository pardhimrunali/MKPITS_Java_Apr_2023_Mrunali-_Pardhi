import java.io.*;

public class LongestWord {
    public static void main(String[] args) {

            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

//Read data from file
            try {
                System.out.println("Enter File Name");
                File file = new File(read.readLine());




                if (file.exists()) {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String str = br.readLine();
                    String longestWord=new String();
                    while (str != null) {

                        String[] array = str.split(" ");

                        for (String word : array) {
                            if(word.length()>longestWord.length()) {
                                longestWord=word;


                            }
                        }
                        str = br.readLine();
                    }
                    System.out.println("Longest Word is "+" "+longestWord);

                } else
                    System.out.println("File not Found");
            } catch (IOException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

