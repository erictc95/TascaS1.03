package nivel1.ejercicio2.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NumberListMain {
    public static void main(String[] args) {

        NumberList list1 = new NumberList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> it = list1.getList().listIterator(list1.getList().size());

        while (it.hasPrevious()) {
            list2.add(it.previous());
        }

        System.out.println("Lista original: " + list1);
        System.out.println("Lista invertida: " + list2);
    }
}
