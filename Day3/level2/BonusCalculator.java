import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Please enter a valid positive salary.");
                i--;
                continue;
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextInt();
            if (yearsOfService[i] < 0) {
                System.out.println("Please enter a valid number of years of service.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {
            // Calculate bonus: 5% for >5 years, otherwise 2%
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i]; // New salary = old salary + bonus
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary of all employees: " + totalOldSalary);
        System.out.println("Total New Salary of all employees (after bonus): " + totalNewSalary);

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + " - Salary: " + salary[i] +
                    ", Years of Service: " + yearsOfService[i] +
                    ", Bonus: " + bonus[i] +
                    ", New Salary: " + newSalary[i]);
        }
    }
}
