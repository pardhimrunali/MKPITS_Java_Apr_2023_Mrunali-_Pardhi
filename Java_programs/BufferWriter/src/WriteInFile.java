import java.io.*;

public class WriteInFile {

//write inside file

        public static void main(String[] args) {

            BufferedReader print=new BufferedReader(new InputStreamReader(System.in));

            try {
                BufferedWriter wr=new BufferedWriter(new FileWriter("StudentList.txt"));
                System.out.println("Enter Name");
                String w=print.readLine();
                while (true) {
                    if(w.equals("end"))
                        break;
                    wr.write(w+"\n");
                    w=print.readLine();

            }
            wr.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }

