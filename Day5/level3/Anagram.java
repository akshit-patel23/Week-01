import java.util.Scanner;

public class Anagram {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If lengths are not equal, they can't be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays to store character counts
        int[] freq1 = new int[256];  // For text1
        int[] freq2 = new int[256];  // For text2

        // Loop through both strings to calculate the frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Compare the frequencies of characters in both strings
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;  // If frequencies don't match, not an anagram
            }
        }

        return true;  // If all frequencies match, the texts are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the two strings
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();

        // Calling the method to check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Displaying the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}