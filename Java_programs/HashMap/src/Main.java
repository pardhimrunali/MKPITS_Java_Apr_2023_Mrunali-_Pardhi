import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap student=new HashMap();
        student.put(101,"Mru");
        student.put(102,"teju");
        student.put(103,"pranay");
        student.put(104,"shyam");
        System.out.println(student);

        //replace(K key, V value)
        //Replaces the entry for the specified key only if it is currently mapped to some value.
        student.replace(101,"sadhna");
        System.out.println(student);
        
        Iterator number=student.entrySet().iterator();
        while(number.hasNext()){
           System.out.println(number.next());
       }

        HashMap<Integer,String> data=new HashMap<Integer,String>();
        data.put(256,"ram");
        data.put(257,"shiwani");
        data.put(258,"shital");
        HashMap<Integer,String> data_new=new HashMap<Integer,String>();
        data_new.putAll(data);
        System.out.println(data_new);



       // get(Object key)
        // Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
        System.out.println("Value of 258 key is  :-"+" "+data_new.get(258));



    }
}