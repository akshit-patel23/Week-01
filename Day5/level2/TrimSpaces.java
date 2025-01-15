import java.util.Scanner;

public class TrimSpaces {

    // Method to determine the start and end indices for trimming spaces
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = 0;
        int length = 0;

        try {
            // Find the length of the string
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exit loop when index goes out of bounds
        }

        // Find the starting index (first non-space character)
        while (start < length && text.charAt(start) == ' ') {
            start++;
        }

        // Find the ending index (last non-space character)
        end = length - 1;
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        StringBuilder trimmedText = new StringBuilder();

        for (int i = start; i <= end; i++) {
            trimmedText.append(text.charAt(i));
        }

        return trimmedText.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 != length2) {
            return false; // Length mismatch
        }

        for (int i = 0; i < length1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Characters don't match
            }
        }

        return true; // Strings are identical
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Find the indices to trim the spaces
        int[] trimIndices = findTrimIndices(input);

        // Handle case where the string is entirely spaces
        if (trimIndices[0] > trimIndices[1]) {
            System.out.println("The trimmed string is empty.");
            return;
        }

        // Create the trimmed string using the custom method
        String customTrimmed = customSubstring(input, trimIndices[0], trimIndices[1]);

        // Use the built-in trim() method
        String builtInTrimmed = input.trim();

        // Compare the custom trimmed string with the built-in trimmed string
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);

        // Display the results
        System.out.println("Custom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are the two results equal? " + areEqual);
    }
}
