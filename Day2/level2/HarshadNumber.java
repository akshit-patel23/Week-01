//A program to check if a number taken from the user is a Harshad Number.
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitSum = 0; 
        int originalNumber = number;
		
        // Calculating the sum of the digits
        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10; 
            digitSum += lastDigit;              // Add the digit to the sum
            originalNumber /= 10;               // Remove the last digit
        }

        // Checking for harshad number
        if (number % digitSum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
}




