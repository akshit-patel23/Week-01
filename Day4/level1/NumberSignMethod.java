// Create NumberSignMethod class to check if a number is positive, negative, or zero
// Import Scanner class for taking user input
import java.util.Scanner;

class NumberSignMethod {
    
    // Method to check if a number is positive, negative, or zero
    private String checkNumber(int number) {
        if (number > 0) {
            // If the number is greater than zero, it's positive
            return "The number is positive.";
        } else if (number < 0) {
            // If the number is less than zero, it's negative
            return "The number is negative.";
        } else {
            // If the number is zero
            return "The number is zero.";
        }
    }

    public static void main(String[] args) {
        // Declare a variable to store the number
        int number;

        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Initiating object of class NumberSignMethod
        NumberSignMethod obj = new NumberSignMethod();

        // Printing the result by calling the checkNumber method
        System.out.println(obj.checkNumber(number));
    }
}
