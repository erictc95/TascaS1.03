package nivel1.ejercicio1.months;

import java.util.*;

public class MonthApplication {

    public void run() {
        List<Month> months = createMonths();

        printWithFor(months);

        Set<Month> monthsSet = new HashSet<>(months);

        printWithIterator(monthsSet);
    }

    private List<Month> createMonths() {

        List<Month> months = new ArrayList<>();


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

        months.add(7, new Month("August"));

        return months;
    }

    private Set<Month> convertToSet(List<Month> months) {
        Set<Month> set = new HashSet<>(months);

        set.add(new Month("January"));

        return set;
    }

    private void printWithFor(List<Month> months) {
        System.out.println("-------------- FOR LOOP -----------------");
        for (Month month : months) {
            System.out.println(month);
        }
    }

    private void printWithIterator(Set<Month> monthsSet) {
        System.out.println("-------------- ITERATOR -----------------");
        Iterator<Month> it = monthsSet.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
