package nivel1.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MonthsMain {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();
        HashSet<Month> monthsSet = new HashSet<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        for (int i = 0; i < months.size(); i++ ) {
            System.out.println(months.get(i));
        }

        for (int i = 0; i < months.size(); i++ ) {
            monthsSet.add(months.get(i));
            monthsSet.add(new Month("January"));
        }

        Iterator<Month> it = monthsSet.iterator();
        while (it.hasNext()) {
            Month month = it.next();
            System.out.println(month);
        }

    }

}
