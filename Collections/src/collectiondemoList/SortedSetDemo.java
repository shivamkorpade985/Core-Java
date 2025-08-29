package collectiondemoList;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> ss = new TreeSet<>();

        ss.add("Abhishek");
        ss.add("Prasad");
        ss.add("Samyak");
        ss.add("Bro");
        ss.add("Vai");
        ss.add("Zebra");

        System.out.println(ss);

        SortedSet<Integer> i = new TreeSet<>();
        i.add(45);
        i.add(78);
        i.add(5);
        i.add(3);
        i.add(89);

        System.out.println(i);

    }
}
