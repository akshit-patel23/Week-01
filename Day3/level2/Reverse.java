// Import Scanner to read user input
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count the number of digits in the number
        int count = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10; // Remove the last digit
            count++; // Increment count
        }import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;
        int tempNumber = number;

        // Count the number of digits in the number
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        int[] digits = new int[count]; // Array to store the digits of the number

        // Extract digits and store them in the array
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10; // Get the last digit
            tempNumber /= 10;
        }

        // Reverse and print the digits
        System.out.print("Reversed number: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}


        // Create an array to store the digits of the number
        int[] digits = new int[count];

        // Extract digits from the number and store them in the digits array
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;  // Get the last digit
            tempNumber /= 10;  // Remove the last digit from the number
        }

        // Create an array to store the digits in reverse order
        int[] reversedDigits = new int[count];

        // Reverse the digits and store in reversedDigits array
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed digits
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        
    }
}
