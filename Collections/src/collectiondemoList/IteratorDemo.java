package collectiondemoList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(45);
        ar.add(89);
        ar.add(33);
        ar.add(20);
        ar.add(91);

        Iterator<Integer> it = ar.iterator();

        while (it.hasNext()){

            Integer data = (Integer) it.next();
            System.out.println(data);
            if(data == 33){
                it.remove();
            }
        }
        System.out.println(ar);
    }
}