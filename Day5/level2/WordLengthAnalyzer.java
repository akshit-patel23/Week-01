import java.util.Scanner;

public class WordLengthAnalyzer {

    // Method to find the length of a string without using the length() method
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

        // Count spaces to determine the number of words
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
                word.append(text.charAt(i));
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

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortestWord = wordLengths[0][0];
        String longestWord = wordLengths[0][0];
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        for (String[] wordData : wordLengths) {
            int length = Integer.parseInt(wordData[1]);
            if (length < shortestLength) {
                shortestWord = wordData[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longestWord = wordData[0];
                longestLength = length;
            }
        }

        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split text into words
        String[] words = splitTextManual(input);

        // Generate a 2D array with words and their lengths
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordLengthArray);

        // Display the results
        System.out.println("Shortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);
    }
}
