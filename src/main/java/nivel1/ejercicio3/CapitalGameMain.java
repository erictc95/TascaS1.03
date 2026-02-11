package nivel1.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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

        //Scanner input = new Scanner(System.in);
        System.out.println("Player 1 name: ");
        String player1 = sc.nextLine();
        System.out.println("Player 2 name: ");
        String player2 = sc.nextLine();

        ArrayList<String> countriesList = new ArrayList<>(countriesMap.keySet());
        Collections.shuffle(countriesList);

        for (int i = 0; i < 20; i++) {
            String country = countriesList.get(i);
            if (i % 2 == 0) {
                System.out.println(player1 + ", capital de " + country + ": ");
                String answer = sc.nextLine();
            }
        }


    }
}
