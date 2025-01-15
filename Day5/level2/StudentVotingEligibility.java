import java.util.Scanner;
import java.util.Random;

public class StudentVotingEligibility {

    // Method to generate random ages for 'n' students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        // Generate random ages between 10 and 99
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + random.nextInt(90); // Random age between 10 and 99
        }

        return ages;
    }

    // Method to create a 2D array with age and voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            String voteEligibility = "Cannot Vote"; // Default message

            if (age < 0) {
                voteEligibility = "Invalid Age"; // For negative age
            } else if (age >= 18) {
                voteEligibility = "Can Vote"; // For valid age >= 18
            }

            eligibility[i][0] = String.valueOf(age); // Age as string
            eligibility[i][1] = voteEligibility; // Voting eligibility status
        }

        return eligibility;
    }

    // Method to display the 2D array in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.println("Age\t\tCan Vote?");
        System.out.println("----------------------------");

        for (String[] row : eligibility) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students (10 students in this case)
        int numberOfStudents = 10;

        // Generate random ages for 10 students
        int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility for the students
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the result in a tabular format
        displayEligibility(eligibility);
    }
}
