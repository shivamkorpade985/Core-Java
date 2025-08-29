package collectiondemoList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteatorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(455);
        al.add(456);
        al.add(458);
        al.add(269);

        ListIterator<Integer> li = al.listIterator();

        while (li.hasNext()) {
            Integer data = li.next();
            System.out.println(data);

        }

    }

}
