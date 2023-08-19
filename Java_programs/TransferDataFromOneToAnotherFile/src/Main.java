import java.io.*;


public class Main {
    public static void main(String[] args) {

      BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Source File");
        try {
            String filename1=b.readLine();
            File file=new File(filename1);
            if(file.exists())
            {
                System.out.println("Enter target file");
                String filename2=b.readLine();
                TransferData.fileCopy(filename1,filename2);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}