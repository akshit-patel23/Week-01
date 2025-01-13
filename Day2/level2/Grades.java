import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        // Calculating total and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        // Determining grade and remarks
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards)t";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
int averageMarks=totalMarks/3;

        //result
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

         }
}










