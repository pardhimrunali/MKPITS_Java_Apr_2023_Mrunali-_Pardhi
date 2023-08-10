import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name="Pradnya";// create inside string pool
        String name2="Shiwani";
        String name5="Pradnya";
        String name3=new String("Pradnya");// create outsid the string pool
        String name4=new String("Ram");
        System.out.println(name.equals(name5));//true both   will store in string pool
        System.out.println(name5.equals(name3));//true it will check value only
        System.out.println(name5==name3);//false //it will check value and address
        System.out.println();

    }
}