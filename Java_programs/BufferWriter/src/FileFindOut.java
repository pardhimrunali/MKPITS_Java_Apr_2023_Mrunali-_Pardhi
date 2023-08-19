import java.io.*;

public class FileFindOut {
    public static void main(String[] args)
    {
        BufferedReader q=new BufferedReader(new InputStreamReader(System.in));
        try {
            String  str=q.readLine();


            File s=new File("StudentList.txt");
            BufferedReader br = new BufferedReader(new FileReader(s));
            System.out.println(br);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
