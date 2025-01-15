import java.util.Scanner;

public class ExceptionString {

    // Method to generate the Exception
    public static void generateException(String input) {
        System.out.println("Attempting to access an invalid index");
        char invalidChar = input.charAt(input.length()); // This will throw the exception
        System.out.println("Character at invalid index: " + invalidChar);
    }

    // Method to handle the Exception using try-catch
    public static void handleException(String input) {
        try {
            System.out.println("Attempting to access an invalid index with try-catch");
            // Access an index beyond the length of the string
            char invalidChar = input.charAt(input.length());
            System.out.println("Character at invalid index: " + invalidChar);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e);
        }

        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}