package nivel2.ejercicio2.restaurants2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RestaurantApplication {

    public void run() {
        List<Restaurant> restaurants = createRestaurants();
        sortRestaurants(restaurants);
        printRestaurants(restaurants);
    }

    private List<Restaurant> createRestaurants() {
        List<Restaurant> list = new ArrayList<>();

        list.add(new Restaurant("La Pampara", 5));
        list.add(new Restaurant("La Pampara", 7));
        list.add(new Restaurant("Volcanic", 8));
        list.add(new Restaurant("La Bodegueta", 9));

        return list;
    }

    private void sortRestaurants(List<Restaurant> restaurants) {
        Collections.sort(restaurants);
    }

    private void printRestaurants(List<Restaurant> restaurants) {
        System.out.println(restaurants);
    }
}
