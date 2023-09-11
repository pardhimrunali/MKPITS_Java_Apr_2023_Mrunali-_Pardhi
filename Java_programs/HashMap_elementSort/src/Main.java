import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> data=new HashMap<Integer,String>();
        data.put(10,"arun");
        //data.put(20,"mam");
        data.put(8,"shym");
        data.put(55,"dadu");
        data.put(45,"rfg");
        data.put(56,"klrahul");
        data.put(455,"dravid");
        System.out.println(data);

         Set print =data.entrySet();
        System.out.println(print);


        TreeMap<Integer,String> PrintData=new TreeMap<>(data);
        System.out.println(PrintData);




            
        }


}