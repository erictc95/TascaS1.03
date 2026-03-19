package nivel1.ejercicio3.capitalgame;

import java.io.*;
import java.util.*;

public class CapitalGameApplication {

        private static final int TOTAL_ROUNDS = 20;
        private static final String FILE_COUNTRIES = "countries.txt";
        private static final String FILE_CLASSIFICATION = "Classification.txt";

        public void run() {
            Map<String, String> countries = loadCountries();

            if (countries.isEmpty()) return;

            Scanner input = new Scanner(System.in);

            String player1 = askPlayerName(input, "Player 1");
            String player2 = askPlayerName(input, "Player 2");

            int[] scores = playGame(countries, input, player1, player2);

            showResults(player1, player2, scores);

            saveResults(player1, player2, scores);

            input.close();
        }

        private Map<String, String> loadCountries() {
            Map<String, String> map = new HashMap<>();

            File file = new File(FILE_COUNTRIES);
            if (!file.exists()) {
                System.out.println("File not found!");
                return map;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = br.readLine()) != null) {
                    String[] parts = line.trim().split(",");
                    if (parts.length == 2) {
                        map.put(parts[0].trim(), parts[1].trim());
                    }
                }

                System.out.println("Loaded " + map.size() + " countries");

            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }

            return map;
        }

        private String askPlayerName(Scanner input, String playerLabel) {
            System.out.print(playerLabel + " name: ");
            return input.nextLine();
        }

        private int[] playGame(Map<String, String> countries, Scanner input, String p1, String p2) {
            int score1 = 0;
            int score2 = 0;

            List<String> countriesList = new ArrayList<>(countries.keySet());
            Collections.shuffle(countriesList);

            for (int i = 0; i < TOTAL_ROUNDS; i++) {
                String country = countriesList.get(i);
                String correctCapital = countries.get(country);

                if (i % 2 == 0) {
                    score1 += askQuestion(input, p1, country, correctCapital);
                } else {
                    score2 += askQuestion(input, p2, country, correctCapital);
                }
            }

            return new int[]{score1, score2};
        }

        private int askQuestion(Scanner input, String player, String country, String correctCapital) {
            System.out.println(player + ", capital of " + country + ": ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct! +1 point");
                return 1;
            } else {
                System.out.println("Incorrect. The correct capital is: " + correctCapital);
                return 0;
            }
        }

        private void showResults(String p1, String p2, int[] scores) {
            System.out.println(p1 + " Score: " + scores[0]);
            System.out.println(p2 + " Score: " + scores[1]);
        }

        private void saveResults(String p1, String p2, int[] scores) {
            try (FileWriter fw = new FileWriter(FILE_CLASSIFICATION, true)) {
                fw.write(p1 + " - Score: " + scores[0] + "\n");
                fw.write(p2 + " - Score: " + scores[1] + "\n");
            } catch (IOException e) {
                System.err.println("Error writing file: " + e.getMessage());
            }
        }
}

