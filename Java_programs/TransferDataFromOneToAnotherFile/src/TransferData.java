import java.io.*;

public class TransferData {


    static void fileCopy(String filename1,String filename2) throws IOException {

        BufferedReader print=new BufferedReader(new FileReader(filename1));

        BufferedWriter wr=new BufferedWriter(new FileWriter(filename2));
        String str= print.readLine();
        while(str!=null)
        {
            wr.write(str+"\n");
            str= print.readLine();
        }
        wr.close();
        System.out.println("--------content copied-----");






    }
}
