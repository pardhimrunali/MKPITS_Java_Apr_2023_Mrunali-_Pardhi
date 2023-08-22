import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student("Radha",87);
      //  StudentMethod.writeObject(student);
        StudentMethod.ReadObject();

    }
}