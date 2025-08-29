package collectiondemoList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();

        m.put(1,"one");
        m.put(2,"two");
        m.put(3,"three");
        m.put(4,"four");

        System.out.println(m); //1st method to print

        //2Nd method to print WE NEED TO PRINT AS PER THE CONDITION..THERE ARE THE LOTS OF METH
        Set<Map.Entry<Integer,String>> entries = m.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key ---> "+entry.getKey()+ " valut ---> "+entry.getValue());
        }

        //3rd method :i want to only retrive value

        for(String val:m.values()){
            System.out.println(val);
        }

        for(Integer key:m.keySet()){
            System.out.println(key);
        }

        String s = m.get(3);
        System.out.println(s);
        }

    }

