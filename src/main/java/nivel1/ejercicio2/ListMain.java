package nivel1.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ListIterator<Integer> it1 = list1.listIterator();
        ArrayList<Integer> list2 = new ArrayList<>();
        ListIterator<Integer> it2 = list2.listIterator();

        it1.add(1);
        it1.add(2);
        it1.add(3);
        it1.add(4);

        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            System.out.println(num);
        }





    }
}
