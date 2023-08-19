import java.io.*;

public class ReadDataFromFile {
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

//Read data from file
        try {
            System.out.println("Enter File Name");
            File file = new File(read.readLine());
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String str = br.readLine();
                while (str != null) {
                    System.out.println(str);
                    str = br.readLine();
                }
            } else
                System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }

