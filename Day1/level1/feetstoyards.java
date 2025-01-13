
// A program the find the distance in yards and miles for the distance provided by user in feets
import java.util.Scanner;

class feetstoyards{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the distance in feet: ");
        double feet = scanner.nextDouble();

        // Conversion factors
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        // Convert feet to yards and miles
        double yards = feet / feetPerYard;
        double miles = yards / yardsPerMile;

        
        System.out.printf("The distance in yards is: %.2f yards%n", yards);
        System.out.printf("The distance in miles is: %.4f miles%n", miles);

        
        scanner.close();
    }
}
