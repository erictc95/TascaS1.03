package nivel1.ejercicio3.capitalgame;

import java.io.*;
import java.util.*;

public class CapitalGameMain {
    private static final int TOTAL_ROUNDS = 20;
    private static final String FILE_COUNTRIES = "countries.txt";
    private static final String FILE_CLASSIFICATION = "Classification.txt";

    public static void main(String[] args) throws IOException {

        HashMap<String, String> countriesMap = new HashMap<>();

        File file = new File(FILE_COUNTRIES);
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                if (parts.length == 2) {
                    countriesMap.put(parts[0].trim(), parts[1].trim());
                }
            }

            System.out.println("Loaded " + countriesMap.size() + " countries");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Player 1 name: ");
        String player1 = input.nextLine();
        System.out.print("Player 2 name: ");
        String player2 = input.nextLine();

        int totalPointsP1 = 0;
        int totalPointsP2 = 0;

        List<String> countriesList = new ArrayList<>(countriesMap.keySet());
        Collections.shuffle(countriesList);

        for (int i = 0; i < TOTAL_ROUNDS; i++) {

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
        System.out.println(player2 + " Score: " + totalPointsP2);

        try (FileWriter fw = new FileWriter(FILE_CLASSIFICATION, true)) {
            fw.write(player1 + " - Score: " + totalPointsP1 + "\n");
            fw.write(player2 + " - Score: " + totalPointsP2 + "\n");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        input.close();
    }
}
