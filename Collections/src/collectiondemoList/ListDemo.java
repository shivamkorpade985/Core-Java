package collectiondemoList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(40);
        arr.add(40);
        arr.add(40);
        arr.add(40);


        System.out.println(arr);
        arr.removeFirst();
        arr.removeLast();

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(20);
        al2.add(15);


        arr.addAll(al2);
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
