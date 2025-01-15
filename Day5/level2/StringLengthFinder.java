import java.util.Scanner;

public class StringLengthFinder {

    // Method to find the length of a string without using length()
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access character at index 'count'
                count++; // Increment the count if no exception
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index goes out of bounds
        }
        return count; // Return the final count
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Calculate length using both methods
        int manualLength = findStringLength(input);
        int builtInLength = input.length(); // Using built-in method for comparison

        // Display the results
        System.out.println("String: " + input);
        System.out.println("Length using custom method: " + manualLength);
        System.out.println("Length using built-in method: " + builtInLength);
    }
}
