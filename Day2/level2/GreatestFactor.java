//Create a program to print the greatest factor of a number beside itself using a loop.
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        

        System.out.print("Enter a number to find its greatest factor (beside itself): ");
        int number = scanner.nextInt();

        int greatestFactor = 1;

        
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Checking if i is a factor
                greatestFactor = i; 
                break; // Exit from loop     
			}
        }

        
        System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);
    }
}









