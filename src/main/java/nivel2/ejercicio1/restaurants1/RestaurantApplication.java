package nivel2.ejercicio1.restaurants1;

import java.util.HashSet;
import java.util.Set;

public class RestaurantApplication {
    public void run() {
        Set<Restaurant> restaurants = createRestaurants();
        printRestaurant(restaurants);
    }

    private Set<Restaurant> createRestaurants() {
        Set<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("La Pampara", 5));
        restaurants.add(new Restaurant("La Pampara", 7));
        restaurants.add(new Restaurant("La Pampara", 5));
        restaurants.add(new Restaurant("La Bodegueta", 9));
        restaurants.add(new Restaurant("Volcanic", 8));

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
        return restaurants;
    }

    private void printRestaurant(Set<Restaurant> restaurants) {
        System.out.println(restaurants);
    }
}
