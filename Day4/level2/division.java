import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the first number (dividend): ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int number2 = input.nextInt();

        // if divisor is zero to avoid division by zero
        if (number2 != 0) {
            // Calculate the quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Display the results
            System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d.%n", 
                              quotient, remainder, number1, number2);
        } else {
            System.out.println("Division by zero is not allowed. Please enter a non-zero divisor.");
        }

    }
}
