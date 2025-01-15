import java.util.Scanner;

public class Illegal {


    public static void handleException(String input) {
        try {
            System.out.println("Creating IllegalArgumentException...");
            String result = input.substring(5, 2); // Start index is greater than end index
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Here we got an Exception: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Here we got Runtime Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.println("Enter a string: ");
        String userInput = sc.nextLine();

        // Calling methods

        // Handling exception
        handleException(userInput);

        sc.close();
    }
}