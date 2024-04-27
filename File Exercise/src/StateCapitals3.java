import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Capital {
    private String name;
    private int population;
    private int squareMileage;

    public Capital(String name, int population, int squareMileage) {
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getSquareMileage() {
        return squareMileage;
    }

    @Override
    public String toString() {
        return "Pop: " + population + " | Area: " + squareMileage + " sq mi";
    }
}



public class StateCapitals3 {
    public static void main(String[] args) {
        Map<String, Capital> stateCapitals = new HashMap<>();
        int capitalCount = loadData(stateCapitals, "States2.txt");
        System.out.println(capitalCount + " STATE/CAPITAL PAIRS LOADED.");
        System.out.println("==============================");

        // Print all state capitals
        for (Map.Entry<String, Capital> entry : stateCapitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Prompt user for population limit
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the lower limit for capital city population:");
        int popLimit = scanner.nextInt();
        System.out.println("\nLISTING CAPITALS WITH POPULATIONS GREATER THAN " + popLimit + ":");
        for (Map.Entry<String, Capital> entry : stateCapitals.entrySet()) {
            if (entry.getValue().getPopulation() > popLimit) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        // Prompt user for area limit
        System.out.println("\nPlease enter the upper limit for capital city sq mileage:");
        int areaLimit = scanner.nextInt();
        System.out.println("\nLISTING CAPITALS WITH AREAS LESS THAN " + areaLimit + ":");
        for (Map.Entry<String, Capital> entry : stateCapitals.entrySet()) {
            if (entry.getValue().getSquareMileage() < areaLimit) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    private static int loadData(Map<String, Capital> stateCapitals, String filename) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String state = parts[0].trim();
                    String capitalName = parts[1].trim();
                    int population = Integer.parseInt(parts[2].trim());
                    int area = Integer.parseInt(parts[3].trim());
                    Capital capital = new Capital(capitalName, population, area);
                    stateCapitals.put(state, capital);
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
