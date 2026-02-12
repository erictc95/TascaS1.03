package nivel1.ejercicio3.capitalgame;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CapitalGameMain {
    private static int totalPointsP1;
    private static int totalPointsP2;

    public static void main(String[] args) throws IOException {
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
            String[] parts = line.split(" ");
            countriesMap.put(parts[0], parts[1]);
        }
        sc.close();

        Scanner input = new Scanner(System.in);
        System.out.print("Player 1 name: ");
        String player1 = input.nextLine();
        System.out.print("Player 2 name: ");
        String player2 = input.nextLine();

        ArrayList<String> countriesList = new ArrayList<>(countriesMap.keySet());
        Collections.shuffle(countriesList);

        for (int i = 0; i < 20; i++) {
            String country = countriesList.get(i);
            String correctCapital = countriesMap.get(country);
            if (i % 2 == 0) {
                System.out.println(player1 + ", capital de " + country + ": ");
                String answer1 = input.nextLine();
                if (answer1.equalsIgnoreCase(countriesMap.get(country))) {
                    totalPointsP1++;
                    System.out.println("Correct! +1 point = " + totalPointsP1);
                } else {
                    System.out.println("Incorrect. Be better next time! The correct Capital is: " + correctCapital);
                }
            } else {
                System.out.println(player2 + ", capital de " + country + ": ");
                String answer2 = input.nextLine();
                if (answer2.equalsIgnoreCase(countriesMap.get(country))) {
                    totalPointsP2++;
                    System.out.println("Correct! +1 point = " + totalPointsP2);
                } else {
                    System.out.println("Incorrect. Be better next time! The correct Capital is: " + correctCapital);
                }
            }
        }

        System.out.println(player1 + " Score: " + totalPointsP1);
        System.out.println(player1 + " Score: " + totalPointsP2);

        FileWriter fileWriter = new FileWriter("Classification.txt");
        fileWriter.write(player1 + ", Score = " + totalPointsP1 + "\n");
        fileWriter.write(player2 + ", Score = " + totalPointsP2 + "\n");
        fileWriter.close();
    }
}
