package nivel2.ejercicio2.restaurants2;


import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

    public Restaurant (String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Restaurant)) {
            return false;
        }
        Restaurant restaurant = (Restaurant) obj;
        return Objects.equals(name, restaurant.name) && score == restaurant.score;
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameCoparision = this.name.compareTo(other.name);
        if (nameCoparision != 0) {
            return nameCoparision;
        }
        return Integer.compare(other.score, this.score);
    }
}
