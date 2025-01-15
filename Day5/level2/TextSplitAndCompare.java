import java.util.Scanner;

public class TextSplitAndCompare {

    // Method to find the length of a string without using length()
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing, loop ends here
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextManual(String text) {
        int length = findStringLength(text);
        int wordCount = 1; // At least one word if text is non-empty

        // Count the number of spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder word = new StringBuilder();

        // Extract words from the text
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i)); // Append character to the current word
            } else {
                words[wordIndex++] = word.toString();
                word.setLength(0); // Reset the word
            }
        }
        // Add the last word
        words[wordIndex] = word.toString();
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split text using manual method
        String[] manualSplit = splitTextManual(input);

        // Split text using built-in split() method
        String[] builtInSplit = input.split(" ");

        // Compare the two arrays
        boolean areEqual = compareStringArrays(manualSplit, builtInSplit);

        // Display results
        System.out.println("Original Text: " + input);
        System.out.println("Manual Split: ");
        for (String word : manualSplit) {
            System.out.println(word);
        }
        System.out.println("Built-in Split: ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        System.out.println("Are both methods producing the same result? " + areEqual);
    }
}
