package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example1 {

    public static void main(String[] args) {

        TreeMap tm = new TreeMap();
        tm.put("d", 4);
        tm.put("a", 1);
        tm.put("b", 2);
        tm.put("c", 3);

        Set set = tm.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
