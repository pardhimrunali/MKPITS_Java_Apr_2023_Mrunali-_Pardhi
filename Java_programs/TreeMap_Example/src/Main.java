import java.util.Iterator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> data=new TreeMap<>();
        data.put(101,"Trupti");
        data.put(125,"Mrunali");

        data.put(925,"Mrunali");
        data.put(125,"Shital");
        data.put(785,"Pranay");
        data.put(795,"Teju");
        data.put(325,"Neha");
        System.out.println(data);
        for(int count=1;count<=data.size();count++)
        {
            System.out.println("Student Roll Number and Name:-"+count);
        }


    }
}