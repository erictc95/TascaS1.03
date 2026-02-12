package nivel2.ejercicio1.restaurants1;

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
    }
}
