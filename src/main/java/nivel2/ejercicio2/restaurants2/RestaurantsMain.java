package nivel2.ejercicio2.restaurants2;

import java.util.ArrayList;
import java.util.Collections;

public class RestaurantsMain {
    public static void main(String[] args) {

        ArrayList<Restaurant> restaurantsList = new ArrayList<>();
        restaurantsList.add(new Restaurant("La Pampara", 5));
        restaurantsList.add(new Restaurant("La Pampara", 7));
        restaurantsList.add(new Restaurant("Volcanic", 8));
        restaurantsList.add(new Restaurant("La Bodegueta", 9));

        Collections.sort(restaurantsList);

        for (Restaurant r : restaurantsList) {
            System.out.println(r);
        }
    }
}
