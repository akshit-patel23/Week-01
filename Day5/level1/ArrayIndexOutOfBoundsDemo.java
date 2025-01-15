import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the exception
    public static void generateException(String[] names) {
        int invalidIndex = names.length + 1; // Accessing an index beyond array length
        System.out.println("Accessing index " + invalidIndex + ": " + names[invalidIndex]);
    }

    // Method to handle the exception using try-catch
    public static void handleException(String[] names) {
        try {
            int invalidIndex = names.length + 1;
            System.out.println("Accessing index " + invalidIndex + ": " + names[invalidIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call the methods to generate and handle the exception
        generateException(names);
        handleException(names);
    }
}
