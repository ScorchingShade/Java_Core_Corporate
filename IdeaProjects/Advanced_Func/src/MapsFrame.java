import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsFrame {

    //Maps

    void Maps() {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();


        hm.put(1, "Gopal");
        hm.put(2, "Lakshman");
        hm.put(3, "Dabbu");
        hm.put(4, "Guddi");
        hm.put(5, "Pappi Bhai");
        hm.put(6, "Vasooli bhai");
        hm.put(7, "Madhav");

         /*   Set<Integer> key = hm.keySet();
            Iterator<Integer> i= key.iterator();

            while (i.hasNext()){
                int x=i.next();
                System.out.println(x+"\t"+hm.get(x));
         */

        Set<Map.Entry<Integer, String>> set = hm.entrySet();
        Iterator<Map.Entry<Integer, String>> i = set.iterator();
        while (i.hasNext()) {

            Map.Entry<Integer, String> me = i.next();
            System.out.println(me.getKey() + "\t" + me.getValue());
        }
    }


    public static void main(String[] args) {

        MapsFrame mf = new MapsFrame();

        mf.Maps();

    }

}
