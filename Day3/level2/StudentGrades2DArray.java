import java.util.Scanner;

public class StudentGrades2DArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {
            System.out.println("Invalid number of students. Exiting program.");
            return;
        }

        int[][] marks = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            marks[i][0] = getValidMarks(scanner, "Physics");
            marks[i][1] = getValidMarks(scanner, "Chemistry");
            marks[i][2] = getValidMarks(scanner, "Maths");

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f%%\t\t%c\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }

    private static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        do {
            System.out.print(subject + ": ");
            marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Please enter marks between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }
}
