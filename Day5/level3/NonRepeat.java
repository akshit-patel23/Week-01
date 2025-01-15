
import java.util.Scanner;

public class NonRepeat {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        // Array to store the frequency of characters (for ASCII values)
        int[] frequency = new int[256];

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        // If no non-repeating character is found, return a placeholder
        return '\0'; // Null character indicating no non-repeating character
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to find the first non-repeating character:");
        String input = scanner.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeating(input);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        scanner.close();
    }
}

