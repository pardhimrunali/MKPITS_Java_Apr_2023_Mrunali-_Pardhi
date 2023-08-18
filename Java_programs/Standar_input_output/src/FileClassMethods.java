import java.io.File;

public class FileClassMethods {
    public static void main(String[] args) {

        System.out.println("------------------File class Methods-------------------------");

        //File(String pathname)
        //Creates a new File instance by converting the given pathname string into an abstract pathname.
        File f = new File("E:\\MKPITS\\MKPITS_Java_Apr_2023_Mrunali-_Pardhi\\Java_programs\\Standar_input_output\\src");
        System.out.println(f.getAbsoluteFile());//current file path
        System.out.println(f.exists());//true

        //File(File parent, String child)
        //        //Creates a new File instance from a parent abstract pathname and a child pathname string.
        File k=new File("E:\\MKPITS\\MKPITS_Java_Apr_2023_Mrunali-_Pardhi\\Java_programs\\Area of shape");
        File q=new File(k,"Main.java");
        System.out.println(q.exists());


        //parent child
        //File(String parent, String child)
        //Creates a new File instance from a parent pathname string and a child pathname string.

        File t = new File("E:\\MKPITS\\MKPITS_Java_Apr_2023_Mrunali-_Pardhi\\Java_programs\\Area of shape", "Main.java");
        System.out.println(t.exists());



        //File[]
        //listFiles()
        //Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname.
        String filenames[]=k.list();
        for(String filename:filenames){
            System.out.println(filename);
        }

        System.out.println(t.lastModified());


    }

}
