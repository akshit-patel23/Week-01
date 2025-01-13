import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Arrays to store weight, height, BMI, and weight status for each person
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Input: Weight and height for each person with validation
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            do {
                System.out.print("Enter weight (in kg): ");
                weight[i] = input.nextDouble();
                if (weight[i] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (weight[i] <= 0);

            do {
                System.out.print("Enter height (in meters): ");
                height[i] = input.nextDouble();
                if (height[i] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (height[i] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]); // BMI formula

            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Output: Display BMI information for each person
        System.out.println("\n--- BMI Information ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + String.format("%.2f", bmi[i])); // Format BMI
            System.out.println("Weight Status: " + weightStatus[i]);
        }
    }
}
