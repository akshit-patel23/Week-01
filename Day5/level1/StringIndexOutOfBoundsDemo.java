import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String input) {
        int invalidIndex = input.length() + 1; // Intentionally accessing an invalid index
        System.out.println("Character at index " + invalidIndex + ": " + input.charAt(invalidIndex));
    }

    public static void handleException(String input) {
        try {
            int invalidIndex = input.length() + 1;
            System.out.println("Character at index " + invalidIndex + ": " + input.charAt(invalidIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate and handle the exception
        generateException(userInput);
        handleException(userInput);
    }
}
