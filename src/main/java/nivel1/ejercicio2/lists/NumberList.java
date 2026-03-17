package nivel1.ejercicio2.lists;

import java.util.ArrayList;
import java.util.List;

public class NumberList {

    private List<Integer> list = new ArrayList<>();

    public void add(int num) {
        list.add(num);
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
