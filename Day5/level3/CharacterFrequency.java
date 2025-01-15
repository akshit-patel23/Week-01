import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store frequency of each character (ASCII size)
        int[] frequency = new int[256];  // Array to store the frequency of each ASCII character

        // Loop through the text to find frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment the frequency of the current character
        }

        // Create a list of unique characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;  // Count how many unique characters are there
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        
        // Loop through the frequency array and store the character and its frequency in the 2D array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Store the character
                result[index][1] = String.valueOf(frequency[i]);  // Store its frequency
                index++;
            }
        }
        
        return result;  // Return the result array
    }

    // Method to display the result in a tabular format
    public static void displayFrequency(String[][] frequencyData) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "         | " + frequencyData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find character frequencies using user-defined method
        String[][] frequencyData = findCharacterFrequency(input);

        // Display the result
        displayFrequency(frequencyData);
    }
}
