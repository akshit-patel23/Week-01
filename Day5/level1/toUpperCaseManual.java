import java.util.Scanner;

public class toUpperCaseManual {

    // Method to convert each character to uppercase using charAt()
    public static String toUpperCaseManual(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // If character is lowercase
                result.append((char) (ch - 32)); // Convert to uppercase
            } else {
                result.append(ch); // Append unchanged if not lowercase
            }
        }

        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to uppercase using String's built-in method
        String builtInUpperCase = input.toUpperCase();

        // Convert to uppercase using the manual method
        String manualUpperCase = toUpperCaseManual(input);

        // Compare the two results
        boolean areEqual = compareStrings(builtInUpperCase, manualUpperCase);

        // Display results
        System.out.println("Original Text: " + input);
        System.out.println("Built-in Uppercase: " + builtInUpperCase);
        System.out.println("Manual Uppercase: " + manualUpperCase);
        System.out.println("Are both methods producing the same result? " + areEqual);
    }
}
