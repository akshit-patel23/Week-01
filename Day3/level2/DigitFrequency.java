import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Take input for a number from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong(); // Read the number entered by the user

        // Convert the number to a string for digit manipulation
        String numberStr = String.valueOf(number); 
        int length = numberStr.length(); // Get the number of digits by finding the string length

        // Initialize the frequency array to store the frequency of digits 0-9
        int[] frequency = new int[10]; // Array to store frequencies of digits from 0 to 9

        // Loop through the digits of the number and store them in the array
        for (int i = 0; i < length; i++) {
            char digitChar = numberStr.charAt(i); // Extract each digit as a character
            int digit = digitChar - '0'; // Convert the character to an integer

            // Increase the frequency of the corresponding digit
            frequency[digit]++; // Increment the frequency for the digit found
        }

        // Display the frequency of each digit found in the number
        System.out.println("\nFrequency of digits in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]); // Print digit and its frequency
            }
        }

    }
}
