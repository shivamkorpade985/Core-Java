package collectiondemoList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(44);
        hs.add(55);
        hs.add(78);
        hs.add(89);
        hs.add(44); //not inserted because duplicates are not allowed
        System.out.println(hs);

        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(45);
        lh.add(57);
        lh.add(89);
        lh.add(20);
        lh.add(57);
        System.out.println(lh);


    }
}
