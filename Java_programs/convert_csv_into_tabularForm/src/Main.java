import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader readData=new BufferedReader(new FileReader("E://MKPITS//MKPITS_Java_Apr_2023_Mrunali-_Pardhi//Java_programs//convert_csv_into_tabularForm//SampleCSVFile_2kb.csv"));
    String read=readData.readLine();

    while(read!=null)
    {
      //  System.out.println(read);
        String array[]=read.split(",");
        for(int count=0;count<array.length;count++)
        {
            System.out.println(array[count]);
        }
        read=readData.readLine();


    }
    }
}