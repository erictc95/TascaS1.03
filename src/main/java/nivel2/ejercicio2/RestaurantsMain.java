package nivel2.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RestaurantsMain {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("La Pampara", 5));
        restaurants.add(new Restaurant("La Pampara", 7));
        restaurants.add(new Restaurant("La Pampara", 5));
        restaurants.add(new Restaurant("La Bodegueta", 9));
        restaurants.add(new Restaurant("Volcanic", 8));

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }

        ArrayList<Restaurant> restaurantsList = new ArrayList<>();
        restaurantsList.add(new Restaurant("La Pampara", 5));
        restaurantsList.add(new Restaurant("La Pampara", 7));
        restaurantsList.add(new Restaurant("Volcanic", 8));
        restaurantsList.add(new Restaurant("La Bodegueta", 9));
        restaurantsList.add(new Restaurant("Volcanic", 8));

        Collections.sort(restaurantsList);

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}
