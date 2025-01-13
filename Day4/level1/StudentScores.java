import java.util.Random;

public class StudentScores {

    public static void main(String[] args) {
        int numStudents = 5; // Example: Number of students

        // Generate random scores for all students
        int[][] studentScores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] calculatedScores = calculateScores(studentScores);

        // Display the scorecard
        displayScorecard(studentScores, calculatedScores);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array to store scores

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100); // Generate random scores between 0 and 99
            }
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateScores(int[][] studentScores) {
        int numStudents = studentScores.length;
        double[][] calculatedScores = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += studentScores[i][j];
            }

            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;

            calculatedScores[i][0] = total;
            calculatedScores[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            calculatedScores[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return calculatedScores;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] studentScores, double[][] calculatedScores) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(studentScores[i][j] + "\t\t");
            }

            System.out.print(String.format("%.2f", calculatedScores[i][0]) + "\t");
            System.out.print(String.format("%.2f", calculatedScores[i][1]) + "\t\t");
            System.out.print(String.format("%.2f", calculatedScores[i][2]) + "\t\t");
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------");
    }
}