//Mohammad Sargazi
//CSC320
import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Initialize ArrayLists to store days and temperatures
            ArrayList<String> days = new ArrayList<>();
            ArrayList<Double> temperatures = new ArrayList<>();

            // Array of days of the week
            String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

            // Loop to prompt user for day and temperature input
            for (String day : weekDays) {
                System.out.println("Enter the average temperature for " + day + ": ");
                double temp = scanner.nextDouble();
                days.add(day);
                temperatures.add(temp);
            }

            boolean validCommand = false;
            while (!validCommand) {
                // Prompt user for command
                System.out.println("Enter 'day' to display day-wise temperatures or 'week' to display the entire week and the average temperature: ");
                String command = scanner.next();

                // Decision making based on user input
                if (command.equalsIgnoreCase("day")) {
                    // Display temperatures for each day
                    for (int i = 0; i < days.size(); i++) {
                        System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
                    }
                    validCommand = true;
                } else if (command.equalsIgnoreCase("week")) {
                    // Display temperatures for each day
                    double total = 0;
                    for (int i = 0; i < days.size(); i++) {
                        System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
                        total += temperatures.get(i);
                    }
                    // Calculate and display weekly average temperature
                    double average = total / temperatures.size();
                    System.out.printf("Weekly Average Temperature: %.1f°C\n", average);
                    validCommand = true;
                } else {
                    System.out.println("Invalid command. Please enter 'day' or 'week'.");
                }
            }

            // Prompt user to re-run the program or exit
            System.out.println("Do you want to run the program again? (yes/no)");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                continueProgram = false;
            }
        }

        // Close scanner
        scanner.close();
    }
}
