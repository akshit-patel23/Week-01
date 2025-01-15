import java.util.Scanner;

public class BMIProgram {

    // Method to compute BMI and status
    public static String[][] computeBMI(double[][] data) {
        String[][] bmiResults = new String[10][4]; // [Weight, Height, BMI, Status]

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters);

            bmiResults[i][0] = String.format("%.2f", weight); // Weight
            bmiResults[i][1] = String.format("%.2f", data[i][1]); // Height
            bmiResults[i][2] = String.format("%.2f", bmi); // BMI

            // Determine BMI status
            if (bmi < 18.5) {
                bmiResults[i][3] = "Underweight";
            } else if (bmi < 24.9) {
                bmiResults[i][3] = "Normal weight";
            } else if (bmi < 29.9) {
                bmiResults[i][3] = "Overweight";
            } else {
                bmiResults[i][3] = "Obesity";
            }
        }
        return bmiResults;
    }

    // Method to calculate BMI and store results in a 2D array
    public static String[][] calculateBMI(double[][] data) {
        return computeBMI(data);
    }

    // Method to display results
    public static void displayBMIReport(String[][] bmiData) {
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n", 
                              i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2]; // [Weight, Height]

        // Input: weight and height of 10 persons
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight (kg): ", i + 1);
            personData[i][0] = scanner.nextDouble();
            System.out.printf("Person %d - Height (cm): ", i + 1);
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiResults = calculateBMI(personData);

        // Display BMI Report
        System.out.println("\nBMI Report:");
        displayBMIReport(bmiResults);

        scanner.close();
    }
}

