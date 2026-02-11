package nivel1.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CapitalGameMain {
    private static int totalPointsP1 = 0;
    private static int totalPointsP2 = 0;

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner sc = new Scanner(new File("countries.txt"));
        } catch (Exception e) {
            System.out.println("File cannot found!");
        }

        File file = new File ("countries.txt");
        Scanner sc = new Scanner(file);

        HashMap<String, String> countriesMap = new HashMap<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            countriesMap.put(parts[0], parts[1]);
        }
        sc.nextLine();




    }
}
