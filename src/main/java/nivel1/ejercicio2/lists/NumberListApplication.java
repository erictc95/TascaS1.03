package nivel1.ejercicio2.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NumberListApplication {
    public void run() {
        NumberList list1 = createList();
        List<Integer> list2 = reversedList(list1);

        printResult(list1, list2);
    }

    private NumberList createList() {
        NumberList list = new NumberList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        return list;
    }

    private List<Integer> reversedList(NumberList original) {
        List<Integer> reversed = new ArrayList<>();

        ListIterator<Integer> it = original.getList().listIterator(original.getList().size());

        while (it.hasPrevious()) {
            reversed.add(it.previous());
        }

        return reversed;
    }

    private void printResult(NumberList original, List<Integer> reversed) {
        System.out.println("Original List: " + original);
        System.out.println("Reversed List: " + reversed);
    }
}
