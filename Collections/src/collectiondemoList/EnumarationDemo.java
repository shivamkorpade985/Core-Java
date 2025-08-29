package collectiondemoList;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(45);
        vector.add(78);
        vector.add(56);

        Enumeration env= vector.elements();

        while (env.hasMoreElements())
        {
            Integer data = (Integer) env.nextElement();
            System.out.println(data);
        }
    }
}
