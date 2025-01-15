import java.util.Random;

public class StudentGradeCalculator {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];  // 2D array for PCM scores

        for (int i = 0; i < n; i++) {
            scores[i][0] = 50 + random.nextInt(50); // Physics score (50 to 99)
            scores[i][1] = 50 + random.nextInt(50); // Chemistry score (50 to 99)
            scores[i][2] = 50 + random.nextInt(50); // Math score (50 to 99)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateScores(int[][] scores) {
        double[][] results = new double[scores.length][4];  // 2D array for total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round percentage to 2 decimals
        }

        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrade(double[][] results) {
        String[][] grades = new String[results.length][2]; // 2D array for grade

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B+";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C+";
            } else if (percentage >= 40) {
                grade = "C";
            } else {
                grade = "F";
            }

            grades[i][0] = String.valueOf(percentage);
            grades[i][1] = grade;
        }

        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t", i + 1); // Student number
            System.out.printf("%d\t\t%d\t\t%d\t\t", scores[i][0], scores[i][1], scores[i][2]); // Scores in PCM
            System.out.printf("%.0f\t%.2f\t%.2f\t\t%s\n", results[i][0], results[i][1], results[i][2], grades[i][1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5; // Number of students

        // Generate random scores for students
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateScores(scores);

        // Calculate grades based on percentage
        String[][] grades = calculateGrade(results);

        // Display the scorecard
        displayScorecard(scores, results, grades);
    }
}
