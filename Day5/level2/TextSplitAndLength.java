import java.util.Scanner;

public class TextSplitAndLength {

    // Method to find the length of a string without using the built-in length() method
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exit loop when index goes out of bounds
        }
        return count;
    }

    // Method to split text into words without using split() method
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

    // Method to create a 2D array with words and their lengths
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Store the word
            wordLengths[i][1] = String.valueOf(findStringLength(words[i])); // Store the length as String
        }

        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split text into words using the manual method
        String[] words = splitTextManual(input);

        // Generate a 2D array with words and their lengths
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Display the result in tabular format
        System.out.println("Word\t\tLength");
        System.out.println("---------------------");
        for (String[] wordData : wordLengthArray) {
            String word = wordData[0];
            int length = Integer.parseInt(wordData[1]); // Convert length from String to Integer
            System.out.println(word + "\t\t" + length);
        }
    }
}
