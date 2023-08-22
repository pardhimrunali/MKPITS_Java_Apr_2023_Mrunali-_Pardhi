import java.io.*;

public class Append {
    public static void appendText(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename,true));
        System.out.println("Enter String Content");
        String s = br.readLine();

while(true) {
        if(s.equals("end"))
        break;
        bw.write(s + "\n");
         s = br.readLine();
}
        bw.close();
    }
}









