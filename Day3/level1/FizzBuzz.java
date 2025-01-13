
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Check if the entered number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            
            String[] resultArray = new String[number + 1];

            
            for (int i = 1; i <= number; i++) {
                // Check number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    resultArray[i] = "FizzBuzz";
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    resultArray[i] = "Fizz";
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    resultArray[i] = "Buzz";
                }
                
                else {
                    resultArray[i] = String.valueOf(i);
                }
            }

            
            for (int i = 1; i <= number; i++) {
                System.out.println("Position " + i + " = " + resultArray[i]);
            }
        }

    }
}
