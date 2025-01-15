import java.util.Scanner;

public class UniqueCharsFinder {

    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);  // Try accessing each character until an exception occurs
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception when index exceeds length
        }
        return length;
    }

    // Method to find unique characters in the string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);  // Get the length of the text without using length() method
        char[] uniqueChars = new char[length];  // Array to store unique characters
        int uniqueCount = 0;  // To count unique characters

        // Outer loop to go through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the current character is already found
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the result array
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create a final array of the unique characters with the correct size
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.println("Unique Characters:");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display the result
        displayUniqueCharacters(uniqueChars);
    }
}
