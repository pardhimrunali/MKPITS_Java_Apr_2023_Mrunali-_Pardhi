import java.io.*;

public class StudentMethod {
    public static void writeObject(Student s) throws IOException {
        ObjectOutputStream print=new ObjectOutputStream(new FileOutputStream("studentDetail.txt"));
        print.writeObject(s);
        print.close();



    }
    protected static void ReadObject() throws IOException, ClassNotFoundException {
        ObjectInputStream read_object=new ObjectInputStream(new FileInputStream("studentDetail.txt"));
        Student objectReader=(Student)read_object.readObject();
        System.out.println(objectReader.getStudent_name()+" "+objectReader.getMark());
       // System.out.println(objectReader);
    }
}
