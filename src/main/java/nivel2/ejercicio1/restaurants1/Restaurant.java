package nivel2.ejercicio1.restaurants1;


import java.util.Objects;

public class Restaurant {
    private final String name;
    private final int score;

    public Restaurant (String name, int score) {
        this.name = name;
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
    public boolean equals(Object o) {
        if (!(o instanceof Restaurant that)) return false;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
