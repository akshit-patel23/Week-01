import java.util.Scanner;

public class IsPalindrome {

    // Logic 1: Iterative method to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        // Loop to compare characters from the start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // If characters don't match, not a palindrome
            }
            start++;
            end--;
        }
        return true;  // If all characters match, it's a palindrome
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base condition: If start index is greater than or equal to end index, it's a palindrome
        if (start >= end) {
            return true;
        }
        
        // If characters at start and end are not equal, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        
        // Recursive call with next indices
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Method to check palindrome using character arrays
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();  // Convert string to character array
        char[] reverseArray = new char[originalArray.length];  // Create an array for reversed string
        
        // Reverse the string
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - i - 1];
        }
        
        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;  // If characters don't match, not a palindrome
            }
        }
        return true;  // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        
        // Remove spaces and convert to lower case for case-insensitive comparison
        inputText = inputText.replaceAll("\\s", "").toLowerCase();

        // Check palindrome using different methods
        boolean resultIterative = isPalindromeIterative(inputText);
        boolean resultRecursive = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean resultArray = isPalindromeUsingArray(inputText);

        // Displaying the result
        System.out.println("Palindrome check using iterative method: " + resultIterative);
        System.out.println("Palindrome check using recursive method: " + resultRecursive);
        System.out.println("Palindrome check using character arrays: " + resultArray);

        scanner.close();
    }
}