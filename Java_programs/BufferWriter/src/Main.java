import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BufferedReader print=new BufferedReader(new InputStreamReader(System.in));

        try {
            BufferedWriter wr=new BufferedWriter(new FileWriter("Name.txt"));
            System.out.println("Enter Name");
            String w=print.readLine();
            wr.write(w);
            wr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}