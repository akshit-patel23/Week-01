import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate the exception
    public static void generateException(String input) {
        System.out.println("Attempting to parse input: " + input);
        int number = Integer.parseInt(input); // This will throw NumberFormatException if input is not a valid number
        System.out.println("Parsed number: " + number);
    }

    // Method to handle the exception using try-catch
    public static void handleException(String input) {
        try {
            System.out.println("Attempting to parse input: " + input);
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to parse as an integer: ");
        String userInput = scanner.nextLine();

        // Call the methods to generate and handle the exception
        generateException(userInput); // Demonstrates abrupt exception
        handleException(userInput);  // Demonstrates handling of the exception
    }
}
