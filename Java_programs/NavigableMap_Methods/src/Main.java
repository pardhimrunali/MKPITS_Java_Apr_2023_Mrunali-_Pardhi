import java.util.*;

public class Main {
    public static void main(String[] args) {

        NavigableMap<Integer,String> data=new TreeMap<Integer,String>();
        data.put(101,"Murnali");
        data.put(102,"Trupti");
        data.put(103,"Khusboo");
        data.put(104,"Dhruv");

        System.out.println(data);

        //ceilingEntry(K key)
        //Returns a key-value mapping associated with the least key greater than or equal to the given key, or null if there is no such key.
        System.out.println(data.ceilingEntry(101));

    }
}