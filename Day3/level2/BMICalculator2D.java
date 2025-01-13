import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // 2D array: stores weight, height, and BMI for each person
        double[][] personData = new double[numPersons][3]; 
        String[] weightStatus = new String[numPersons]; // Stores weight status of each person

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight
            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a valid positive weight.");
                }
            } while (weight <= 0);

            // Input height
            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a valid positive height.");
                }
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < numPersons; i++) {
            // Calculate BMI
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;

            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display BMI information for each person
        System.out.println("\n--- BMI Information ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2])); // Round to 2 decimal places
            System.out.println("Weight Status: " + weightStatus[i]);
        }
    }
}
