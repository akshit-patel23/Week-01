
import java.util.Random;

public class EmployeeBonus {

    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] employeeData = new double[10][2]; // 2D Array to store salary and years of service
        
        for (int i = 0; i < 10; i++) {
            double salary = 50000 + (random.nextInt(50000) + 1); // Generate a random 5-digit salary
            int yearsOfService = random.nextInt(15); // Generate years of service between 0 and 14 years
            employeeData[i][0] = salary; // Salary
            employeeData[i][1] = yearsOfService; // Years of service
        }
        return employeeData;
    }

    // Method to calculate the new salary and bonus based on the service years
    public static double[][] calculateBonusAndSalary(double[][] employeeData) {
        double[][] updatedEmployeeData = new double[10][3]; // 2D Array for new salary and bonus
        
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;
            double newSalary = oldSalary;
            
            // Determine bonus based on years of service
            if (yearsOfService >= 5) {
                bonus = oldSalary * 0.05; // 5% bonus for employees with 5+ years of service
            } else {
                bonus = oldSalary * 0.02; // 2% bonus for employees with less than 5 years of service
            }
            
            newSalary += bonus; // Add bonus to the old salary
            
            updatedEmployeeData[i][0] = newSalary; // New salary after bonus
            updatedEmployeeData[i][1] = bonus;     // Bonus amount
            updatedEmployeeData[i][2] = oldSalary; // Old salary
        }
        return updatedEmployeeData;
    }

    // Method to calculate and display the sum of the old salary, new salary, and total bonus
    public static void calculateTotalSalariesAndBonus(double[][] updatedEmployeeData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        System.out.println("Employee Data (Old Salary, New Salary, Bonus):");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "New Salary", "Bonus");

        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedEmployeeData[i][2];
            double newSalary = updatedEmployeeData[i][0];
            double bonus = updatedEmployeeData[i][1];
            
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f\n", i + 1, oldSalary, newSalary, bonus);
        }
        
        // Display the total amounts
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    public static void main(String[] args) {
        // Generate random employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData();
        
        // Calculate new salary and bonus for each employee
        double[][] updatedEmployeeData = calculateBonusAndSalary(employeeData);
        
        // Calculate and display total salaries and bonus amounts
        calculateTotalSalariesAndBonus(updatedEmployeeData);
    }
}



